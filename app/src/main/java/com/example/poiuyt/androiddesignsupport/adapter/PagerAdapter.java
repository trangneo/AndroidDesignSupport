package com.example.poiuyt.androiddesignsupport.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.poiuyt.androiddesignsupport.fragment.Tab1;
import com.example.poiuyt.androiddesignsupport.fragment.Tab2;
import com.example.poiuyt.androiddesignsupport.fragment.Tab3;
import com.example.poiuyt.androiddesignsupport.fragment.Tab4;

/**
 * Created by poiuyt on 7/21/16.
 */

public class PagerAdapter extends FragmentPagerAdapter {

    int numOfTab;

    public PagerAdapter(FragmentManager fm, int numOfTab) {
        super(fm);
        this.numOfTab = numOfTab;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Tab1 tab1 = new Tab1();
                return tab1;
            case 1:
                Tab2 tab2 = new Tab2();
                return tab2;
            case 2:
                Tab3 tab3 = new Tab3();
                return tab3;
            case 3:
                Tab4 tab4 = new Tab4();
                return tab4;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTab;
    }
}
