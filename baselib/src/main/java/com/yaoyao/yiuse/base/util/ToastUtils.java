package com.yaoyao.yiuse.base.util;

import android.text.TextUtils;
import android.widget.Toast;

import com.yaoyao.yiuse.base.core.CoreApi;

/**
 * Created by zhangjd on 2019/5/27.
 */

public class ToastUtils {
    public static void showShortToast(String text){
        if(TextUtils.isEmpty(text)){
            return ;
        }
        Toast.makeText(CoreApi.getmInstance().getAppContext(),text,Toast.LENGTH_SHORT).show();
    }
}
