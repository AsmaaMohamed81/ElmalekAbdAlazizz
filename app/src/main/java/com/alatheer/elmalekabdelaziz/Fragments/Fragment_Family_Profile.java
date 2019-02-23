package com.alatheer.elmalekabdelaziz.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alatheer.elmalekabdelaziz.R;

/**
 * Created by elashry on 01/08/2018.
 */

public class Fragment_Family_Profile extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_family_profile,container,false);
        return view;
    }

    public static Fragment_Family_Profile getInstance()
    {
        Fragment_Family_Profile fragment = new Fragment_Family_Profile();
        return fragment;
    }
}
