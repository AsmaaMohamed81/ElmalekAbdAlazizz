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

import com.alatheer.elmalekabdelaziz.Adapters.ElectronicServicesDetailsAdapter;
import com.alatheer.elmalekabdelaziz.Adapters.MemberShipDetailsAdapter;
import com.alatheer.elmalekabdelaziz.Models.ElectronicServiceDetailsModel;
import com.alatheer.elmalekabdelaziz.Models.MemberShipDetailsModel;
import com.alatheer.elmalekabdelaziz.R;

import java.util.ArrayList;
import java.util.List;


public class Fragment_Electronic_Services_Details extends Fragment {
    RecyclerView.LayoutManager layoutManager;
    ElectronicServicesDetailsAdapter electronicServicesDetailsAdapter;
    List<ElectronicServiceDetailsModel> electronicServiceDetailsModelList;
    RecyclerView recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_fragment__electronic__services__details, container, false);
        initview(view);
        return view;
    }

    private void initview(View view) {
        electronicServiceDetailsModelList=new ArrayList<>();
        recyclerView=view.findViewById(R.id.service_details);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        electronicServicesDetailsAdapter=new ElectronicServicesDetailsAdapter(getActivity(),getlist());
        recyclerView.setAdapter(electronicServicesDetailsAdapter);

    }

    private List<ElectronicServiceDetailsModel> getlist() {
        Bundle bundle=getArguments();
        electronicServiceDetailsModelList= (List<ElectronicServiceDetailsModel>) bundle.getSerializable("aaa");
        return electronicServiceDetailsModelList;
    }
}
