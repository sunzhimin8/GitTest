package com.szm.gittest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(@Nullable Context context, @Nullable String name,  int version) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.e("TAG","========新建数据库===========");
        //建表

         String SQL="create table person(_id integer primary key autoincrement,name varchar,age int)";
         db.execSQL(SQL);
         //插入数据
         db.execSQL("insert into person (name,age) values ('Tome',13)");
         db.execSQL("insert into person (name,age) values ('Tom2',12)");
         db.execSQL("insert into person (name,age) values ('Tom3',14)");
         db.execSQL("insert into person (name,age) values ('Tom4',15)");
         db.execSQL("insert into person (name,age) values ('Tom5',16)");
        Log.e("TAG","========插入数据===========");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        Log.e("TAG","========更新数据库==========="+"新版本"+i1);

    }
}
