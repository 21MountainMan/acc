package com.dgjw.acc;

import com.dgjw.acc.Item; /**
 * Created by Ducks on 7/3/2015.
 */
public class Catchable extends Item{

    private int value;
    private TimePeriod whenToCatch;
    private TimePeriod bestTimeToCatch;

    Catchable(String name) {
        super(name);
    }

    public TimePeriod getWhenToCatch() {
        return whenToCatch;
    }

    public TimePeriod getBestTimeToCatch() {
        return bestTimeToCatch;
    }
}
