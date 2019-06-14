package com.yaoyao.yiuse.manager.activity.model.impl;

import com.yaoyao.yiuse.base.db.DbManager;
import com.yaoyao.yiuse.base.userinfo.UserInfo;
import com.yaoyao.yiuse.dbmanager.dao.AimsEntityDao;
import com.yaoyao.yiuse.dbmanager.dao.ResourcesEntityDao;
import com.yaoyao.yiuse.dbmanager.entity.AimsEntity;
import com.yaoyao.yiuse.dbmanager.entity.ResourcesEntity;
import com.yaoyao.yiuse.manager.activity.model.inter.IManagerMainAModel;

import java.util.List;

public class ManagerMainAModelImpl implements IManagerMainAModel {
    @Override
    public List<AimsEntity> getSortInos() {
        AimsEntityDao dao=DbManager.getInstance().getEntityDao(AimsEntityDao.class);
        List<AimsEntity> list= dao.queryBuilder().where(AimsEntityDao.Properties.UserId.eq(UserInfo.getUserId())).list();
        if(list!=null){
            ResourcesEntityDao resDao=DbManager.getInstance().getEntityDao(ResourcesEntityDao.class);
            for (AimsEntity entity:list){
                List<ResourcesEntity> reslist= resDao.queryBuilder().where(ResourcesEntityDao.Properties.AimId.eq(entity.getId())).list();
                entity.setReslist(reslist);
            }
        }
        return list;
    }
}
