package com.example.poiuyt.androiddesignsupport.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.poiuyt.androiddesignsupport.R;
import com.example.poiuyt.androiddesignsupport.utils.Util;

/**
 * Created by poiuyt on 7/27/16.
 */

public class BaseActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView na;
    CoordinatorLayout coordinator_base;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        onCreateDrawable();
    }

    protected void onCreateDrawable() {
        coordinator_base = (CoordinatorLayout) findViewById(R.id.coordinator_base);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawable_layout);
        na = (NavigationView) findViewById(R.id.na);
        if (na != null) {
            na.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(MenuItem item) {
                    /**Do st here
                     */
                    Util.showAToast(BaseActivity.this, item.getTitle()+"");
                    drawerLayout.closeDrawers();
                    return true;
                }
            });
        }
    }

    public void openNavigation() {
        drawerLayout.openDrawer(GravityCompat.START);
    }


}
