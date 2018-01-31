package com.patelheggere.ecommerce.contract;

import android.view.View;

/**
 * Created by Talkative Parents on 1/31/2018.
 */

public interface MainActivtyContract {
    interface View
    {
        void initView();
        void setData();
        void getData();
    }

    interface Model{
        void fetchData();
    }

    interface Presenter{
        void onClick(android.view.View view);
        void get();
    }
}
