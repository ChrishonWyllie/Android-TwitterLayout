package com.chrishonwyllie.twitterlayout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;



public class FragmentFour extends Fragment {


    private List<String> recyclerViewData;
    private RecyclerView recyclerView;
    private RecyclerViewAdapter adapter;


    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    public FragmentFour() {}

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static FragmentFour newInstance(int sectionNumber) {
        FragmentFour fragment = new FragmentFour();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        recyclerViewData = new ArrayList<String>();
        createSomeDummyDataForRecyclerView();
        View rootView = inflater.inflate(R.layout.fragment_four, container, false);

        recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerview);
        adapter = new RecyclerViewAdapter(recyclerViewData, getActivity());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        /*
        new Thread(new Runnable() {
            @Override
            public void run() {
                // do some work here

                //createSomeDummyDataForRecyclerView();

                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        adapter = new RecyclerViewAdapter(recyclerViewData, getActivity());
                        recyclerView.setAdapter(adapter);
                        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
                    }
                });
            }
        }).start();

        //createSomeDummyDataForRecyclerView();
        */


        return rootView;
    }


    public void createSomeDummyDataForRecyclerView() {
        recyclerViewData.add("List data for recyclerview four");
        recyclerViewData.add("List data for recyclerview four");
        recyclerViewData.add("List data for recyclerview four");
        recyclerViewData.add("List data for recyclerview four");
        recyclerViewData.add("List data for recyclerview four");
        recyclerViewData.add("List data for recyclerview four");
        recyclerViewData.add("List data for recyclerview four");
        recyclerViewData.add("List data for recyclerview four");
        recyclerViewData.add("List data for recyclerview four");
        recyclerViewData.add("List data for recyclerview four");
        recyclerViewData.add("List data for recyclerview four");
        recyclerViewData.add("List data for recyclerview four");
        recyclerViewData.add("List data for recyclerview four");

        recyclerViewData.add("List data for recyclerview four");
        recyclerViewData.add("List data for recyclerview four");
        recyclerViewData.add("List data for recyclerview four");
        recyclerViewData.add("List data for recyclerview four");
        recyclerViewData.add("List data for recyclerview four");
        recyclerViewData.add("List data for recyclerview four");
        recyclerViewData.add("List data for recyclerview four");
        recyclerViewData.add("List data for recyclerview four");
        recyclerViewData.add("List data for recyclerview four");
        recyclerViewData.add("List data for recyclerview four");
        recyclerViewData.add("List data for recyclerview four");
        recyclerViewData.add("List data for recyclerview four");
        recyclerViewData.add("List data for recyclerview four");

        recyclerViewData.add("List data for recyclerview four");
        recyclerViewData.add("List data for recyclerview four");
        recyclerViewData.add("List data for recyclerview four");
        recyclerViewData.add("List data for recyclerview four");
        recyclerViewData.add("List data for recyclerview four");
        recyclerViewData.add("List data for recyclerview four");
        recyclerViewData.add("List data for recyclerview four");
        recyclerViewData.add("List data for recyclerview four");
        recyclerViewData.add("List data for recyclerview four");
        recyclerViewData.add("List data for recyclerview four");
        recyclerViewData.add("List data for recyclerview four");
        recyclerViewData.add("List data for recyclerview four");
        recyclerViewData.add("List data for recyclerview four");

    }
}
