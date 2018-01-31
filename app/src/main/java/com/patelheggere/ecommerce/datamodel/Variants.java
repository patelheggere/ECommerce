package com.patelheggere.ecommerce.datamodel;

/**
 * Created by Talkative Parents on 1/31/2018.
 */

public class Variants {
    private long id;
    private String color;
    private long size;
    private double price;

    public Variants(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
