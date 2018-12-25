package com.fhi.sampledimvc.runner;

import android.app.Application;
import android.content.Context;
import android.support.test.runner.AndroidJUnitRunner;

import com.fhi.sampledimvc.TestApplication;

public class GithubTestRunner extends AndroidJUnitRunner {

    @Override
    public Application newApplication(ClassLoader cl, String className, Context context) throws InstantiationException,
            IllegalAccessException, ClassNotFoundException {
        String testApplicationClassName = TestApplication.class.getCanonicalName();
        return super.newApplication(cl, testApplicationClassName, context);
    }
}
