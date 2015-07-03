package com.dgjw.acc;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ItemViewFragment extends Fragment {

    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_NAME = "item";

    private Nameable item;

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static ItemViewFragment newInstance(Parcelable item) {
        ItemViewFragment fragment = new ItemViewFragment();
        Bundle args = new Bundle();
        args.putParcelable(ARG_NAME, item);
        fragment.setArguments(args);

        return fragment;
    }

    public ItemViewFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_item_view, container, false);

        Item i = getArguments().getParcelable(ARG_NAME);

        TextView itemName = (TextView)rootView.findViewById(R.id.textView2);
        itemName.setText(i.getName());

        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

    }
}

