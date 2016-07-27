package com.example.poiuyt.androiddesignsupport.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.PopupMenu;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.poiuyt.androiddesignsupport.R;

/**
 * Created by poiuyt on 7/21/16.
 */

public class Tab2 extends Fragment {
    Button btnContext, btnPopup;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.tab_layout2, container, false);
        btnContext = (Button) view.findViewById(R.id.btnContext);
        btnPopup = (Button) view.findViewById(R.id.btnPopup);
        registerForContextMenu(btnContext);
        initComponent();
        bindEventHandlers();

        return view;
    }

    protected void initComponent() {

    }

    protected void bindEventHandlers() {

//        btnContext.setOnCreateContextMenuListener(getActivity());
        btnPopup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(getActivity(), v);
                popupMenu.getMenuInflater().inflate(R.menu.menu_popup, popupMenu.getMenu());
                popupMenu.show();
            }
        });

    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
//        getActivity().getMenuInflater().inflate(R.menu.menu_context, menu);
        menu.setHeaderTitle("Lalaa");
        menu.add(0, getId(), 0, "check");
        menu.add(0, getId(), 0, "chat");
        menu.add(0, getId(), 0, "test");
        menu.add(0, getId(), 0, "game");
    }
}
