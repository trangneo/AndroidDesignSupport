package com.example.poiuyt.androiddesignsupport;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    TabLayout tabMain;
    Toolbar toolbar;
    ViewPager viewPager;
    PagerAdapter adapter;
    DrawerLayout da;
    NavigationView na;

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabMain = (TabLayout) findViewById(R.id.tab);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        viewPager = (ViewPager) findViewById(R.id.pager);
        da = (DrawerLayout) findViewById(R.id.dr);
        na = (NavigationView) findViewById(R.id.na);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Android Design");
        getSupportActionBar().setHomeAsUpIndicator(R.mipmap.icv);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        na.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                da.closeDrawers();
                return true;
            }
        });

        tabMain.addTab(tabMain.newTab().setText("Tab1"));
        tabMain.addTab(tabMain.newTab().setText("Tab2"));
        tabMain.addTab(tabMain.newTab().setText("Tab3"));
        tabMain.addTab(tabMain.newTab().setText("Tab4"));
        tabMain.setTabGravity(TabLayout.GRAVITY_FILL);
        adapter = new PagerAdapter(getSupportFragmentManager(), tabMain.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabMain));
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
