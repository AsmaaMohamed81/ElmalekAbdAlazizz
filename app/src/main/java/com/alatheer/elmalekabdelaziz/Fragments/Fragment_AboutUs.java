package com.alatheer.elmalekabdelaziz.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alatheer.elmalekabdelaziz.Adapters.AboutUsAdapter;
import com.alatheer.elmalekabdelaziz.Models.AboutUsModel;
import com.alatheer.elmalekabdelaziz.Models.CategoryName;
import com.alatheer.elmalekabdelaziz.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by elashry on 01/08/2018.
 */

public class Fragment_AboutUs extends Fragment {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    AboutUsAdapter aboutUsAdapter;
    List<AboutUsModel>aboutUsModels;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_aboutus,container,false);
        initview(view);
        return view;
    }

    private void initview(View view) {
        aboutUsModels=new ArrayList<>();
        recyclerView=view.findViewById(R.id.about_us_recycler);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        aboutUsAdapter =new AboutUsAdapter(listofaboutUsModel(),getActivity());
        recyclerView.setAdapter(aboutUsAdapter);


    }

    public static Fragment_AboutUs getInstance()
    {
        Fragment_AboutUs fragment = new Fragment_AboutUs();
        return fragment;
    }
    public List<AboutUsModel>listofaboutUsModel(){
        aboutUsModels.add(new AboutUsModel(new CategoryName("كلمة الرئيس الفخري","kkkkkkkk","kkkkkkkk",R.drawable.fysel_bn_mashal)));
        aboutUsModels.add(new AboutUsModel(new CategoryName("اعضاء مجلس الادارة","llllllll","llllllll",R.drawable.fysel_bn_mashal)));
        aboutUsModels.add(new AboutUsModel(new CategoryName("موظفي اللجنة التنفيذيين","mmmmmmmm","mmmmmmmm",R.drawable.fysel_bn_mashal)));
        aboutUsModels.add(new AboutUsModel(new CategoryName("الهيكل التنظيمي العام","nnnnnnnn","nnnnnnnn",R.drawable.fysel_bn_mashal)));
        return aboutUsModels;
    }

}
