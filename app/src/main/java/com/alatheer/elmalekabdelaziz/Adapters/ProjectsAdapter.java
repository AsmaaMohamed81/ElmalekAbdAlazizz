package com.alatheer.elmalekabdelaziz.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.alatheer.elmalekabdelaziz.Models.Projcts_Model;
import com.alatheer.elmalekabdelaziz.R;

import java.util.List;

public class ProjectsAdapter extends RecyclerView.Adapter<ProjectsAdapter.MyHolder>{

    Context context;
    List<Projcts_Model> list;
    Projcts_Model projcts_model;

    public ProjectsAdapter(Context context, List<Projcts_Model> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_projects,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {

        projcts_model=list.get(position);
        holder.BindData(projcts_model);


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder{

        TextView item1,desc_item1,item2,desc_item2,title,description;
        ImageView image;
        public MyHolder(View itemView) {
            super(itemView);
            item1=itemView.findViewById(R.id.item1);
            item2=itemView.findViewById(R.id.item2);
            desc_item1=itemView.findViewById(R.id.desc_item1);
            desc_item2=itemView.findViewById(R.id.desc_item2);
            title=itemView.findViewById(R.id.item_title);
            description=itemView.findViewById(R.id.description);
            image=itemView.findViewById(R.id.item_image);


        }

        public void BindData(Projcts_Model projcts_model) {

            item1.setText(projcts_model.getItem1());
            item2.setText(projcts_model.getItem2());

            desc_item1.setText(projcts_model.getDesc_item1());
            desc_item2.setText(projcts_model.getDesc_item2());

            title.setText(projcts_model.getTitle());
            description.setText(projcts_model.getDescription());

            image.setImageResource(projcts_model.getImage());


        }
    }
}
