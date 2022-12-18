package com.example.dagger2_training.dagger;

import com.example.dagger2_training.car.Engine;
import com.example.dagger2_training.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {
    //PetrolEngineModule 是包含在CarComponent裡面的

    /**
     * @implNote  use "@Binds" to tell Dagger which implementation an interface should have.
     *  使用 "@Binds" 時會告訴Dagger接口應具有那些實現
     */


    //要導入的介面
    @Binds
    abstract Engine BindsEngine(PetrolEngine engine);
}
