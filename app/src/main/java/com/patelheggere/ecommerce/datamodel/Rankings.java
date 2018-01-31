package com.patelheggere.ecommerce.datamodel;

import java.util.List;

/**
 * Created by Talkative Parents on 1/31/2018.
 */

public class Rankings {
    private String ranking;
    private List<RankingProducts> products;

    public Rankings(){}

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public List<RankingProducts> getProducts() {
        return products;
    }

    public void setProducts(List<RankingProducts> products) {
        this.products = products;
    }
}
