package com.patelheggere.ecommerce.presenter;

import android.view.View;

import com.patelheggere.ecommerce.contract.MainActivtyContract;
import com.patelheggere.ecommerce.model.MainActivityModelImpl;

/**
 * Created by Talkative Parents on 1/31/2018.
 */

public class MainActivityPresenterImpl implements MainActivtyContract.Presenter {

    MainActivtyContract.View mMainActivityView;
    MainActivtyContract.Model mMainActivityModel;

    public MainActivityPresenterImpl(MainActivtyContract.View view)
    {
        mMainActivityView = view;
        initPresenter();
    }

    private void initPresenter()
    {
        mMainActivityModel = new MainActivityModelImpl();
        mMainActivityView.initView();
    }

    @Override
    public void onClick(View view) {
        mMainActivityModel.fetchData();
    }

    @Override
    public void get() {
        mMainActivityModel.fetchData();
    }

}
