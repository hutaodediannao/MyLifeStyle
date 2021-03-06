package com.hutao.app.imageprivewproject.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.hutao.app.imageprivewproject.model.ImageModel;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "IMAGE_MODEL".
*/
public class ImageModelDao extends AbstractDao<ImageModel, String> {

    public static final String TABLENAME = "IMAGE_MODEL";

    /**
     * Properties of entity ImageModel.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property SapCode = new Property(0, String.class, "sapCode", false, "SAP_CODE");
        public final static Property ImageId = new Property(1, String.class, "imageId", true, "IMAGE_ID");
    };


    public ImageModelDao(DaoConfig config) {
        super(config);
    }
    
    public ImageModelDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"IMAGE_MODEL\" (" + //
                "\"SAP_CODE\" TEXT," + // 0: sapCode
                "\"IMAGE_ID\" TEXT PRIMARY KEY NOT NULL );"); // 1: imageId
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"IMAGE_MODEL\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, ImageModel entity) {
        stmt.clearBindings();
 
        String sapCode = entity.getSapCode();
        if (sapCode != null) {
            stmt.bindString(1, sapCode);
        }
 
        String imageId = entity.getImageId();
        if (imageId != null) {
            stmt.bindString(2, imageId);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, ImageModel entity) {
        stmt.clearBindings();
 
        String sapCode = entity.getSapCode();
        if (sapCode != null) {
            stmt.bindString(1, sapCode);
        }
 
        String imageId = entity.getImageId();
        if (imageId != null) {
            stmt.bindString(2, imageId);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1);
    }    

    @Override
    public ImageModel readEntity(Cursor cursor, int offset) {
        ImageModel entity = new ImageModel( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // sapCode
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1) // imageId
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, ImageModel entity, int offset) {
        entity.setSapCode(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setImageId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
     }
    
    @Override
    protected final String updateKeyAfterInsert(ImageModel entity, long rowId) {
        return entity.getImageId();
    }
    
    @Override
    public String getKey(ImageModel entity) {
        if(entity != null) {
            return entity.getImageId();
        } else {
            return null;
        }
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
