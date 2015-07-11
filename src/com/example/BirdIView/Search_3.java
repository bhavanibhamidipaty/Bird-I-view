package com.example.BirdIView;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class Search_3 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_3color_back);

        Button bBack = (Button) findViewById(R.id.BtnBack);
        bBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Search_3.this, Search_2.class));
            }
        });

        Button bNext = (Button) findViewById(R.id.BtnNxt);
        bNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Search_3.this, Search_4.class);
                startActivity(intent);
            }
        });

        ImageButton bBlue = (ImageButton) findViewById(R.id.iB_blue);
        bBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences colorBP = getSharedPreferences("colorB", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = colorBP.edit();
                editor.putString("colorB", "7");
                editor.commit();
            }
        });

        ImageButton bBrown = (ImageButton) findViewById(R.id.iB_brown);
        bBrown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences colorBP = getSharedPreferences("colorB", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = colorBP.edit();
                editor.putString("colorB", "2");
                editor.commit();
            }
        });

        ImageButton bGreen = (ImageButton) findViewById(R.id.iB_green);
        bGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences colorBP = getSharedPreferences("colorB", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = colorBP.edit();
                editor.putString("colorB", "5");
                editor.commit();
            }
        });

        ImageButton bOrange = (ImageButton) findViewById(R.id.iB_orange);
        bOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences colorBP = getSharedPreferences("colorB", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = colorBP.edit();
                editor.putString("colorB", "8");
                editor.commit();
            }
        });

        ImageButton bYellow = (ImageButton) findViewById(R.id.iB_yellow);
        bYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences colorBP = getSharedPreferences("colorB", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = colorBP.edit();
                editor.putString("colorB", "9");
                editor.commit();
            }
        });

        ImageButton bGrey = (ImageButton) findViewById(R.id.iB_grey);
        bGrey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences colorBP = getSharedPreferences("colorB", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = colorBP.edit();
                editor.putString("colorB", "4");
                editor.commit();
            }
        });

        ImageButton bWhite = (ImageButton) findViewById(R.id.iB_white);
        bWhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences colorBP = getSharedPreferences("colorB", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = colorBP.edit();
                editor.putString("colorB", "3");
                editor.commit();
            }
        });

        ImageButton bBlack = (ImageButton) findViewById(R.id.iB_black);
        bBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences colorBP = getSharedPreferences("colorB", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = colorBP.edit();
                editor.putString("colorB", "1");
                editor.commit();
            }
        });

        ImageButton bRed = (ImageButton) findViewById(R.id.iB_red);
        bRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences colorBP = getSharedPreferences("colorB", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = colorBP.edit();
                editor.putString("colorB", "6");
                editor.commit();
            }
        });
    }
}
