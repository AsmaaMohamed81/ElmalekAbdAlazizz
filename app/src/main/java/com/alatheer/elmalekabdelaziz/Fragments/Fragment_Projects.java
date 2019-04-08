package com.alatheer.elmalekabdelaziz.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alatheer.elmalekabdelaziz.Adapters.ProjectsAdapter;
import com.alatheer.elmalekabdelaziz.Models.Projcts_Model;
import com.alatheer.elmalekabdelaziz.R;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

import android.support.v4.app.Fragment;

public class Fragment_Projects extends Fragment {


    private RecyclerView recycler;
    private ProjectsAdapter projectsAdapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_aboutus,container,false);

        initView(view);
        return view;
    }


    public static Fragment_Projects getInstance(){

        return new Fragment_Projects();
    }

    private void initView(View view) {

        recycler=view.findViewById(R.id.recycler);

        recycler.setLayoutManager(new LinearLayoutManager(getActivity()));

        projectsAdapter=new ProjectsAdapter(getActivity(),listModel());

        recycler.setAdapter(projectsAdapter);


    }

    private List<Projcts_Model> listModel(){
        List<Projcts_Model> projcts_list =new ArrayList<>();
        projcts_list.add(new Projcts_Model(R.drawable.image,"كفاله ايتام"," عدد الكفلاء :","100","عدد المستفادين","200","الأرملة هى من تحمل مهام الأمومة والأبوة معاَ , عليها مسئولية عظيمة تجاه أطفالها و أبنائها تعيش مع دقات الزمن…"));
        projcts_list.add(new Projcts_Model(R.drawable.news, "كفاله ارمله"," عدد الكفلاء :","400","عدد المستفادين","600","الأرملة هى من تحمل مهام الأمومة والأبوة معاَ , عليها مسئولية عظيمة تجاه أطفالها و أبنائها تعيش مع دقات الزمن…"));
        projcts_list.add(new Projcts_Model(R.drawable.service,"كفاله ايتام"," عدد الكفلاء :","500","عدد المستفادين","200","الأرملة هى من تحمل مهام الأمومة والأبوة معاَ , عليها مسئولية عظيمة تجاه أطفالها و أبنائها تعيش مع دقات الزمن…"));
        projcts_list.add(new Projcts_Model(R.drawable.kafalat, "كفاله ارمله"," عدد الكفلاء :","100","عدد المستفادين","200","الأرملة هى من تحمل مهام الأمومة والأبوة معاَ , عليها مسئولية عظيمة تجاه أطفالها و أبنائها تعيش مع دقات الزمن…"));
        projcts_list.add(new Projcts_Model(R.drawable.service,"كفاله ايتام"," عدد الكفلاء :","100","عدد المستفادين","200","الأرملة هى من تحمل مهام الأمومة والأبوة معاَ , عليها مسئولية عظيمة تجاه أطفالها و أبنائها تعيش مع دقات الزمن…"));
        projcts_list.add(new Projcts_Model(R.drawable.kafalat, "كفاله ارمله"," عدد الكفلاء :","100","عدد المستفادين","200","الأرملة هى من تحمل مهام الأمومة والأبوة معاَ , عليها مسئولية عظيمة تجاه أطفالها و أبنائها تعيش مع دقات الزمن…"));


        return projcts_list;


    }
}
