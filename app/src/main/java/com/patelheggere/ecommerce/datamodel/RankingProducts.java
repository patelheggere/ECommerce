package com.patelheggere.ecommerce.datamodel;

/**
 * Created by Talkative Parents on 1/31/2018.
 */

public class RankingProducts {
    private long id;
    private long order_count;
    private long view_count;
    private long shares;

    public RankingProducts(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getOrder_count() {
        return order_count;
    }

    public void setOrder_count(long order_count) {
        this.order_count = order_count;
    }

    public long getView_count() {
        return view_count;
    }

    public void setView_count(long view_count) {
        this.view_count = view_count;
    }

    public long getShares() {
        return shares;
    }

    public void setShares(long shares) {
        this.shares = shares;
    }
}
