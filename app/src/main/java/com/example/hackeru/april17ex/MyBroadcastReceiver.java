package com.example.hackeru.april17ex;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by hackeru on 17/04/2016.
 */
public class MyBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent){
        int INT_1 = intent.getIntExtra(MainActivity.INT_1, 0);

        Toast.makeText(context, Integer.toString(INT_1), Toast.LENGTH_SHORT).show();
        //abortBroadcast();
    }
}
