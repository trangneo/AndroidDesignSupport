package com.example.poiuyt.androiddesignsupport.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.poiuyt.androiddesignsupport.adapter.PagerAdapter;
import com.example.poiuyt.androiddesignsupport.R;
import com.example.poiuyt.androiddesignsupport.utils.Util;

public class MainActivity extends BaseActivity {

    TabLayout tabMain;
    Toolbar toolbar;
    ViewPager viewPager;
    PagerAdapter adapter;
    DrawerLayout da;
    NavigationView na;
    FloatingActionButton fa;
    ActionBar actionBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }


    protected void initComponent() {
        setContentView(R.layout.activity_main);
        tabMain = (TabLayout) findViewById(R.id.tab);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        viewPager = (ViewPager) findViewById(R.id.pager);
        da = (DrawerLayout) findViewById(R.id.dr);
        na = (NavigationView) findViewById(R.id.na);
        fa = (FloatingActionButton) findViewById(R.id.fa);


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
        setSupportActionBar(toolbar);
        actionBar = getSupportActionBar();
        actionBar.setTitle("Android Design");
        actionBar.setHomeAsUpIndicator(R.mipmap.icv);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    protected void bindEventHandlers() {

        na.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                /**Do st here
                 */
                da.closeDrawers();
                return true;
            }
        });


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
                da.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
