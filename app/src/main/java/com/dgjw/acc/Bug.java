package com.dgjw.acc;

import java.lang.String; /**
 * Created by Ducks on 7/3/2015.
 */
public class Bug extends Catchable {

    private String location;
    private String howTo;

    Bug(String name) {
        super(name);
    }

    public void display() {
        super.display();
        //additional info for bug
    }
}
