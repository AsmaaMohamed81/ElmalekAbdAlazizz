package com.alatheer.elmalekabdelaziz.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.alatheer.elmalekabdelaziz.Models.ElectronicServiceDetailsModel;
import com.alatheer.elmalekabdelaziz.Models.MemberShipDetailsModel;
import com.alatheer.elmalekabdelaziz.R;

import java.util.List;

/**
 * Created by M.Hamada on 03/04/2019.
 */

public class ElectronicServicesDetailsAdapter extends RecyclerView.Adapter<ElectronicServicesDetailsAdapter.ElectronicServicesDetailsHolder>{
    Context context;

    public ElectronicServicesDetailsAdapter(Context context, List<ElectronicServiceDetailsModel> electronicServicesDetailsAdapterList) {
        this.context = context;
        this.electronicServicesDetailsAdapterList = electronicServicesDetailsAdapterList;
    }

    List<ElectronicServiceDetailsModel> electronicServicesDetailsAdapterList;
    @NonNull
    @Override
    public ElectronicServicesDetailsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ElectronicServicesDetailsAdapter.ElectronicServicesDetailsHolder(LayoutInflater.from(context).inflate(R.layout.about_us_raw,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ElectronicServicesDetailsHolder holder, int position) {
      holder.textView.setText(electronicServicesDetailsAdapterList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return electronicServicesDetailsAdapterList.size();
    }

    class ElectronicServicesDetailsHolder extends RecyclerView.ViewHolder{
         TextView textView;
        public ElectronicServicesDetailsHolder(View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.txt_name);
        }
    }
}
