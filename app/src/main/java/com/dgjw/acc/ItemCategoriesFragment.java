package com.dgjw.acc;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;


public class ItemCategoriesFragment extends Fragment {

    private ArrayList<ItemCategory> itemCategories;
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static ItemCategoriesFragment newInstance(int sectionNumber) {
        ItemCategoriesFragment fragment = new ItemCategoriesFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public ItemCategoriesFragment() {
        itemCategories = new ArrayList<>();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_item_categories, container, false);

        ListView itemCategoriesListView = (ListView)rootView.findViewById(R.id.itemCategoriesListView);

        ArrayAdapter<ItemCategory> arrayAdapter = new ArrayAdapter<ItemCategory>( // may have to replace with baseadapter
                rootView.getContext(),
                android.R.layout.simple_list_item_1,
                itemCategories
        );

        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).onSectionAttached(
                getArguments().getInt(ARG_SECTION_NUMBER));
    }

    public void setList(ArrayList<ItemCategory> arrayList) {
        itemCategories = arrayList;
        updateListView();
    }

    public void updateListView() {
        ListView list = (ListView)getActivity().findViewById(R.id.itemCategoriesListView);
        ((ArrayAdapter<ItemCategory>)list.getAdapter()).notifyDataSetChanged();
    }
}

