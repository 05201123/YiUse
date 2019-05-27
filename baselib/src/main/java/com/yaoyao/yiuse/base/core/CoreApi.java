package com.yaoyao.yiuse.base.core;

import android.content.Context;

/**
 * Created by zhangjd on 2019/5/27.
 */

public class CoreApi {

    private static CoreApi mInstance=new CoreApi();
    private Context appContext;
    private CoreApi(){

    }
    public static CoreApi getmInstance(){
        return mInstance;
    }


    public Context getAppContext() {
        return appContext;
    }

    public void setAppContext(Context context){
        this.appContext=context;
    }

}
