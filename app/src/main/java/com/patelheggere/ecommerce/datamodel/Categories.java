package com.patelheggere.ecommerce.datamodel;

import java.util.List;

/**
 * Created by Talkative Parents on 1/31/2018.
 */

public class Categories {
    private long id;
    private String name;
    private List<Products> products;
    private List<Long> child_categories;

    public Categories(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }

    public List<Long> getChild_categories() {
        return child_categories;
    }

    public void setChild_categories(List<Long> child_categories) {
        this.child_categories = child_categories;
    }
}
