package com.alatheer.charities.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.alatheer.charities.R;

import java.util.Locale;

/**
 * Created by elashry on 01/08/2018.
 */

public class Fragment_Login extends Fragment {
    private static String TAG="USER_TYPE";
    private EditText edt_userName,edt_password;
    private String user_type ="";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login,container,false);
        initView(view);
        return view;
    }

    private void initView(View view) {

        Bundle bundle = getArguments();
        if (bundle!=null)
        {
            user_type = bundle.getString(TAG);
            Log.e("type",user_type);
        }
        edt_userName = view.findViewById(R.id.edt_userName);
        edt_password = view.findViewById(R.id.edt_password);


        if (Locale.getDefault().getLanguage().equals("ar"))
        {
            edt_userName.setCompoundDrawablesWithIntrinsicBounds(0,0,R.drawable.user_icon,0);
            edt_password.setCompoundDrawablesWithIntrinsicBounds(0,0,R.drawable.pass_icon,0);
        }else
            {
                edt_userName.setCompoundDrawablesWithIntrinsicBounds(R.drawable.user_icon,0,0,0);
                edt_password.setCompoundDrawablesWithIntrinsicBounds(R.drawable.pass_icon,0,0,0);
            }

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
