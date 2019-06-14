package com.yaoyao.yiuse.dbmanager.entity;

import com.yaoyao.yiuse.dbmanager.dao.AimsEntityDao;
import com.yaoyao.yiuse.dbmanager.dao.DaoSession;
import com.yaoyao.yiuse.dbmanager.dao.ResTagEntityDao;

import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.ToMany;
import org.greenrobot.greendao.annotation.Transient;

import java.util.List;

/**
 * Created by zhangjd on 2019/5/28.
 */
@Entity
public class AimsEntity {

    public static AimsEntity createEntity(String sortName,String userId) {
        AimsEntity entity=new AimsEntity(null,sortName,userId);
        return entity;
    }
    @Id(autoincrement = true)
    private Long id;
    private String aimName;
    private String userId;
//    @Unique
//    private String aimId;
    @ToMany(referencedJoinProperty = "aimId")
    private List<ResTagEntity> resTagList;
    @Transient
    private List<ResourcesEntity> reslist;
    public List<ResourcesEntity> getReslist() {
        return reslist;
    }
    public void setReslist(List<ResourcesEntity> reslist) {
        this.reslist = reslist;
    }



    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;
    /** Used for active entity operations. */
    @Generated(hash = 1622743907)
    private transient AimsEntityDao myDao;
    @Generated(hash = 203182079)
    public AimsEntity(Long id, String aimName, String userId) {
        this.id = id;
        this.aimName = aimName;
        this.userId = userId;
    }
    @Generated(hash = 867471155)
    public AimsEntity() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
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

    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */
    @Generated(hash = 1851598696)
    public List<ResTagEntity> getResTagList() {
        if (resTagList == null) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            ResTagEntityDao targetDao = daoSession.getResTagEntityDao();
            List<ResTagEntity> resTagListNew = targetDao
                    ._queryAimsEntity_ResTagList(id);
            synchronized (this) {
                if (resTagList == null) {
                    resTagList = resTagListNew;
                }
            }
        }
        return resTagList;
    }
    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated(hash = 1967246619)
    public synchronized void resetResTagList() {
        resTagList = null;
    }
    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }
    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }
    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }
    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1016100945)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getAimsEntityDao() : null;
    }




}
