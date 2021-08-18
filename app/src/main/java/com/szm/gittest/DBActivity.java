package com.szm.gittest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TableLayout;
import android.widget.Toast;

import java.util.HashMap;

public class DBActivity extends AppCompatActivity {
    private  DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_db);
    }

    /*
     * 创建库
     */
    public void testCreateDB(View v) {
        //声明数据库连接帮助类实例
       db=new DBHelper(this,"szm.db",1);
     // 必须调用 实现类的 getDatabaseName方法，才能生成 SQLiteDatabase 对象用于实际操作数据库
       db.getReadableDatabase();
     Toast.makeText(this,"Create DB", Toast.LENGTH_SHORT).show();

    }

    /*
     * 更新库
     */
    public void testUpdateDB(View v) {

        DBHelper db2=new DBHelper(this,"szm.db",2);

        db2.getReadableDatabase();


    }

    /*
     * 添加记录
     */
    public void testInsert(View v) {
        //1.得到连接
        db=new DBHelper(this,"szm.db",2);
        SQLiteDatabase sqLiteDatabase=db.getReadableDatabase();

        //2插入数据
        ContentValues values=new ContentValues();
        values.put("name","xiaoming");
        values.put("age",100);

        long id= sqLiteDatabase.insert("person",null,values);

        //3关闭数据库

        sqLiteDatabase.close();

        String strID=String.valueOf(id);

        Toast.makeText(this,"ID="+id+"==="+strID,Toast.LENGTH_SHORT).show();



    }

    /*
     * 更新
     */
    public void testUpdate(View v) {
      DBHelper dbHelper=new DBHelper(this,"szm.db",2);
      SQLiteDatabase database=dbHelper.getReadableDatabase();

      ContentValues  values=new ContentValues();
      values.put("name","你好");
      values.put("age",88);

        Log.e("TAG", "testUpdate: begin");
        int num = database.update("person",values,"_id > 1",null );
        Log.e("TAG", "testUpdate: end");
         database.close();

        Toast.makeText(this,String.valueOf(num), Toast.LENGTH_SHORT).show();
    }

    /*
     * 删除
     */
    public void testDelete(View v) {

    }

    /*
     * 查询
     */
    public void testQuery(View v) {

    }

    /*
     * 测试事务处理
     * update person set age=16 where _id=1
     * update person set age=17 where _id=3
     *
     * 一个功能中对数据库进行的多个操作: 要就是都成功要就都失败
     * 事务处理的3步:
     * 1. 开启事务(获取连接后)
     * 2. 设置事务成功(在全部正常执行完后)
     * 3. 结束事务(finally中)
     */
    public void testTransaction(View v) {



    }

}
