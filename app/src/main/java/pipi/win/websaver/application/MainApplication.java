package pipi.win.websaver.application;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

import pipi.win.websaver.utility.LogUtil;

public class MainApplication extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        LeakCanary.install(this);
        LogUtil.initLogger();

    }
}
