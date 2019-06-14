package com.yaoyao.yiuse.dbmanager.dao;

import java.util.List;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.query.Query;
import org.greenrobot.greendao.query.QueryBuilder;

import com.yaoyao.yiuse.dbmanager.entity.ResTagEntity;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "RES_TAG_ENTITY".
*/
public class ResTagEntityDao extends AbstractDao<ResTagEntity, Long> {

    public static final String TABLENAME = "RES_TAG_ENTITY";

    /**
     * Properties of entity ResTagEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property AimId = new Property(1, Long.class, "aimId", false, "AIM_ID");
        public final static Property TagId = new Property(2, String.class, "tagId", false, "TAG_ID");
        public final static Property Name = new Property(3, String.class, "name", false, "NAME");
    }

    private Query<ResTagEntity> aimsEntity_ResTagListQuery;

    public ResTagEntityDao(DaoConfig config) {
        super(config);
    }
    
    public ResTagEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"RES_TAG_ENTITY\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"AIM_ID\" INTEGER," + // 1: aimId
                "\"TAG_ID\" TEXT," + // 2: tagId
                "\"NAME\" TEXT);"); // 3: name
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"RES_TAG_ENTITY\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, ResTagEntity entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Long aimId = entity.getAimId();
        if (aimId != null) {
            stmt.bindLong(2, aimId);
        }
 
        String tagId = entity.getTagId();
        if (tagId != null) {
            stmt.bindString(3, tagId);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(4, name);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, ResTagEntity entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Long aimId = entity.getAimId();
        if (aimId != null) {
            stmt.bindLong(2, aimId);
        }
 
        String tagId = entity.getTagId();
        if (tagId != null) {
            stmt.bindString(3, tagId);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(4, name);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public ResTagEntity readEntity(Cursor cursor, int offset) {
        ResTagEntity entity = new ResTagEntity( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1), // aimId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // tagId
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3) // name
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, ResTagEntity entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setAimId(cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1));
        entity.setTagId(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setName(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(ResTagEntity entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(ResTagEntity entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(ResTagEntity entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
    /** Internal query to resolve the "resTagList" to-many relationship of AimsEntity. */
    public List<ResTagEntity> _queryAimsEntity_ResTagList(Long aimId) {
        synchronized (this) {
            if (aimsEntity_ResTagListQuery == null) {
                QueryBuilder<ResTagEntity> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.AimId.eq(null));
                aimsEntity_ResTagListQuery = queryBuilder.build();
            }
        }
        Query<ResTagEntity> query = aimsEntity_ResTagListQuery.forCurrentThread();
        query.setParameter(0, aimId);
        return query.list();
    }

}