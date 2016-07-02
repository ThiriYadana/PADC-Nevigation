package com.example.dellpc.padc_nevigation;

import android.app.Application;
import android.content.Context;

/**
 * Created by dellpc on 27-Jun-16.
 */
public class PADC_Nevigation_App extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
