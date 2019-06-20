package com.yaoyao.yiuse.base.img;

import android.content.Context;

/**
 * Created by zhangjd on 2019/6/20.
 */

 interface IImageLoader {
      void  init(Context context);
      void trimMemory(int level);
      void clearMemory();
      void displayImage(ImageLoadBuilder builder);
}
