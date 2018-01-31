package com.patelheggere.ecommerce.datamodel;

import java.util.List;

/**
 * Created by Talkative Parents on 1/31/2018.
 */

public class ResultModel {
    private List<Categories> categories;
    private List<Rankings> rankings;

   public ResultModel(){}

    public List<Categories> getCategories() {
        return categories;
    }

    public void setCategories(List<Categories> categories) {
        this.categories = categories;
    }

    public List<Rankings> getRankings() {
        return rankings;
    }

    public void setRankings(List<Rankings> rankings) {
        this.rankings = rankings;
    }
}
