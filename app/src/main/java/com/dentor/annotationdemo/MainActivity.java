package com.dentor.annotationdemo;

import android.support.annotation.FloatRange;
import android.support.annotation.IntRange;
import android.support.annotation.Size;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    int[] arr = new int[20];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intRange(200);
        floatRange(10);
        String a = "Bhara";
        lengthCount(a);
    }

    public void intRange(@IntRange(from = 0, to = 200) int num) {

        Log.e(TAG, num + "");
    }

    public void floatRange(@FloatRange(from = 0.0, to = 10.0) float num) {

        Log.e(TAG, num + "");

    }

    public void lengthCount(@Size(min = 3) String arr) {
// do something
    }


}
