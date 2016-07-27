package com.example.poiuyt.androiddesignsupport;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by poiuyt on 7/25/16.
 */

public class Util {
  static   Toast toast;

    public static void showAToast(Context context, String str) {
        if (toast != null) {
            toast.cancel();
        }
        toast = Toast.makeText(context, str, Toast.LENGTH_SHORT);
        toast.show();
    }
}
