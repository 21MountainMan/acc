package com.dgjw.acc;

import java.util.ArrayList;


/**
 * Created by johnathon on 7/3/2015.
 */
public class ItemCategory {

    ArrayList<Item> items = new ArrayList<>();
    private String name;

    ItemCategory(String name) {
        this.name  = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void addItem(Item i) {
        items.add(i);
    }

    public void listItems() {
        System.out.println(name + ": ");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).getName());
        }
    }

    @Override
    public String toString() {
        //return WordUtils.capitalize(getName().replace('_', ' ')); need to figure out how to add library
        return getName().replace('_', ' ');
    }
}
