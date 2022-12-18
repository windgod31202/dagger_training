package com.example.dagger2_training.dagger;

import com.example.dagger2_training.MainActivity;
import com.example.dagger2_training.car.Car;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

/**
 * Dagger creates a container as you would have done with manual dependency injection.
 * 由Dagger新增一個容器來對要執行的東西手動依賴注入
 */

// 英文解釋：
// you used the @Component interface to get objects from the graph by exposing functions with the return type of what you want to get from the graph.
// 中文解釋：
// 使用 @Component 介面，以透過接觸擁有回傳類型的函式，以從圖表獲取您想要的物件。

// TODO: 2022-12-06 研究Singleton作用
@Singleton
@Component (modules = {WheelsModule.class,PetrolEngineModule.class})
public interface CarComponent {

    Car getCar();


    /**
     * 這個函式會通知 Dagger，MainActivity 要求存取圖形並要求插入。
     * Dagger 必須滿足 MainActivity 所需的所有依附元件 (Car 具有其依附元件)。
     */
    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder horsepower(@Named("horse power") int horsepower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        CarComponent build();
    }
}
