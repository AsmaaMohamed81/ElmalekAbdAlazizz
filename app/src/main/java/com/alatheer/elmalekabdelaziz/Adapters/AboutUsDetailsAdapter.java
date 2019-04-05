package com.alatheer.elmalekabdelaziz.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.alatheer.elmalekabdelaziz.Activities.HomeActivity;
import com.alatheer.elmalekabdelaziz.Models.AboutUsModel;
import com.alatheer.elmalekabdelaziz.Models.AboutUsDetailsModel;
import com.alatheer.elmalekabdelaziz.R;

import java.util.List;

/**
 * Created by M.Hamada on 28/03/2019.
 */

public class AboutUsDetailsAdapter extends RecyclerView.Adapter<AboutUsDetailsAdapter.AboutUsDetailsHolder>{
    List<AboutUsDetailsModel> aboutUsDetailsModels;
    Context context;
    private HomeActivity homeActivity;
    public AboutUsDetailsAdapter(List<AboutUsDetailsModel>aboutUsDetailsModels, Context context){
        this.aboutUsDetailsModels=aboutUsDetailsModels;
        this.context=context;
        this.homeActivity= (HomeActivity) context;
    }

    @NonNull
    @Override
    public AboutUsDetailsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AboutUsDetailsHolder(LayoutInflater.from(context).inflate(R.layout.about_us_details_raw,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull final AboutUsDetailsHolder holder, final int position) {
     holder.title.setText(aboutUsDetailsModels.get(position).getTitle());
     holder.details.setText(aboutUsDetailsModels.get(position).getDetails());
        holder.img.setImageResource(aboutUsDetailsModels.get(position).getImage());
     holder.itemView.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {


         }
     });
    }

    @Override
    public int getItemCount() {
        return aboutUsDetailsModels.size();
    }

    class AboutUsDetailsHolder extends RecyclerView.ViewHolder{
         TextView title,details;
         ImageView img;
        public AboutUsDetailsHolder(View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.txt_title);
            details=itemView.findViewById(R.id.txt_details);
            img=itemView.findViewById(R.id.image_details);
        }
    }

}
