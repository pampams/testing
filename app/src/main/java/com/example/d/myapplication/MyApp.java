package com.example.d.myapplication;

import android.app.Application;
import android.os.SystemClock;

/**
 * Created by d on 1/12/2018.
 */

public class MyApp extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        SystemClock.sleep(3000);
    }
}
