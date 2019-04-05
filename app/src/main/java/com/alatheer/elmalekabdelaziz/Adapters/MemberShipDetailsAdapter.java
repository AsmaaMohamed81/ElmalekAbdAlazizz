package com.alatheer.elmalekabdelaziz.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.alatheer.elmalekabdelaziz.Models.MemberShipDetailsModel;
import com.alatheer.elmalekabdelaziz.R;

import java.util.List;

/**
 * Created by M.Hamada on 03/04/2019.
 */

public class MemberShipDetailsAdapter extends RecyclerView.Adapter<MemberShipDetailsAdapter.MemberShipDetailsHolder>{
    Context context;
    List<MemberShipDetailsModel>memberShipDetailsModelList;

    public MemberShipDetailsAdapter(Context context, List<MemberShipDetailsModel> memberShipDetailsModelList) {
        this.context = context;
        this.memberShipDetailsModelList = memberShipDetailsModelList;
    }

    @NonNull
    @Override
    public MemberShipDetailsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(context).inflate(R.layout.mmebership_details_raw, parent, false);
        return new MemberShipDetailsHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MemberShipDetailsHolder holder, int position) {
          holder.txt_title.setText(memberShipDetailsModelList.get(position).getTitle());
          holder.txt_details.setText(memberShipDetailsModelList.get(position).getDetails());
    }

    @Override
    public int getItemCount() {
        return memberShipDetailsModelList.size();
    }

    class MemberShipDetailsHolder extends RecyclerView.ViewHolder{
        TextView txt_title,txt_details;
        public MemberShipDetailsHolder(View itemView) {
            super(itemView);
            txt_title=itemView.findViewById(R.id.txt_title);
            txt_details=itemView.findViewById(R.id.txt_details);
        }
    }
}
