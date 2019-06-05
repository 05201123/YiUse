package com.yaoyao.yiuse.base.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.yaoyao.yiuse.base.core.CoreApi;
import com.yaoyao.yiuse.dbmanager.dao.DaoMaster;

import org.greenrobot.greendao.AbstractDao;

/**
 * Created by zhangjd on 2019/3/1.
 */

public class DbManager {
    private final static String dbName = "test_db";
    private static DbManager mInstance;
    private DaoMaster.DevOpenHelper openHelper;
    private CustomDaoMaster mDaoMaster;
    private SQLiteDatabase db;
    private CustiomDaoSession mDaoSession;

    public DbManager(Context context) {
        openHelper = new CustomDaoMaster.DevOpenHelper(context,dbName, null);
        db=openHelper.getWritableDatabase();
        mDaoMaster= new CustomDaoMaster(db);
        mDaoSession = mDaoMaster.newCustomSession();
    }

    /**
     * 获取单例引用
     *
     * @return
     */
    public static DbManager getInstance() {
        if (mInstance == null) {
            synchronized (DbManager.class) {
                if (mInstance == null) {
                    mInstance = new DbManager(CoreApi.getmInstance().getAppContext());
                }
            }
        }

        return mInstance;
    }

    public <T extends AbstractDao> T getEntityDao (Class T){
        return (T)mDaoSession.getDao(mDaoSession.getEntityDao(T));
    }

}
