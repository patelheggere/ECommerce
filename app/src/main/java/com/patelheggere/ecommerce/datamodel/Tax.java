package com.patelheggere.ecommerce.datamodel;

/**
 * Created by Talkative Parents on 1/31/2018.
 */

public class Tax {
    private String name;
    private float value;
    public Tax()
    {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}
