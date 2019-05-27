package com.yaoyao.yiuse.base.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zhangjd on 2019/5/27.
 */

public class FormatUtils {
    public static boolean isVerifyName(String name){
        String regEx="[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
        Pattern p= Pattern.compile(regEx);
        Matcher m=p.matcher(name);
        return !m.find();
    }

}
