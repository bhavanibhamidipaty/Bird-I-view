package com.example.BirdIView;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Bhavani on 02-07-2015.
 */
public class Search_5 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_5habitat);


        Button bBack = (Button) findViewById(R.id.BtnBack);
        bBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Search_5.this, Search_4.class));
            }
        });

        Button bNext = (Button) findViewById(R.id.BtnNxt);
        bNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                Intent intent = new Intent(Search_5.this,StoringInput.class);
                startActivity(intent);
            }
        });

        Button hab1 =(Button) findViewById(R.id.btHabFly);
        hab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2){
                SharedPreferences habP = getSharedPreferences("habiB", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = habP.edit();
                editor.putString("habiB", String.valueOf(1));
                editor.commit();
            }
        });

        Button hab2 =(Button) findViewById(R.id.btHabGrd);
        hab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2){
                SharedPreferences habP = getSharedPreferences("habiB", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = habP.edit();
                editor.putString("habiB", String.valueOf(2));
                editor.commit();
            }
        });

        Button hab3 =(Button) findViewById(R.id.btHabPch);
        hab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2){
                SharedPreferences habP = getSharedPreferences("habiB", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = habP.edit();
                editor.putString("habiB", String.valueOf(3));
                editor.commit();
            }
        });

        Button hab4 =(Button) findViewById(R.id.btHabSwim);
        hab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2){
                SharedPreferences habP = getSharedPreferences("habiB", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = habP.edit();
                editor.putString("habiB", String.valueOf(4));
                editor.commit();
            }
        });

    }
}
