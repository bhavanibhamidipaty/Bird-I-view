package com.example.BirdIView;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


/**
 * Created by Bhavani on 08-07-2015.
 */
public class StoringInput extends Activity {

    public static final String DEF = "NA";
    ListView listView;

   //private BirdDBAccess datasource;
   // DataBaseHelper dbhelper;// = new DataBaseHelper(this);
   // SQLiteDatabase db;// = dbhelper.getReadableDatabase();

   // @Override
    //protected void onResume(){
       // super.onResume();
       // initDb();
  //  }

    //private void initDb(){
    //    dbhelper = new DataBaseHelper(this);
    //    db = dbhelper.getReadableDatabase();
   // }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prob_birds);

        MySQLiteHelper myDbHelper = new MySQLiteHelper(StoringInput.this);

        try {
            myDbHelper.create();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            // open the database
            myDbHelper.open();
            myDbHelper.getWritableDatabase();
        } catch (SQLException sqle) {
            Log.d("Error", "SQL exception at open()");
        }

        SharedPreferences sizeP = getSharedPreferences("sizeV", Context.MODE_PRIVATE);
        String size = sizeP.getString("sizeV", DEF);

        SharedPreferences colorCP = getSharedPreferences("colorC", Context.MODE_PRIVATE);
        String colorC = colorCP.getString("colorC", DEF);

        SharedPreferences colorBP = getSharedPreferences("colorB", Context.MODE_PRIVATE);
        String colorB = colorBP.getString("colorB", DEF);

        SharedPreferences beakP = getSharedPreferences("beakR", Context.MODE_PRIVATE);
        String beak = beakP.getString("beakR", DEF);

        SharedPreferences habiP = getSharedPreferences("habiB", Context.MODE_PRIVATE);
        String habi = habiP.getString("habiB", DEF);

        Button bBack = (Button) findViewById(R.id.BtnBack);
        bBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StoringInput.this, Search_5.class));
            }
        });

        Button bReport = (Button) findViewById(R.id.BtnReport);
        bReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                Intent intent = new Intent(StoringInput.this, Report.class);
                startActivity(intent);
            }
        });

        //BirdFilter currentBird = new BirdFilter();
        //currentBird.setBeakSize(beak);
        //currentBird.setColorC(colorC);
        //currentBird.setColorB(colorB);
        //currentBird.setSize(size);
        //currentBird.setHabitat(habi);

        //DataBaseHelper dbhelper = new DataBaseHelper(this);
        //SQLiteDatabase db = dbhelper.getWritableDatabase();

        //BirdDAO birdtoFind = new BirdDAO(db);
        //List birds = birdtoFind.filter(currentBird);

        //ListBirdsAdapter birdsShow = new ListBirdsAdapter(this,birds);
        //listView.setAdapter(birdsShow);


        //listView = (ListView) findViewById(R.id.list_birds);

        BirdFilter filterCat = new BirdFilter();
        filterCat.setColorB(colorB);
        filterCat.setColorC(colorC);
        filterCat.setHabitat(habi);
        filterCat.setSize(size);
        filterCat.setBeakSize(beak);
        String query = "SELECT * FROM BIRD WHERE COLOR_C = ? AND " +
                "COLOR_B = ? AND BEAK = ? AND HAB = ? AND SIZE = ?;";
        String[] list = {filterCat.getColorC(), filterCat.getColorB(),
                filterCat.getBeakSize(), filterCat.getHabitat(),
                filterCat.getSize()};

        Cursor c = null;
        try {
            c = myDbHelper.getBirdsCursor(query,list);
        } catch (SQLException e) {
            Log.d("After bird filter:","Unable to execute sql");
        }


        c.close();


        //List<Bird> values = datasource.getBirdByFilter(query, list);
        //ArrayAdapter<Bird> adapter = new ArrayAdapter<Bird>(this, R.layout.list_prob_bird, values);
        //setListAdapter(adapter);



    }

    @Override
    protected void onResume() {
        try {
            //datasource.open();
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.onResume();
    }
}
