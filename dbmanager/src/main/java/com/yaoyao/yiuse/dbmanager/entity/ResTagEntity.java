package com.yaoyao.yiuse.dbmanager.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by zhangjd on 2019/6/14.
 * 资源标签
 */
@Entity
public class ResTagEntity {
    @Id(autoincrement = true)
    private Long id;
    private Long aimId;//分类目标Id
    private String tagId;
    private String name;
    @Generated(hash = 165048188)
    public ResTagEntity(Long id, Long aimId, String tagId, String name) {
        this.id = id;
        this.aimId = aimId;
        this.tagId = tagId;
        this.name = name;
    }
    @Generated(hash = 1807196063)
    public ResTagEntity() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getAimId() {
        return this.aimId;
    }
    public void setAimId(Long aimId) {
        this.aimId = aimId;
    }
    public String getTagId() {
        return this.tagId;
    }
    public void setTagId(String tagId) {
        this.tagId = tagId;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }


}
