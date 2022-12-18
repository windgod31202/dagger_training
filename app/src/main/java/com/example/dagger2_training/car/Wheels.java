package com.example.dagger2_training.car;

import android.util.Log;

import javax.inject.Inject;


public class Wheels {
    private static final String TAG="Wheels";

    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
        Log.e(TAG, "Wheels OK");
    }

    @Inject
    public Wheels(){
        Log.e(TAG, "Wheels: OK");
    }
}
