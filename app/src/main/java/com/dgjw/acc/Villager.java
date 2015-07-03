package com.dgjw.acc;

import java.util.Date;

/**
 * Created by Ducks on 7/3/2015.
 */
public class Villager implements Displayable{

    private String name;
    private Date birthday;
    private String favoriteStyle;
    private String dislikedStlye;
    private String favoriteColor;
    private String bean;
    private int milk;
    private int sugar;
    private boolean currentResident;

    public Date getBirthday() {
        return birthday;
    }

    public boolean isCurrentResident() {
        return currentResident;
    }

    public void display() {
        //Set up display information for Villager object
    }

    public String getName() {
        return name;
    }
}
