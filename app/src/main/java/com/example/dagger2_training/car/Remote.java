package com.example.dagger2_training.car;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = "Car";

    @Inject
    public Remote(){

    }

    public void setListener(Car car){
        Log.e(TAG, "setListener");
        Log.e(TAG, "Remote enabled!!");
    }
}
