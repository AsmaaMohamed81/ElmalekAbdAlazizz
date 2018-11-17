package com.alatheer.charities.Fragments;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.alatheer.charities.Activities.HomeActivity;
import com.alatheer.charities.R;

import net.cachapa.expandablelayout.ExpandableLayout;

import java.util.Locale;

/**
 * Created by elashry on 01/08/2018.
 */

public class Fragment_Register_family extends Fragment {
    private static String TAG="USER_TYPE";
    private EditText edt_userName,edt_password,edt_phone,edt_confirm_password,edt_id_mother,edt_place_sign;
    private TextView txt_sign;
    private LinearLayout ll_login;
    private ExpandableLayout expand_layout;
    private HomeActivity homeActivity;




    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_register_family,container,false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        homeActivity = (HomeActivity) getActivity();
        ll_login = view.findViewById(R.id.ll_login);
        expand_layout = view.findViewById(R.id.expand_layout);
        edt_userName = view.findViewById(R.id.edt_userName);
        edt_password = view.findViewById(R.id.edt_password);
        edt_phone = view.findViewById(R.id.edt_phone);
        edt_id_mother=view.findViewById(R.id.edt_id_mother);
        edt_confirm_password=view.findViewById(R.id.edt_confirm_password);
        edt_place_sign=view.findViewById(R.id.edt_place_sign);

        ll_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                homeActivity.Back_To_Previous_Fragment();
            }
        });
        if (Locale.getDefault().getLanguage().equals("ar"))
        {
            edt_id_mother.setCompoundDrawablesWithIntrinsicBounds(0,0,R.drawable.edit_icon,0);
            edt_userName.setCompoundDrawablesWithIntrinsicBounds(0,0,R.drawable.user_icon,0);
            edt_password.setCompoundDrawablesWithIntrinsicBounds(0,0,R.drawable.pass_icon,0);
            edt_confirm_password.setCompoundDrawablesWithIntrinsicBounds(0,0,R.drawable.lock_icon,0);
            edt_phone.setCompoundDrawablesWithIntrinsicBounds(0,0,R.drawable.phone_icon,0);
            edt_place_sign.setCompoundDrawablesWithIntrinsicBounds(0,0,R.drawable.location_icon,0);

        }else
            {

                edt_id_mother.setCompoundDrawablesWithIntrinsicBounds(R.drawable.edit_icon,0,0,0);
                edt_userName.setCompoundDrawablesWithIntrinsicBounds(R.drawable.user_icon,0,0,0);
                edt_password.setCompoundDrawablesWithIntrinsicBounds(R.drawable.pass_icon,0,0,0);
                edt_confirm_password.setCompoundDrawablesWithIntrinsicBounds(R.drawable.lock_icon,0,0,0);
                edt_phone.setCompoundDrawablesWithIntrinsicBounds(R.drawable.phone_icon,0,0,0);
                edt_place_sign.setCompoundDrawablesWithIntrinsicBounds(R.drawable.location_icon,0,0,0);



            }

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    expand_layout.expand(true);
                }
            },500);


    }

    public static Fragment_Register_family getInstance()
    {
        Fragment_Register_family fragment = new Fragment_Register_family();
        return fragment;
    }
}
