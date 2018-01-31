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
}
