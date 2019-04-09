package com.alatheer.elmalekabdelaziz.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alatheer.elmalekabdelaziz.R;



public class Fragment_Programs extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_programs,container,false);
        return view;
    }

    public static Fragment_Programs getInstance()
    {
        Fragment_Programs fragment = new Fragment_Programs();
        return fragment;
    }
}
