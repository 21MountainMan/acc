package com.dgjw.acc;

/**
 * Created by Ducks on 7/3/2015.
 */
public class Task implements Checkable{

    private String description;
    private Boolean complete;

    public String getDescription() {
        return description;
    }

    public boolean isChecked() {
        return complete;
    }
}
