package com.alatheer.elmalekabdelaziz.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.alatheer.elmalekabdelaziz.R;

public class Fragment_Register_kafeel extends Fragment {

    private WebView webView;

    public static Fragment_Register_kafeel getInstance() {
        Fragment_Register_kafeel fragment=new Fragment_Register_kafeel();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_kafeel_register,container,false);

        initView(view);

        return view;
    }

    private void initView(View view) {
        webView=view.findViewById(R.id.webview);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://kawccq-sa.org/Web/add_kafel");

    }


}
