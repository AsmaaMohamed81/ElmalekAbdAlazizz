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

import com.alatheer.elmalekabdelaziz.Adapters.MemberShipDetailsAdapter;
import com.alatheer.elmalekabdelaziz.Adapters.MembershepAdapter;
import com.alatheer.elmalekabdelaziz.Models.MemberShipDetailsModel;
import com.alatheer.elmalekabdelaziz.R;

import java.util.ArrayList;
import java.util.List;


public class Fragment_Membership_Details extends Fragment {
    RecyclerView.LayoutManager layoutManager;
    MemberShipDetailsAdapter memberShipDetailsAdapter;
    List<MemberShipDetailsModel> memberShipDetails;
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_fragment__membership__details, container, false);
        initview(view);
        return view;
    }

    private void initview(View view) {
        memberShipDetails=new ArrayList<>();
        recyclerView=view.findViewById(R.id.rec_member_details);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        memberShipDetailsAdapter=new MemberShipDetailsAdapter(getContext(),getlist());
        recyclerView.setAdapter(memberShipDetailsAdapter);
    }

    private List<MemberShipDetailsModel> getlist() {
        Bundle bundle=getArguments();
        memberShipDetails= (List<MemberShipDetailsModel>) bundle.getSerializable("aaa");
        return memberShipDetails;
    }
}
