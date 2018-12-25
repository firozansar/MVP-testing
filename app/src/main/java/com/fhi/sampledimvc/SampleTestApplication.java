package com.fhi.sampledimvc;

import android.app.Application;

import com.fhi.sampledimvc.injector.di.components.ApplicationComponent;
import com.fhi.sampledimvc.injector.di.components.DaggerApplicationComponent;
import com.fhi.sampledimvc.injector.di.modules.ApplicationModule;


public class SampleTestApplication extends Application {
    private ApplicationComponent applicationComponent;


    @Override
    public void onCreate() {
        initializeInjector();
        super.onCreate();
    }


    private void initializeInjector() {
        this.applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }


    public ApplicationComponent getApplicationComponent() {
        return this.applicationComponent;
    }

}
