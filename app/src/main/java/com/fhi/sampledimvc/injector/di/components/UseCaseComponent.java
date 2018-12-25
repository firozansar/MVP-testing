package com.fhi.sampledimvc.injector.di.components;

import com.fhi.sampledimvc.injector.PerActivity;
import com.fhi.sampledimvc.injector.di.modules.ActivityModule;
import com.fhi.sampledimvc.injector.di.modules.UseCaseModule;
import com.fhi.sampledimvc.mvp.view.activity.BaseActivity;

import dagger.Component;


@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = {UseCaseModule.class, ActivityModule.class})
public interface UseCaseComponent extends ActivityComponent{
    void inject(BaseActivity baseActivity);
}
