package com.patelheggere.ecommerce.views.activities;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.patelheggere.ecommerce.R;
import com.patelheggere.ecommerce.contract.MainActivtyContract;
import com.patelheggere.ecommerce.datamodel.ResultModel;
import com.patelheggere.ecommerce.presenter.MainActivityPresenterImpl;
import com.patelheggere.ecommerce.utils.Utils;
import com.patelheggere.ecommerce.views.fragments.HomeFragment;

public class MainActivity extends AppCompatActivity implements MainActivtyContract.View, NavigationView.OnNavigationItemSelectedListener, HomeFragment.OnFragmentInteractionListener {

    private MainActivityPresenterImpl mPresenter;
    static ViewPager viewPager;
    static TabLayout tabLayout;
    private Button bnt;
    private ResultModel resultModel = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter = new MainActivityPresenterImpl(this);
        resultModel = mPresenter.get();
        if(resultModel!=null)
        System.out.println("dfsdf:"+resultModel.getCategories().get(0).getName());
    }

    @Override
    public void initView() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }

    @Override
    public void setData(ResultModel model)
    {
        resultModel = model;
    }

    @Override
    public void getData()
    {

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.home) {
            Utils.switchFragment(R.id.frag_container, new HomeFragment(resultModel), this, "Home_Fragment");
        } else if (id == R.id.myCart) {
            Toast.makeText(getApplicationContext(), "My Cart", Toast.LENGTH_LONG).show();

        } else if (id == R.id.myOrders) {
            Toast.makeText(getApplicationContext(), "My Orders", Toast.LENGTH_LONG).show();

        } else if (id == R.id.myAccount) {
            Toast.makeText(getApplicationContext(), "My Accounts", Toast.LENGTH_LONG).show();

        } else if (id == R.id.About) {
            Toast.makeText(getApplicationContext(), "About Us", Toast.LENGTH_LONG).show();

        } else if (id == R.id.share) {
            Toast.makeText(getApplicationContext(), "Share", Toast.LENGTH_LONG).show();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:

                    return true;
                case R.id.navigation_dashboard:

                    return true;
                case R.id.navigation_notifications:

                    return true;
            }
            return false;
        }

    };

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
