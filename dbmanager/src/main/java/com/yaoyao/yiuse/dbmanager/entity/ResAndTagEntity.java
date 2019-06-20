package com.yaoyao.yiuse.dbmanager.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by zhangjd on 2019/6/18.
 */
@Entity
public class ResAndTagEntity {
    @Id(autoincrement = true)
    private Long id;

    private Long tagId;

    private Long resId;

    @Generated(hash = 359077172)
    public ResAndTagEntity(Long id, Long tagId, Long resId) {
        this.id = id;
        this.tagId = tagId;
        this.resId = resId;
    }

    @Generated(hash = 988207535)
    public ResAndTagEntity() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTagId() {
        return this.tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public Long getResId() {
        return this.resId;
    }

    public void setResId(Long resId) {
        this.resId = resId;
    }
}
