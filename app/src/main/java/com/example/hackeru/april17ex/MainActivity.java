package com.example.hackeru.april17ex;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
 public final static String INT_1 = "INT_1";
 public final static String INT_2 = "INT_2";
 public final static String INT_3 = "INT_3";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void btnClick(View view) {
        Intent broadcast=
                new Intent("Bryans_Filter");
        broadcast.putExtra(INT_1,1);
        broadcast.putExtra(INT_2,2);
        broadcast.putExtra(INT_3,3);

        sendOrderedBroadcast(broadcast, null);
    }
}
