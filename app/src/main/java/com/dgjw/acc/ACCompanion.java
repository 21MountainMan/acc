package com.dgjw.acc;

import android.os.Parcelable;
import android.util.Log;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * Created by johnathon on 7/2/2015.
 */
public class ACCompanion {

    ArrayList<Parcelable> items = new ArrayList<>();
    ArrayList<ItemCategory> itemCategories = new ArrayList<>();

    ACCompanion() {
        loadRaw();
    }

    private void loadRaw() {
        Field[] fields=R.raw.class.getFields();
        for(int count=0; count < fields.length; count++){
            Log.i("Raw Asset: ", fields[count].getName());

        }
    }

    private void readFile(String filename) throws IOException, NullPointerException {

        BufferedReader br = null;
        try {
            //br = new BufferedReader(new FileReader())
        } finally {

        }

    }
}
