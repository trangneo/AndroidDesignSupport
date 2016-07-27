package com.example.poiuyt.androiddesignsupport.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by poiuyt on 7/27/16.
 */

public class BaseFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        init();
        return super.onCreateView(inflater, container, savedInstanceState);

    }

    public void init() {
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
