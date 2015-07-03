package com.dgjw.acc;

/**
 * Created by Ducks on 7/3/2015.
 */
public class Decor extends Item{

    private int buyPrice;
    private int sellPrice;
    private String color1;
    private String color2;
    private String interiorTheme;
    private String style;
    private String source;
    private String series;
    private String set;
    private String theme;

    Decor(String name) {
        super(name);
    }

    public String getInteriorTheme() {
        return interiorTheme;
    }

    public String getStyle() {
        return style;
    }

    public String getSeries() {
        return series;
    }

    public String getSet() {
        return set;
    }

    public String getTheme() {
        return theme;
    }

    public void display() {
        super.display();
        //additoinal info for decor
    }
}
