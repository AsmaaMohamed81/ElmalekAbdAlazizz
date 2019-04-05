package com.alatheer.elmalekabdelaziz.Adapters;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.alatheer.elmalekabdelaziz.Activities.HomeActivity;
import com.alatheer.elmalekabdelaziz.Fragments.Fragment_AboutUs_Details;
import com.alatheer.elmalekabdelaziz.Models.AboutUsDetailsModel;
import com.alatheer.elmalekabdelaziz.Models.AboutUsModel;
import com.alatheer.elmalekabdelaziz.R;

import java.util.List;

/**
 * Created by M.Hamada on 27/03/2019.
 */

public class AboutUsAdapter extends RecyclerView.Adapter<AboutUsAdapter.Who_Are_WeHolder> {
    List<AboutUsModel>aboutUsModels;
    Context context;
    private HomeActivity homeActivity;
    public AboutUsAdapter(List<AboutUsModel> aboutUsModels, Context context){
        this.aboutUsModels=aboutUsModels;
        this.context=context;
        this.homeActivity= (HomeActivity) context;
    }
    @NonNull
    @Override
    public Who_Are_WeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Who_Are_WeHolder(LayoutInflater.from(context).inflate(R.layout.about_us_raw,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull final Who_Are_WeHolder holder, final int position) {
        final String name = aboutUsModels.get(position).getCategoryName().getName();
        final String title=aboutUsModels.get(position).getCategoryName().getTitle();
        final String details=aboutUsModels.get(position).getCategoryName().getDescription();
        final int image=aboutUsModels.get(position).getCategoryName().getImage();
        holder.txt_name.setText(name);
        holder.txt_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.txt_name.setTextColor(context.getResources().getColor(R.color.white));
                holder.txt_name.setBackground(context.getResources().getDrawable(R.color.colorPrimary));
                Bundle bundle=new Bundle();
                bundle.putString("title",title);
                bundle.putString("details",details);
                bundle.putInt("image",image);
                Fragment_AboutUs_Details fragment_aboutUs_details=new Fragment_AboutUs_Details();
                fragment_aboutUs_details.setArguments(bundle);
                ((FragmentActivity)context).getSupportFragmentManager().beginTransaction().replace(R.id.fragments_container,fragment_aboutUs_details).commit();

            }
        });

    }

    @Override
    public int getItemCount() {
        return aboutUsModels.size();
    }

    class Who_Are_WeHolder extends RecyclerView.ViewHolder{
          TextView txt_name;
        public Who_Are_WeHolder(View itemView) {
            super(itemView);
            txt_name=itemView.findViewById(R.id.txt_name);
        }
    }
}
