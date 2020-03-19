package com.bawei.zhaochenyu1709a.util;

/**
 * 时间: 2020/3/17 11:59
 * 作者: 赵晨雨
 * 功能：
 */
public class CrashHandle implements Thread.UncaughtExceptionHandler {
    public CrashHandle(){

    }
    private static class SingleInstance{
        private static final CrashHandle INSTANCE = new CrashHandle();
    }
    public static CrashHandle getInstance(){
        return SingleInstance.INSTANCE;
    }
    public void init(){
        Thread.setDefaultUncaughtExceptionHandler(this);
    }
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        e.printStackTrace();
    }
}
