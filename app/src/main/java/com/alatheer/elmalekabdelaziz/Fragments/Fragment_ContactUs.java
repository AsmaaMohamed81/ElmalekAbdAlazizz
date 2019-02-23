package com.alatheer.elmalekabdelaziz.Fragments;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.alatheer.elmalekabdelaziz.R;
import com.alatheer.elmalekabdelaziz.Services.Tags;
import com.lamudi.phonefield.PhoneInputLayout;

import java.util.List;

/**
 * Created by elashry on 01/08/2018.
 */

public class Fragment_ContactUs extends Fragment {
    private EditText edt_name,edt_email,edt_phone,edt_subject,edt_message;
    private PhoneInputLayout edt_check_phone;
    private Button send_btn;
    private LinearLayout ll_whatsapp,ll_gmail;
    private String organization_email="emadmagdy.developer@gmail.com";
    private String organization_phone="+201008825497";


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contactus,container,false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        edt_name = view.findViewById(R.id.edt_name);
        edt_email = view.findViewById(R.id.edt_email);
        edt_phone = view.findViewById(R.id.edt_phone);
        edt_check_phone = view.findViewById(R.id.edt_check_phone);
        edt_subject = view.findViewById(R.id.edt_subject);
        edt_message = view.findViewById(R.id.edt_message);
        send_btn = view.findViewById(R.id.send_btn);
        ll_whatsapp = view.findViewById(R.id.ll_whatsapp);
        ll_gmail = view.findViewById(R.id.ll_gmail);


        send_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkDatafor_send(Tags.normal_send);
            }
        });
        ll_whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkDatafor_send(Tags.whats_send);
            }
        });
        ll_gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkDatafor_send(Tags.gmail_send);
            }
        });

    }

    private void checkDatafor_send(String type)
    {
        String m_name = edt_name.getText().toString();
        String m_email = edt_email.getText().toString();
        String m_phone = edt_phone.getText().toString();
        edt_check_phone.setPhoneNumber(m_phone);
        String m_subject = edt_subject.getText().toString();
        String m_msg = edt_message.getText().toString();

        if (TextUtils.isEmpty(m_name))
        {
            edt_name.setError("Name require");

        }else if (TextUtils.isEmpty(m_email))
        {
            edt_name.setError(null);
            edt_email.setError("Email require");
        }
        else if (!Patterns.EMAIL_ADDRESS.matcher(m_email).matches())
        {
            edt_name.setError(null);
            edt_email.setError("Invalid email");
        }else if (TextUtils.isEmpty(m_phone))
        {
            edt_name.setError(null);
            edt_email.setError(null);
            edt_phone.setError("Phone require");

        }else if (!edt_check_phone.isValid())
        {
            edt_name.setError(null);
            edt_email.setError(null);
            edt_phone.setError("Invalid phone");
        }else if (TextUtils.isEmpty(m_subject))
        {
            edt_name.setError(null);
            edt_email.setError(null);
            edt_phone.setError(null);
            edt_subject.setError("Subject require");
        }else if (TextUtils.isEmpty(m_msg))
        {
            edt_name.setError(null);
            edt_email.setError(null);
            edt_phone.setError(null);
            edt_message.setError("Message require");
        }else
            {
                edt_name.setError(null);
                edt_email.setError(null);
                edt_phone.setError(null);
                edt_message.setError(null);

                if (type.equals(Tags.normal_send))
                {
                    NormalSendData( m_name,m_email,m_phone,m_subject,m_msg);


                }else if (type.equals(Tags.gmail_send))
                {
                    GmailSendData(m_subject,m_msg);


                }else if (type.equals(Tags.whats_send))
                {
                    WhatsSendData(m_name,m_phone,m_subject,m_msg);

                }
            }



    }




    private void NormalSendData(String m_name, String m_email, String m_phone, String m_subject, String m_msg) {

    }
    private void GmailSendData(String m_subject, String m_msg) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL,new String[]{organization_email});
        intent.putExtra(Intent.EXTRA_SUBJECT,m_subject);
        intent.putExtra(Intent.EXTRA_TEXT,m_msg);
        PackageManager pm = getActivity().getPackageManager();
        List<ResolveInfo> resolveInfoList = pm.queryIntentActivities(intent,0);
        ResolveInfo resolveInfo = null;
        for (ResolveInfo resolveInfo1:resolveInfoList)
        {
            if (resolveInfo1.activityInfo.packageName.endsWith(".gm")||resolveInfo1.activityInfo.name.toLowerCase().contains("gmail"))
                resolveInfo=resolveInfo1;

            if (resolveInfo!=null)
                intent.setClassName(resolveInfo.activityInfo.packageName,resolveInfo.activityInfo.name);

            startActivity(intent);
        }
    }
    private void WhatsSendData(String m_name, String m_phone, String m_subject, String m_msg) {
        if (isWahtsInstall())
        {
            String phone_num = organization_phone.replace("+","");
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra("jid",phone_num+"@s.whatsapp.net");
            intent.putExtra(Intent.EXTRA_TEXT,m_name+"\n"+m_phone+"\n"+m_subject+"\n"+m_msg);
            intent.setPackage("com.whatsapp");

            if (intent.resolveActivity(getActivity().getPackageManager())==null)
            {
                return;
            }
            getActivity().startActivity(intent);
        }else
            {
                Toast.makeText(getActivity(), "Please install whatsaap", Toast.LENGTH_SHORT).show();
            }
    }


    private boolean isWahtsInstall()
    {
        PackageManager pm = getActivity().getPackageManager();
        try {
            pm.getPackageInfo("com.whatsapp",PackageManager.GET_ACTIVITIES);
            return true;
        }catch (PackageManager.NameNotFoundException e)
        {
            return false;
        }
    }

    public static Fragment_ContactUs getInstance()
    {
        Fragment_ContactUs fragment = new Fragment_ContactUs();
        return fragment;
    }
}
