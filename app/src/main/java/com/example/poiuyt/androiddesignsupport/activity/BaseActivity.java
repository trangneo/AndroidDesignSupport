package com.example.poiuyt.androiddesignsupport.activity;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by poiuyt on 7/27/16.
 */

public class BaseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initComponent();
        initToolbar();
        bindEventHandlers();
    }

    protected void bindEventHandlers() {

    }

    protected void initToolbar() {

    }

    protected void initComponent() {

    }

}
