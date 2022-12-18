package com.example.dagger2_training;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger2_training.car.Car;
import com.example.dagger2_training.car.Rims;
import com.example.dagger2_training.dagger.CarComponent;
import com.example.dagger2_training.dagger.DaggerCarComponent;
import com.example.dagger2_training.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
//    private Car car;

    //告知 Dagger 如何建立類別的執行個體。
    @Inject
    Car car1,car2;

    @Inject
    Rims rim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: 2022-12-05 註解說明

        // .create();：建構專案時，Dagger 會產生 CarComponent 介面的實作：DaggerCarComponent
        CarComponent carComponent = DaggerCarComponent.builder()
                .horsepower(500)
                .engineCapacity(2000)
                .build();



//        car = carComponent.getCar();

        //
        carComponent.inject(this);

        car1.drive();
        car2.drive();

        // TODO: 2022-12-06 更改為Part11影片內容，組件依賴、自定義範圍
        // TODO: 2022-12-06 建立新專案
    }
}