package com.example.avyandroid.criminalintent;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.avyandroid.criminalintent.database.CrimeDbSchema;
import com.example.avyandroid.criminalintent.database.CrimeDbSchema.CrimeTable;

/**
 * Created by Avinash on 2/5/2018.
 */

public class CrimeBaseHelper extends SQLiteOpenHelper {
    private static final int VERSION=1;
    private static final String DATABASE_NAME="crimeBase.db";

    public CrimeBaseHelper(Context context) {
        super(context,DATABASE_NAME,null,VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create Table "+ CrimeTable.NAME +"("+
                "_id integer primary key autoincrement," +
                CrimeTable.Cols.UUID+","+
                CrimeTable.Cols.Title+","+
                CrimeTable.Cols.Date+","+
                CrimeTable.Cols.Solved+
                ")"
        );

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
