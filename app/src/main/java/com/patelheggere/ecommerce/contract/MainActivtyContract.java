package com.patelheggere.ecommerce.contract;

import android.view.View;

import com.patelheggere.ecommerce.datamodel.ResultModel;

/**
 * Created by Talkative Parents on 1/31/2018.
 */

public interface MainActivtyContract {
    interface View
    {
        void initView();
        void setData(ResultModel model);
        void getData();
    }

    interface Model{
        ResultModel fetchData();
    }

    interface Presenter{
        void onClick(android.view.View view);
        ResultModel get();
    }
}
