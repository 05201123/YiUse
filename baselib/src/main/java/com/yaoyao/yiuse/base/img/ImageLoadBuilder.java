package com.yaoyao.yiuse.base.img;

import android.widget.ImageView;

/**
 * Created by zhangjd on 2019/6/20.
 */

class ImageLoadBuilder {
    ImageView intoImageView;
    Object url;
    Object context;

    public ImageLoadBuilder imageview(ImageView intoImageView) {
        this.intoImageView = intoImageView;
        return this;
    }

    public ImageLoadBuilder url(Object url) {
        this.url = url;
        return this;
    }

    public ImageLoadBuilder context(Object context) {
        this.context = context;
        return this;
    }

}
