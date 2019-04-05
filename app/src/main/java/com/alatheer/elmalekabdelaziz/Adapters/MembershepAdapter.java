package com.alatheer.elmalekabdelaziz.Adapters;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.alatheer.elmalekabdelaziz.Fragments.Fragment_Membership_Details;
import com.alatheer.elmalekabdelaziz.Fragments.Fragment_membership;
import com.alatheer.elmalekabdelaziz.Models.MemberShipDetailsModel;
import com.alatheer.elmalekabdelaziz.Models.MemberShipModel;
import com.alatheer.elmalekabdelaziz.R;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by M.Hamada on 03/04/2019.
 */

public class MembershepAdapter extends RecyclerView.Adapter<MembershepAdapter.MembershipHolder>{
    List<MemberShipModel>memberShipModelList;
    Context context;
    public MembershepAdapter(List<MemberShipModel> membershepAdapterList, Context context){
        this.context=context;
        this.memberShipModelList=membershepAdapterList;
    }
    @NonNull
    @Override
    public MembershipHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.about_us_raw,parent,false);
        MembershipHolder membershipHolder=new MembershipHolder(view);
        return membershipHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MembershipHolder holder, final int position) {

       holder.txt_name.setText(memberShipModelList.get(position).getName());
       Log.v("kkkkk","mmmm");
       holder.txt_name.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Bundle bundle=new Bundle();
               List<MemberShipDetailsModel>memberShipDetails=memberShipModelList.get(position).getMemberShipDetails();
               Fragment_Membership_Details fragment_membership_details=new Fragment_Membership_Details();
               bundle.putSerializable("aaa", (Serializable) memberShipDetails);
               fragment_membership_details.setArguments(bundle);
               ((FragmentActivity)context).getSupportFragmentManager().beginTransaction().replace(R.id.fragments_container,fragment_membership_details).commit();


           }
       });

    }

    @Override
    public int getItemCount() {
        return memberShipModelList.size();
    }

    class MembershipHolder extends RecyclerView.ViewHolder{
          TextView txt_name;
       public MembershipHolder(View itemView) {
           super(itemView);
           txt_name=itemView.findViewById(R.id.txt_name);
       }
   }
}

