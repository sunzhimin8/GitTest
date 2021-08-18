package com.szm.gittest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

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

    }

    /*
     * 更新
     */
    public void testUpdate(View v) {

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
