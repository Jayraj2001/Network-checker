package com.example.networkchecker;

import android.content.Context;
import android.net.ConnectivityManager;
import android.widget.Toast;

public class NetworkCheck {
    public static void checkNet(Context context){
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        boolean check = cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnected();
        if (check) {
            Toast.makeText(context, "Internet is connected", Toast.LENGTH_SHORT).show();
        } else Toast.makeText(context, "Internet is not connected", Toast.LENGTH_SHORT).show();
    }
}
