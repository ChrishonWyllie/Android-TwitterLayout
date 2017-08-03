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

public class FragmentOne extends Fragment {

    // Declare new ArrayList object to hold data that will be shown in recyclerview
    // In Twitter, this likely holds some Custom Object such as "Twitter-Feed-Item"
    private List<String> recyclerViewData;

    // Declare RecyclerView widget that is present in this fragment
    private RecyclerView recyclerView;

    // Declare RecyclerViewAdapter object. This is a custom RecyclerView.Adapter
    // It could have been named anything, such as "TwitterHomeFeedAdapter"
    private RecyclerViewAdapter adapter;


    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    public FragmentOne() {}

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static FragmentOne newInstance(int sectionNumber) {
        FragmentOne fragment = new FragmentOne();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Instantiate ArrayList
        recyclerViewData = new ArrayList<String>();

        // This function does what its method signature says, creates some dummy data to be displayed in recycler view
        createSomeDummyDataForRecyclerView();

        // Inflate view from fragment_one.xml
        View rootView = inflater.inflate(R.layout.fragment_one, container, false);

        // Instantiate RecyclerView from rootView (fragment_one.xml)
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerview);

        // Instantiate adapter to display data
        adapter = new RecyclerViewAdapter(recyclerViewData, getActivity());

        // Set the adapter for the recyclerview
        recyclerView.setAdapter(adapter);

        // Set which kind of layout this recycler view will display.
        // A GridLayoutManager is capable of displaying rows with multiple columns like an image gallery
        // A StaggeredGridLayoutManager does what the above does as well, but with uneven row heights
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        // finally return the rootview
        return rootView;
    }


    public void createSomeDummyDataForRecyclerView() {
        recyclerViewData.add("This is an example of an app with a similar layout as Twitter");
        recyclerViewData.add("I do not own any of these images, nor do I expect to earn any sort of compensation");
        recyclerViewData.add("This is just a demo");
        recyclerViewData.add("In a real app, these would likely be images or videos that are loaded from some remote database");
        recyclerViewData.add("Or perhaps, data loaded from REST API");
        recyclerViewData.add("Try scrolling down");
        recyclerViewData.add("The toolbar will hide itself");
        recyclerViewData.add("The toolbar should have some personal content for each fragment");

    }
}
