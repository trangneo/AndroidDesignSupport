package com.example.poiuyt.androiddesignsupport;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by poiuyt on 7/21/16.
 */

public class Tab2  extends Fragment {

    FloatingActionButton fa1, fa2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View view= inflater.inflate(R.layout.tab_layout2, container, false);
        fa1= (FloatingActionButton) view.findViewById(R.id.fa2);
        fa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "you have clicked" ,Snackbar.LENGTH_SHORT).
                        setAction("UNDO", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(getActivity(), "Ok tab2", Toast.LENGTH_SHORT).show();
                            }
                        }).show();
            }
        });
        return view;
    }
}
