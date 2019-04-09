package com.alatheer.elmalekabdelaziz.Fragments;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.alatheer.elmalekabdelaziz.Activities.HomeActivity;
import com.alatheer.elmalekabdelaziz.R;
import com.alatheer.elmalekabdelaziz.Services.Tags;

import net.cachapa.expandablelayout.ExpandableLayout;

import java.util.Locale;



public class Fragment_Login extends Fragment {
    private static String TAG="USER_TYPE";
    private EditText edt_userName,edt_password;
    private String user_type ="";
    private TextView tv_reg;
    private ExpandableLayout expand_layout;
    private HomeActivity homeActivity;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login,container,false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        homeActivity = (HomeActivity) getActivity();
        Bundle bundle = getArguments();
        if (bundle!=null)
        {
            user_type = bundle.getString(TAG);
            Log.e("type",user_type);
        }
        edt_userName = view.findViewById(R.id.edt_userName);
        edt_password = view.findViewById(R.id.edt_password);
        expand_layout = view.findViewById(R.id.expand_layout);
        tv_reg = view.findViewById(R.id.tv_reg);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                expand_layout.expand(true);
            }
        },500);

        if (Locale.getDefault().getLanguage().equals("ar"))
        {
            edt_userName.setCompoundDrawablesWithIntrinsicBounds(0,0,R.drawable.user_icon,0);
            edt_password.setCompoundDrawablesWithIntrinsicBounds(0,0,R.drawable.pass_icon,0);
        }else
            {
                edt_userName.setCompoundDrawablesWithIntrinsicBounds(R.drawable.user_icon,0,0,0);
                edt_password.setCompoundDrawablesWithIntrinsicBounds(R.drawable.pass_icon,0,0,0);
            }

            tv_reg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (user_type)
                    {
                        case Tags.mostafeed:
                            homeActivity.ManageFragments(Tags.mostafeed,Tags.mostafeed);
                            break;
                        case Tags.kafeel:
                            homeActivity.ManageFragments(Tags.kafeel,Tags.kafeel);

                            break;
                        case Tags.mwazuf:
                            break;


                    }
                }
            });

    }


    public static Fragment_Login getInstance(String userType)
    {
        Fragment_Login fragment = new Fragment_Login();
        Bundle bundle = new Bundle();
        bundle.putString(TAG,userType);
        fragment.setArguments(bundle);
        return fragment;
    }
}
