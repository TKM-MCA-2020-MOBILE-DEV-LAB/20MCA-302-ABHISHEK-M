package com.example.db_update_delete;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(Context context) {
        super(context, "Student_DB.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase DB) {
        DB.execSQL("create table Student_data(name Text primary key, rollno TEXT, course TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase DB, int i, int i1) {
        DB.execSQL("drop Table if exists userdata");
    }

    public Boolean insertDB(String name, String rno, String course) {
        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("Name",name);
        cv.put("RollNo",rno);
        cv.put("Course",course);
        long result = DB.insert("Student_data",null,cv);
        if(result==-1){
            return false;
        }
        else{
            return true;
        }
    }
    public Boolean UpdateuserDB(String name,String rno, String course){
        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("RollNo",rno);
        cv.put("Course",course);
        Cursor cursor = DB.rawQuery("Select * from Student_data where name = ?",new String[]{name});
        if(cursor.getCount()>0){
            long result = DB.update("Student_data",cv,"name=?",new String[]{name});
            if(result==-1){
                return false;
            }
            else{
                return true;
            }

        }
        else{
            return false;
        }
    }
    public Boolean DeleteuserDB(String name){
        SQLiteDatabase DB = this.getWritableDatabase();
        Cursor cursor = DB.rawQuery("Select * from Student_data where name = ?",new String[]{name});
        if(cursor.getCount()>0){
            long result = DB.delete("Student_data","name=?",new String[]{name});
            if(result==-1){
                return false;
            }
            else{
                return true;
            }

        }
        else{
            return false;
        }
    }
    public Cursor getuserDB(){
        SQLiteDatabase DB = this.getWritableDatabase();
        Cursor cursor = DB.rawQuery("Select * from Student_data",null);
        return cursor;
    }
}