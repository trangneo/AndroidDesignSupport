package com.example.poiuyt.androiddesignsupport.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.poiuyt.androiddesignsupport.R;
import com.example.poiuyt.androiddesignsupport.activity.SecondActivity;

/**
 * Created by poiuyt on 7/21/16.
 */

public class Tab1 extends Fragment {
    Button btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.tab_layout1, container, false);
        btn = (Button) view.findViewById(R.id.btn);
        initComponent();
        bindEventHandlers();
        return view;
    }

    protected void initComponent() {

    }

    protected void bindEventHandlers() {

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), SecondActivity.class));
            }
        });
        btn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                return false;
            }
        });
    }
}
