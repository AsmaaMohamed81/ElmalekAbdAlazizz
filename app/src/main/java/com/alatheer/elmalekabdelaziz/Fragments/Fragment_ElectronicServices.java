package com.alatheer.elmalekabdelaziz.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alatheer.elmalekabdelaziz.Adapters.ElectronicServicesAdapter;
import com.alatheer.elmalekabdelaziz.Adapters.MembershepAdapter;
import com.alatheer.elmalekabdelaziz.Models.ElectronicServiceDetailsModel;
import com.alatheer.elmalekabdelaziz.Models.ElectronicServiceModel;
import com.alatheer.elmalekabdelaziz.Models.MemberShipDetailsModel;
import com.alatheer.elmalekabdelaziz.Models.MemberShipModel;
import com.alatheer.elmalekabdelaziz.R;

import java.util.ArrayList;
import java.util.List;


public class Fragment_ElectronicServices extends Fragment {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    ElectronicServicesAdapter electronicServicesAdapter;
    List<ElectronicServiceModel> electronicServiceModelList;
    List<ElectronicServiceDetailsModel> electronicServiceDetailsModelList;
    List<ElectronicServiceDetailsModel> electronicServiceDetailsModelList2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment__electronic_services, container, false);
        initview(view);
        return view;
    }

    private void initview(View view) {
        electronicServiceModelList = new ArrayList<>();
        electronicServiceDetailsModelList = new ArrayList<>();
        electronicServiceDetailsModelList2 = new ArrayList<>();
        recyclerView = view.findViewById(R.id.recycler_electronic_service);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        electronicServicesAdapter = new ElectronicServicesAdapter(list_of_electronicservice_model(), getActivity());
        recyclerView.setAdapter(electronicServicesAdapter);
    }

    private List<ElectronicServiceModel> list_of_electronicservice_model() {
        electronicServiceModelList.add(new ElectronicServiceModel("خدمة الكفلاء", list_of_electronicserviceDetails_model()));
        electronicServiceModelList.add(new ElectronicServiceModel("خدمة الاسر", list_of_electronicserviceDetails_model2()));
        return electronicServiceModelList;
    }

    private List<ElectronicServiceDetailsModel> list_of_electronicserviceDetails_model() {
        electronicServiceDetailsModelList.add(new ElectronicServiceDetailsModel("دخول كفلاء"));
        electronicServiceDetailsModelList.add(new ElectronicServiceDetailsModel("تسجيل كفيل"));
        return electronicServiceDetailsModelList;

    }

    private List<ElectronicServiceDetailsModel> list_of_electronicserviceDetails_model2() {
        electronicServiceDetailsModelList2.add(new ElectronicServiceDetailsModel("دخول مستفيدين"));
        electronicServiceDetailsModelList2.add(new ElectronicServiceDetailsModel("تسجيل اسرة"));
        return electronicServiceDetailsModelList2;


    }
    public static Fragment_ElectronicServices getInstance()
    {
        Fragment_ElectronicServices fragment = new Fragment_ElectronicServices();
        return fragment;
    }
}