package com.dentor.annotationdemo;

import android.support.annotation.IntDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class MainActivity extends AppCompatActivity {


    public static final int MERCURY = 0;
    public static final int VENUS = 1;
    public static final int EARTH = 2;
    public static final int MARS = 3;
    public static final int JUPITER = 4;
    public static final int SATURN = 5;
    public static final int URANUS = 6;
    public static final int NEPTUNE = 7;

    @IntDef({MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Planets {
    }

    @Planets
    int mCurrentPlanet = EARTH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        @Planets int currentPlanet = getCurrentPlanet();
        printPlanets(currentPlanet);
    }

    private void printPlanets(@Planets int currentPlanet) {
        switch (currentPlanet) {
            case MERCURY:
                Log.e("Planet", "Mercury is the closest to the Sun");
                break;
            case VENUS:
                Log.e("Planet", "Venus is the 2nd planet from the Sun");
                break;
            case EARTH:
                Log.e("Planet", "EARTH is the 3rd planet from the Sun");
                break;
            case MARS:
                Log.e("Planet", "MARS is the 4th planet from the Sun");
                break;
            case JUPITER:
                Log.e("Planet", "JUPITER is the 5th planet from the Sun");
                break;
            case SATURN:
                Log.e("Planet", "SATURN is the 6th planet from the Sun");
                break;
            case URANUS:
                Log.e("Planet", "URANUS is the 7th planet from the Sun");
                break;
            case NEPTUNE:
                Log.e("Planet", "NEPTUNE is the 8th planet from the Sun");
                break;
        }
    }

    @Planets
    public int getCurrentPlanet() {
        return mCurrentPlanet;
    }

    public void setCurrentPlanet(@Planets int currentPlanet) {
        mCurrentPlanet = currentPlanet;
    }
}
