package com.yaoyao.yiuse.base.db;

import android.database.sqlite.SQLiteDatabase;

import com.yaoyao.yiuse.dbmanager.dao.DaoMaster;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.identityscope.IdentityScopeType;

/**
 * Created by zhangjd on 2019/5/28.
 */

public class CustomDaoMaster extends DaoMaster {
    public CustomDaoMaster(SQLiteDatabase db) {
        super(db);
    }
    public CustiomDaoSession newCustomSession() {
        return new CustiomDaoSession(db, IdentityScopeType.Session, daoConfigMap);
    }
    @Override
    protected void registerDaoClass(Class<? extends AbstractDao<?, ?>> daoClass) {
        super.registerDaoClass(daoClass);
    }
}
