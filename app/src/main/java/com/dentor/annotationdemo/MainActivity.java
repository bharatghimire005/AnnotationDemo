package com.dentor.annotationdemo;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toast.makeText(this, "" + findTotalLength("Annotation", "Demo"), Toast.LENGTH_SHORT).show();
        //Toast.makeText(this, "" + findTotalLength(null, null), Toast.LENGTH_SHORT).show();
        // Toast.makeText(this, "" + findTotalLength("Annotation"), Toast.LENGTH_SHORT).show();
        // Toast.makeText(this, "" + findTotalLength(null), Toast.LENGTH_SHORT).show();


    }

    @Nullable
    public int findTotalLength(@NonNull String s1, @NonNull String s2) {
        return new StringBuilder(s1).append(s2).length();

    }

    @Nullable
    public int findTotalLength(@Nullable String s1) {
        if (s1 == null) return 0;
        else return new StringBuilder(s1).length();

    }
}
