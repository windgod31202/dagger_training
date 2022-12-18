package com.example.dagger2_training.dagger;

import com.example.dagger2_training.car.Rims;
import com.example.dagger2_training.car.Tires;
import com.example.dagger2_training.car.Wheels;

import dagger.Module;
import dagger.Provides;

/**
 * 每個元件只能宣告一次模組。
 */
@Module
public abstract class WheelsModule {
    //WheelsModule 是包含在 CarComponent裡面
    //當內容有static，class要設定成abstract類型。


    /**
     * Use "@Provides" to tell Dagger how to provide classes that your project doesn't own.
     * @implNote 使用 @Provides 向 Dagger 說明如何提供專案不屬於的類別。
     */
    //提供Rims給Wheels
    @Provides
    static Rims provideRims(){
        Rims rims = new Rims();
        rims.inflate();
        return rims;
    }

    //提供Tires給Wheels
    @Provides
    static Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    //提供給Car，將回傳值Rims和Tires傳給Car。
    @Provides
    static Wheels provideWheels(Rims rims, Tires tires){
        return new Wheels(rims,tires);
    }
}
