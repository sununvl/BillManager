package com.sun.billmanager;

import android.app.Application;
import android.content.Context;

public class BaseApplication extends Application {

    private static Context sCtx;

    @Override
    public void onCreate() {
        super.onCreate();
        sCtx = this;
    }

    public static Context getCtx() {
        return sCtx;
    }
}
