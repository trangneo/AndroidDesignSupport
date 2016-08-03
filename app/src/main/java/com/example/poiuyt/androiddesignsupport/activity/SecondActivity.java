package com.example.poiuyt.androiddesignsupport.activity;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import com.example.poiuyt.androiddesignsupport.R;

/**
 * Created by poiuyt on 7/25/16.
 */

public class SecondActivity extends BaseActivity {
    Toolbar toolbar;
    CollapsingToolbarLayout collapsingToolbarLayout;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initComponent();
        initToolbar();
        bindEventHandlers();
    }

    protected void initComponent() {
       getLayoutInflater().inflate(R.layout.activity_second, coordinator_base);

    }


    protected void initToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbarLayout.setTitle("Music Instrument");
    }


    protected void bindEventHandlers() {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_options, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
