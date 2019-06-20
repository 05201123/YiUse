package com.yaoyao.yiuse.base.core;

import android.app.Application;

import com.yaoyao.yiuse.base.img.ImageLoader;

/**
 * Created by zhangjd on 2019/5/27.
 */

public class BaseAppliction extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        CoreApi.getmInstance().setAppContext(this);
        ImageLoader.getmInstance().init(this);
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        ImageLoader.getmInstance().trimMemory(level);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        ImageLoader.getmInstance().clearMemory();
    }
}
