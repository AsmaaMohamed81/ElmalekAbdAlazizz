package com.alatheer.charities.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.alatheer.charities.Models.SliderModel;
import com.alatheer.charities.R;
import com.github.siyamed.shapeimageview.RoundedImageView;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by elashry on 30/07/2018.
 */

public class SliderAdapter extends PagerAdapter {
    private List<SliderModel> sliderModelList;
    private Context context;

    public SliderAdapter(List<SliderModel> sliderModelList, Context context) {
        this.sliderModelList = sliderModelList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return sliderModelList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ViewPager viewPager = (ViewPager) container;
        viewPager.removeView((View) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        RoundedImageView image;
        TextView tv_title,tv_content;
        View view = LayoutInflater.from(context).inflate(R.layout.slider_row,container,false);
        image = view.findViewById(R.id.image);
        tv_title = view.findViewById(R.id.tv_title);
        tv_content = view.findViewById(R.id.tv_content);
        SliderModel sliderModel = sliderModelList.get(position);
        Picasso.with(context).load(sliderModel.getImage()).into(image);
        tv_title.setText(sliderModel.getTitle());
        tv_content.setText(sliderModel.getContent());

        ViewPager viewPager = (ViewPager) container;
        viewPager.addView(view,0);
        return view;
    }
}
