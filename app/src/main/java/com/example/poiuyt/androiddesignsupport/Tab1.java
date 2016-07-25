package com.example.poiuyt.androiddesignsupport;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by poiuyt on 7/21/16.
 */

public class Tab1 extends Fragment {
    Snackbar snackbar;
    FloatingActionButton fl;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_layout1, container, false);

        fl = (FloatingActionButton) view.findViewById(R.id.fl);

        fl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                snackbar.make(v, "You have clicked", Snackbar.LENGTH_SHORT)
                        .setAction("UNDO", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(getActivity(), "You do it", Toast.LENGTH_SHORT).show();
                            }
                        }).show();

//                fl.setTranslationY((int) -snackbar.getView().getHeight());
            }
        });
        return view;
    }

}
