package com.yaoyao.yiuse.base.img;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.yaoyao.yiuse.base.core.CoreApi;

/**
 * Created by zhangjd on 2019/6/20.
 */

public final class ImageLoader {
    private IImageLoader defaultImageLoader;
    private ImageLoader(){
        defaultImageLoader=new GildeImageLoader();
    }
    /**静态内部类单例*/
    public static ImageLoader getmInstance(){
        return ImageLoaderInner.mInstance;
    }

    /**
     * 最基础的加载图片
     * @param context
     * @param uri
     * @param imageView
     */
    public  void displayImage(Object context,Object uri, ImageView imageView) {
        if(context==null||uri==null||imageView==null){
            throw new NullPointerException();
        }
        defaultImageLoader.displayImage(new ImageLoadBuilder().context(context).imageview(imageView).url(uri));
    }
    public  void init(Context context){
        defaultImageLoader.init(context);
    }
    public void trimMemory(int level) {
        defaultImageLoader.trimMemory(level);
    }
    public void clearMemory() {
        defaultImageLoader.clearMemory();
    }

    private static class ImageLoaderInner{
        private static ImageLoader mInstance=new ImageLoader();
    }
    private class GildeImageLoader implements IImageLoader {
        @Override
        public void init(Context context) {

        }

        @Override
        public void trimMemory(int level) {
            try {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    Glide.get(CoreApi.getmInstance().getAppContext()).trimMemory(level);
                } else {
                    throw new RuntimeException("请在主线程中调用");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void clearMemory() {
            try {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    Glide.get(CoreApi.getmInstance().getAppContext()).clearMemory();
                } else {
                    throw new RuntimeException("请在主线程中调用");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void displayImage(ImageLoadBuilder builder) {
            if(builder.context instanceof android.support.v4.app.Fragment){
                Glide.with((android.support.v4.app.Fragment) builder.context).load(builder.url).into(builder.intoImageView);
            }else if(builder.context instanceof Fragment){
                Glide.with((Fragment) builder.context).load(builder.url).into(builder.intoImageView);
            }else if(builder.context instanceof FragmentActivity){
                Glide.with((FragmentActivity) builder.context).load(builder.url).into(builder.intoImageView);
            }else if(builder.context instanceof Activity){
                Glide.with((Activity) builder.context).load(builder.url).into(builder.intoImageView);
            }else if(builder.context instanceof Context){
                Glide.with((Context) builder.context).load(builder.url).into(builder.intoImageView);
            }

        }
    }
}
