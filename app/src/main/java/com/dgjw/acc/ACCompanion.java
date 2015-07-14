package com.dgjw.acc;

import android.content.Context;
import android.os.Parcelable;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * Created by johnathon on 7/2/2015.
 */
public class ACCompanion {

    ArrayList<Parcelable> items = new ArrayList<>();
    ArrayList<String> itemCategories = new ArrayList<>();
    Context ctx;

    ACCompanion(Context ctx) {
        this.ctx = ctx;
        loadItemCategories();
    }

    public ArrayList<String> getItemCategories() {
        return itemCategories;
    }

    public ArrayList<Parcelable> loadItems(String itemCategory) {
        /*
            Generic item parsing
        */
        // get the contents of the file
        String fileContents = readRawFile(itemCategory);
        String splitFileContents[] = null;

        ArrayList<Parcelable> items = new ArrayList<>();

        splitFileContents = fileContents.split(",");

        // create new items and add them to the list in the ItemCategory
        for (int i = 0; i < splitFileContents.length; i++) {
            items.add(new Item(splitFileContents[i]));
        }

        return items;
    }

    public void loadItemCategories() {

        // get a list of the raw assets
        Field[] fields = R.raw.class.getFields();

        for (int count = 0; count < fields.length; count++) {
            // get the name of the .csv file from raw folder
            String fieldName = fields[count].getName();

            // add a new item category named after the corresponding raw asset
            itemCategories.add(fieldName);
        }
    }

    /**
     * source: http://stackoverflow.com/questions/4087674/android-read-text-raw-resource-file/
     */
    private String readRawFile(String resourceName) {

        int resourceId = getResourceId(resourceName, R.raw.class);
        InputStream inputStream = ctx.getResources().openRawResource(resourceId);

        InputStreamReader inputReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputReader);
        String line;
        StringBuilder text = new StringBuilder();

        try {
            while ((line = bufferedReader.readLine()) != null) {
                text.append(line);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        finally {
            try {
                bufferedReader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        return text.toString();
    }

    /**
     * source: http://stackoverflow.com/questions/4427608/android-getting-resource-id-from-string
     */
    public static int getResourceId(String resourceName, Class<?> c) {
        try {
            Field idField = c.getDeclaredField(resourceName);
            return idField.getInt(idField);
        } catch (Exception ex) {
            ex.printStackTrace();
            return -1;
        }
    }
}
