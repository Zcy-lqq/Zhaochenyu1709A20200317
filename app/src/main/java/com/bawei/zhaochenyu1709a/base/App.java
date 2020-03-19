package com.bawei.zhaochenyu1709a.base;

import android.app.Application;
import android.content.Context;

import com.bawei.zhaochenyu1709a.util.CrashHandle;

/**
 * 时间: 2020/3/17 10:18
 * 作者: 赵晨雨
 * 功能：app类 继承
 */
public class App extends Application {
    //静态方法
    private static Context context;
    //onCreate方法
    @Override
    public void onCreate() {
        super.onCreate();
        context=getApplicationContext();
        CrashHandle.getInstance().init();
    }
    //静态方法
    public static Context getAppContext(){
        //返回
        return context;
    }
}
