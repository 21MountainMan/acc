package com.dgjw.acc;

import java.lang.String; /**
 * Created by Ducks on 7/3/2015.
 */
public class Fish extends Catchable {

    private String location;
    private String shadow;
    private String howTo;

    Fish(String name) {
        super(name);
    }

    public void display() {
        super.display();
        //additional info for fish
    }
}
