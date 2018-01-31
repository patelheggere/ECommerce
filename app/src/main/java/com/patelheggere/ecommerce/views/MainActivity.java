package com.patelheggere.ecommerce.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.patelheggere.ecommerce.R;
import com.patelheggere.ecommerce.contract.MainActivtyContract;
import com.patelheggere.ecommerce.presenter.MainActivityPresenterImpl;

public class MainActivity extends AppCompatActivity implements MainActivtyContract.View {

    private MainActivityPresenterImpl mPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter = new MainActivityPresenterImpl(this);
        mPresenter.get();
    }

    @Override
    public void initView() {

    }

    @Override
    public void setData()
    {

    }

    @Override
    public void getData()
    {

    }
}
