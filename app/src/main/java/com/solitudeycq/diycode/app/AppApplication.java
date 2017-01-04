package com.solitudeycq.diycode.app;

import android.app.Application;

import com.solitudeycq.diycode.utils.LogControl;

/**
 * Created by solitudeycq on 2017/1/4.
 */

public class AppApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        LogControl.setUSable(true);
    }
}
