package com.dgjw.acc;

import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by johnathon on 7/3/2015.
 */
public class ItemCategory {

    ArrayList<Item> items = new ArrayList<>();
    private String name;

    ItemCategory(String name, ArrayList<Item> items) {
        this.name  = name;
        this.items = items;
    }
}
