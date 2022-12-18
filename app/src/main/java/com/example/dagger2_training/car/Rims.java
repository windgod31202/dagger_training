package com.example.dagger2_training.car;

import android.util.Log;

import javax.inject.Inject;

public class Rims {
    private static final String TAG = "Car";

    public void inflate(){
        Log.e(TAG, "Rims inflated");
    }
}
