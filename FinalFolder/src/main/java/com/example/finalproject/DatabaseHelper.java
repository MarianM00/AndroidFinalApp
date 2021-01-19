package com.example.finalproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME="DBpatients.db";
    public static final String TABLE_NAME="patients_table";
    public static final String COL_ID="ID";
    public static final String COL_NAME="Name";
    public static final String COL_CNP="CNP";
    public static final String COL_PHONE="Phone";

    public DatabaseHelper(Context context){
        super(context,DATABASE_NAME,null,1);
    }

    public void onCreate(SQLiteDatabase db){
        db.execSQL(" CREATE TABLE " + TABLE_NAME
                + " (" + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + COL_NAME + " TEXT, "
                + COL_CNP + " TEXT, "
                + COL_PHONE + " TEXT);"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){}

    public boolean insertData(String name, String CNP, String Phone){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(COL_CNP,CNP);
        values.put(COL_NAME,name);
        values.put(COL_PHONE,Phone);

        long result=db.insert(TABLE_NAME,null,values);
        if(result==-1) return false;
        else return true;
    }

    public Cursor getData(String CNP){

        SQLiteDatabase db= this.getWritableDatabase();
        String query="Select * from " + TABLE_NAME + " where CNP= '" + CNP +"'";
        Cursor result= db.rawQuery(query,null);
        return result;

    }




}
