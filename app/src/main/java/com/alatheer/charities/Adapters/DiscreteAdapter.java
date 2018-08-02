package com.alatheer.charities.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.alatheer.charities.Activities.HomeActivity;
import com.alatheer.charities.Models.DiscreteModel;
import com.alatheer.charities.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by elashry on 30/07/2018.
 */

public class DiscreteAdapter extends RecyclerView.Adapter<DiscreteAdapter.Holder> {

    private List<DiscreteModel> discreteModelList;
    private Context context;
    private HomeActivity homeActivity;

    public DiscreteAdapter(List<DiscreteModel> discreteModelList, Context context) {
        this.discreteModelList = discreteModelList;
        this.context = context;
        this.homeActivity = (HomeActivity) context;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.discrete_row,parent,false);
        return  new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, final int position) {
        holder.Bind(discreteModelList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                homeActivity.setSelectDiscretePos(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return discreteModelList.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        private CircleImageView image;
        private TextView tv_title;
        public Holder(View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            tv_title = itemView.findViewById(R.id.tv_title);
        }

        public void Bind(DiscreteModel discreteModel)
        {
            Picasso.with(context).load(discreteModel.getImage()).into(image);
            tv_title.setText(discreteModel.getTitle());
        }
    }
}
