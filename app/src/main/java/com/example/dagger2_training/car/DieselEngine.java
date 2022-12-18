package com.example.dagger2_training.car;

import android.util.Log;

import javax.inject.Inject;

import dagger.Module;

@Module
public class DieselEngine implements Engine{
    private static final String TAG = "Car";

    private int horsepower;

    public DieselEngine(int horsepower){
        this.horsepower = horsepower;
    }

    @Override
    public void start(){
        Log.e(TAG, "Diesel engine started. horsepower："+horsepower+" hp");
    }
}
