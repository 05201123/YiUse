package com.yaoyao.yiuse.dbmanager.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Unique;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by zhangjd on 2019/6/5.
 */
@Entity
public class ResourcesEntity {
    @Id(autoincrement = true)
    private Long id;
    @Unique
    private String resId;

    private String aimId;
    /**本地地址*/
    private String localpath;
    private String netUrl;
    private String md5;
    private String name;
    private long addTime;
    @Generated(hash = 1380588196)
    public ResourcesEntity(Long id, String resId, String aimId, String localpath,
            String netUrl, String md5, String name, long addTime) {
        this.id = id;
        this.resId = resId;
        this.aimId = aimId;
        this.localpath = localpath;
        this.netUrl = netUrl;
        this.md5 = md5;
        this.name = name;
        this.addTime = addTime;
    }
    @Generated(hash = 606657380)
    public ResourcesEntity() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getResId() {
        return this.resId;
    }
    public void setResId(String resId) {
        this.resId = resId;
    }
    public String getAimId() {
        return this.aimId;
    }
    public void setAimId(String aimId) {
        this.aimId = aimId;
    }
    public String getLocalpath() {
        return this.localpath;
    }
    public void setLocalpath(String localpath) {
        this.localpath = localpath;
    }
    public String getNetUrl() {
        return this.netUrl;
    }
    public void setNetUrl(String netUrl) {
        this.netUrl = netUrl;
    }
    public String getMd5() {
        return this.md5;
    }
    public void setMd5(String md5) {
        this.md5 = md5;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getAddTime() {
        return this.addTime;
    }
    public void setAddTime(long addTime) {
        this.addTime = addTime;
    }


}
