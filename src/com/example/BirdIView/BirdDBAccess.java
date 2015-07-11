package com.example.BirdIView;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bhavani on 11-07-2015.
 */
public class BirdDBAccess {

    private SQLiteDatabase database;
    private MySQLiteHelper dbHelper;

    public BirdDBAccess(Context context){
        dbHelper = new MySQLiteHelper(context);
    }

    public void open() throws SQLException, IOException {
        //dbHelper.create();
        //database = dbHelper.open();
    }

//    public List<Bird> getBirdByFilter(String query, String[] args){
//        List<Bird> birdList = new ArrayList<Bird>();
//
//        Cursor c =
//                database
//                        .
//                                rawQuery
//                                        (query,
//                                                args);
//        c.moveToFirst();
//        while(!c.isAfterLast()){
//            Bird b = cursorToBird(c);
//            birdList.add(b);
//        }
//        c.close();
//        return birdList;
//    }

    public Cursor getBirdByFilter(String query, String[] args){
        //List<Bird> birdList = new ArrayList<Bird>();

        Cursor c =
                database
                        .
                                rawQuery
                                        (query,
                                                args);
        c.moveToFirst();
        if(c != null){
            c.moveToFirst();
        }
        return c;
    }
    private Bird cursorToBird(Cursor c){
        Bird b = new Bird();
        b.setColorC(c.getString(2));
        b.setColorB(c.getString(3));
        b.setBeak(c.getString(4));
        b.setHabitat(c.getString(5));
        b.setSize(c.getString(6));
        b.setName(c.getString(1));
        b.setId(c.getInt(0));

        return b;
    }

}
