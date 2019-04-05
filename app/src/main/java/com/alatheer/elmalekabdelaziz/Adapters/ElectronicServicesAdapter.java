package com.alatheer.elmalekabdelaziz.Adapters;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.alatheer.elmalekabdelaziz.Fragments.Fragment_Electronic_Services_Details;
import com.alatheer.elmalekabdelaziz.Fragments.Fragment_Membership_Details;
import com.alatheer.elmalekabdelaziz.Models.ElectronicServiceDetailsModel;
import com.alatheer.elmalekabdelaziz.Models.ElectronicServiceModel;
import com.alatheer.elmalekabdelaziz.R;

import java.io.Serializable;
import java.util.List;

/**
 * Created by M.Hamada on 03/04/2019.
 */

public class ElectronicServicesAdapter extends RecyclerView.Adapter<ElectronicServicesAdapter.ElectronicServicesHolder> {
    List<ElectronicServiceModel> electronicServiceModelList;
    Context context;

    public ElectronicServicesAdapter(List<ElectronicServiceModel> electronicServiceModelList, Context context) {
        this.electronicServiceModelList = electronicServiceModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public ElectronicServicesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ElectronicServicesHolder(LayoutInflater.from(context).inflate(R.layout.about_us_raw,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ElectronicServicesHolder holder, final int position) {
     holder.txt_name.setText(electronicServiceModelList.get(position).getName());
     holder.txt_name.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Bundle bundle=new Bundle();
             List<ElectronicServiceDetailsModel>electronicServiceDetailsModelList=electronicServiceModelList.get(position).getElectronicServiceDetailsModelList();
             Fragment_Electronic_Services_Details fragment_Electronic_Services_Details=new Fragment_Electronic_Services_Details();
             bundle.putSerializable("aaa", (Serializable) electronicServiceDetailsModelList);
             fragment_Electronic_Services_Details.setArguments(bundle);
             ((FragmentActivity)context).getSupportFragmentManager().beginTransaction().replace(R.id.fragments_container,fragment_Electronic_Services_Details).commit();

         }
     });
    }

    @Override
    public int getItemCount() {
        return electronicServiceModelList.size();
    }


    class ElectronicServicesHolder extends RecyclerView.ViewHolder{
        TextView txt_name;
        public ElectronicServicesHolder(View itemView) {
            super(itemView);
            txt_name=itemView.findViewById(R.id.txt_name);
        }
    }

}
