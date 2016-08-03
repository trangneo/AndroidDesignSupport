package com.example.poiuyt.androiddesignsupport.activity;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.poiuyt.androiddesignsupport.R;
import com.example.poiuyt.androiddesignsupport.adapter.PagerAdapter;
import com.example.poiuyt.androiddesignsupport.utils.Util;

public class MainActivity extends BaseActivity {

    TabLayout tabMain;
    Toolbar toolbar;
    ViewPager viewPager;
    PagerAdapter adapter;
    FloatingActionButton fa;
    ActionBar actionBar;
    CoordinatorLayout coordinator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initComponent();
        initToolbar();
        bindEventHandlers();
    }


    protected void initComponent() {
        getLayoutInflater().inflate(R.layout.activity_main, coordinator_base);
        tabMain = (TabLayout)  findViewById(R.id.tab);
        viewPager = (ViewPager) findViewById(R.id.pager);
        fa = (FloatingActionButton)  findViewById(R.id.fa);

        tabMain.addTab(tabMain.newTab().setText("Tab1"));
        tabMain.addTab(tabMain.newTab().setText("Tab2"));
        tabMain.addTab(tabMain.newTab().setText("Tab3"));
        tabMain.addTab(tabMain.newTab().setText("Tab4"));
        tabMain.setTabGravity(TabLayout.GRAVITY_FILL);
        adapter = new PagerAdapter(getSupportFragmentManager(), tabMain.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabMain));
    }

    protected void initToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        actionBar = getSupportActionBar();
        actionBar.setTitle("Android Design");
        actionBar.setHomeAsUpIndicator(R.mipmap.icv);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    protected void bindEventHandlers() {

        tabMain.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        fa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "You have clicked", Snackbar.LENGTH_SHORT).setAction("undo", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Util.showAToast(MainActivity.this, "You do it");
                    }
                }).show();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                openNavigation();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

//    @Override
//    public void openNavigation() {
//        super.openNavigation();
//    }
}
