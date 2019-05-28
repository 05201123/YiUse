package com.yaoyao.yiuse.base.db;

import com.yaoyao.yiuse.dbmanager.dao.DaoSession;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangjd on 2019/5/28.
 */

public class CustiomDaoSession extends DaoSession {
    private  Map<Class<? extends AbstractDao>,Class<?>> daoToEntity;
    public CustiomDaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig> daoConfigMap) {
        super(db, type, daoConfigMap);
    }

    @Override
    protected <T> void registerDao(Class<T> entityClass, AbstractDao<T, ?> dao) {
        super.registerDao(entityClass, dao);
        if(daoToEntity==null){
            daoToEntity =new HashMap<>();
        }
        daoToEntity.put(dao.getClass(),entityClass);
    }
    public Class<?> getEntityDao(Class<? extends AbstractDao> clazz){
        return daoToEntity.get(clazz);
    }
}
