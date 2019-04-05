package com.alatheer.elmalekabdelaziz.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alatheer.elmalekabdelaziz.Adapters.AboutUsDetailsAdapter;
import com.alatheer.elmalekabdelaziz.Models.AboutUsDetailsModel;
import com.alatheer.elmalekabdelaziz.R;

import java.util.ArrayList;
import java.util.List;


public class Fragment_AboutUs_Details extends Fragment {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    AboutUsDetailsAdapter aboutUsDetailsAdapter;
    List<AboutUsDetailsModel> AboutUsDetailsModels;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment__about_ua__details, container, false);
        initview(view);
        return view;
    }

    private void initview(View view) {
        AboutUsDetailsModels=new ArrayList<>();
        recyclerView=view.findViewById(R.id.about_us__details_recycler);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        Bundle bundle=getArguments();
        String title = bundle.getString("title");
        String details=bundle.getString("details");
        int image=bundle.getInt("image");
        aboutUsDetailsAdapter =new AboutUsDetailsAdapter(listofaboutUsDetailsModel(title,details,image),getActivity());
        recyclerView.setAdapter(aboutUsDetailsAdapter);

    }

    //private List<AboutUsDetailsModel> listofaboutUsDetailsModel(String title,String details, int image) {
    private List<AboutUsDetailsModel> listofaboutUsDetailsModel(String title, String details, int image){
        //AboutUsDetailsModels.add(new AboutUsDetailsModel(title,details,image));
       //Bundle bundle=getArguments();
       /* String title = bundle.getString("title");
        String details=bundle.getString("details");
        int image=bundle.getInt("image");*/
        AboutUsDetailsModels.add(new AboutUsDetailsModel(title,details,image));
        /*AboutUsDetailsModels.add(new AboutUsDetailsModel("كلمة صاحب السمو الملكي الأمير الدكتور فيصل بن مشعل بن سعود بن عبدالعزيز آل سعود أمير منطقة القصيم",
          "الرئيس الفخري للجمعية صاحب السمو الملكي الأمير الدكتور فيصل بن مشعل بن سعود بن عبدالعزيز آل سعود أمير منطقة القصيم" ,R.drawable.fysel_bn_mashal));
        AboutUsDetailsModels.add(new AboutUsDetailsModel("mmmmmmm","llllll",R.drawable.image));*/

        return AboutUsDetailsModels;
    }

    public static Fragment_AboutUs_Details getInstance()
    {
        Fragment_AboutUs_Details fragment = new Fragment_AboutUs_Details();
        return fragment;
    }
}
