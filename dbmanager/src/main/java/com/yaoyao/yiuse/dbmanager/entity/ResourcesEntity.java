package com.yaoyao.yiuse.dbmanager.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Transient;
import org.greenrobot.greendao.annotation.Unique;

import java.util.List;

/**
 * Created by zhangjd on 2019/6/5.
 * 资源标签
 */
@Entity
public class ResourcesEntity {
    @Id(autoincrement = true)
    private Long id;
    @Unique
    private String resId;
    @NotNull
    private String aimId;
    /**本地地址*/
    private String localpath;
    private String netUrl;
    private String md5;
    private String name;
    private long addTime;
    private int fileType;//1.pic 2.video 3.file,4.txt 6
    @Transient
    private List<ResourcesEntity> resTagList;

    @Generated(hash = 892462158)
    public ResourcesEntity(Long id, String resId, @NotNull String aimId,
            String localpath, String netUrl, String md5, String name, long addTime,
            int fileType) {
        this.id = id;
        this.resId = resId;
        this.aimId = aimId;
        this.localpath = localpath;
        this.netUrl = netUrl;
        this.md5 = md5;
        this.name = name;
        this.addTime = addTime;
        this.fileType = fileType;
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
    public int getFileType() {
        return this.fileType;
    }
    public void setFileType(int fileType) {
        this.fileType = fileType;
    }
    public List<ResourcesEntity> getResTagList() {
        return resTagList;
    }
    public void setResTagList(List<ResourcesEntity> resTagList) {
        this.resTagList = resTagList;
    }


}
