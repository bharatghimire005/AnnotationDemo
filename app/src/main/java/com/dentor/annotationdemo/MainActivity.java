package com.dentor.annotationdemo;


import android.support.annotation.UiThread;
import android.support.annotation.WorkerThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvDemo;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDemo = (TextView) findViewById(R.id.tv);
        changeTextColor();
        workerThreadExample();
    }

    @UiThread
    private void changeTextColor() {
        tvDemo.setText("Hello newers world");
    }

    @WorkerThread
    private void changeTextSize() {
        Log.e(TAG, "workerThread");
    }


    private void workerThreadExample() {
        new Thread(new Runnable() {
            @WorkerThread
            @Override
            public void run() {
                changeTextSize();
            }
        }).start();


    }
}
