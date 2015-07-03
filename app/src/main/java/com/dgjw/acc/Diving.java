package com.dgjw.acc;

/**
 * Created by Ducks on 7/3/2015.
 */
public class Diving extends Catchable {

    private String shadow;
    private String movement;

    Diving(String name) {
        super(name);
    }

    public void display() {
        super.display();
        //additional info for diving creature
    }
}
