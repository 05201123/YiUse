package com.yaoyao.yiuse.dbmanager.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Unique;

import java.util.UUID;

/**
 * Created by zhangjd on 2019/5/28.
 */
@Entity
public class AimsEntity {
    @Id(autoincrement = true)
    private Long id;
    private String aimName;
    private String userId;
    @Unique
    private String aimId;
    @Generated(hash = 857164547)
    public AimsEntity(Long id, String aimName, String userId, String aimId) {
        this.id = id;
        this.aimName = aimName;
        this.userId = userId;
        this.aimId = aimId;
    }
    @Generated(hash = 867471155)
    public AimsEntity() {
    }
    public String getAimName() {
        return this.aimName;
    }
    public void setAimName(String aimName) {
        this.aimName = aimName;
    }
    public String getUserId() {
        return this.userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getAimId() {
        return this.aimId;
    }
    public void setAimId(String aimId) {
        this.aimId = aimId;
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public static AimsEntity createEntity(String sortName,String userId) {
        AimsEntity entity=new AimsEntity(null,sortName,userId ,UUID.randomUUID().toString());
        return entity;
    }
}
