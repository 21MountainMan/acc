package com.dgjw.acc;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;


public class ItemCategoriesFragment extends Fragment {

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
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_item_categories, container, false);

        ArrayList<String> itemCategories;

        ACCompanion acc = new ACCompanion(rootView.getContext());
        itemCategories = acc.getItemCategories();

        ListView itemCategoriesListView = (ListView)rootView.findViewById(R.id.itemCategoriesListView);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                rootView.getContext(),
                android.R.layout.simple_list_item_1,
                itemCategories
        );

        itemCategoriesListView.setAdapter(arrayAdapter);

        itemCategoriesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final String itemCategory = (String)parent.getItemAtPosition(position);
                getFragmentManager().beginTransaction()
                        .replace(R.id.container,
                                ItemViewFragment.newInstance(new Item("myItem")))
                        .addToBackStack(null)
                        .commit(); // this should actually open up the list of items in the category. just opening an itemView for now
            }
        });

        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).onSectionAttached(
                getArguments().getInt(ARG_SECTION_NUMBER));
    }

}

