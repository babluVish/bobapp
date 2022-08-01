package com.app.bobapp;

import android.content.Context;
import android.widget.Toast;

public class CustomeToast {
    public static void showToast(Context con, String msg){
        Toast.makeText(con,msg,Toast.LENGTH_LONG).show();
    }
}
