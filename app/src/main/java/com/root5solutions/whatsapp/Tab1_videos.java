package com.root5solutions.whatsapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tab1_videos extends Fragment {


    public Tab1_videos() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.tab1_videos, container, false);

        RecyclerView rv = (RecyclerView) v.findViewById(R.id.home_recyclerview);
        LinearLayoutManager llm = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true); // to improve performance
        rv.setAdapter(new VideoManager()); // the projectdatabase manager is assigner to the RV

        RecyclerView grid = (RecyclerView) v.findViewById(R.id.home_recyclerview2);
        LinearLayoutManager llm2 = new GridLayoutManager(getContext(),2);
        grid.setLayoutManager(llm2);
        grid.setHasFixedSize(true); // to improve performance
        grid.setAdapter(new VideoManager()); // the projectdatabase manager is assigner to the RV

        return v;
    }


}
