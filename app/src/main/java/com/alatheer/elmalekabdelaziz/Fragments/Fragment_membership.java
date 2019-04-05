package com.alatheer.elmalekabdelaziz.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alatheer.elmalekabdelaziz.Adapters.MembershepAdapter;
import com.alatheer.elmalekabdelaziz.Models.MemberShipDetailsModel;
import com.alatheer.elmalekabdelaziz.Models.MemberShipModel;
import com.alatheer.elmalekabdelaziz.R;

import java.util.ArrayList;
import java.util.List;


public class Fragment_membership extends Fragment {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    MembershepAdapter membershepAdapter;
    List<MemberShipModel> memberShipModels;
    List<MemberShipDetailsModel>memberShipDetails;
    List<MemberShipDetailsModel>memberShipDetails2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_fragment_membership, container, false);
        initview(view);
        return view;
    }

    private void initview(View view) {
        memberShipModels=new ArrayList<>();
        memberShipDetails=new ArrayList<>();
        memberShipDetails2=new ArrayList<>();
        recyclerView=view.findViewById(R.id.recycler_membership);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        membershepAdapter = new MembershepAdapter(list_of_membership_model(),getActivity());
        recyclerView.setAdapter(membershepAdapter);
    }

    private List<MemberShipModel> list_of_membership_model() {
         memberShipModels.add(new MemberShipModel("العضوية",list_of_membership_Details()));
         memberShipModels.add(new MemberShipModel("الاشتراك بالجمعية",list_of_membership_Details2()));
         return memberShipModels;
    }
    private List<MemberShipDetailsModel> list_of_membership_Details() {
            memberShipDetails.add(new MemberShipDetailsModel("kkkkk","kkkkkk"));
            memberShipDetails.add(new MemberShipDetailsModel("mmmmm","mmmmmmm"));
            memberShipDetails.add(new MemberShipDetailsModel("llllll","llllll"));

            return memberShipDetails;
        }
    private List<MemberShipDetailsModel> list_of_membership_Details2() {
        memberShipDetails2.add(new MemberShipDetailsModel("mmm","mmm"));
        memberShipDetails2.add(new MemberShipDetailsModel("llll","llll"));
        return memberShipDetails2;
    }
    public static Fragment_membership getInstance()
    {
        Fragment_membership fragment = new Fragment_membership();
        return fragment;
    }
}
