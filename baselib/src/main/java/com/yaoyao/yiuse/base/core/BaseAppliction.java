package com.yaoyao.yiuse.base.core;

import android.app.Application;

/**
 * Created by zhangjd on 2019/5/27.
 */

public class BaseAppliction extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        CoreApi.getmInstance().setAppContext(this);
    }
}
