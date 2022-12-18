package com.example.dagger2_training.car;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    /**
     * Field Injection
     */
    private Engine engine;
    private Wheels wheels;
    private Driver driver;

    /**
     * Construct Injection
     * @param engine 引擎
     * @param wheels 輪胎
     */
    //在Car的建構函式中加上@Inject註解，讓Dagger了解如何建立Car物件。
    @Inject
    public Car(Driver driver, Engine engine, Wheels wheels) {
        this.driver = driver;
        this.engine = engine;
        this.wheels = wheels;
        Log.e(TAG, "Car construct");
    }

    /**
     * Method Injection
     * @param remote
     */
    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }

    /**
     * 起動
     */
    public void drive(){

        //engine函式
        engine.start();
        Log.e(TAG, driver+" drives"+ this);
    }
}