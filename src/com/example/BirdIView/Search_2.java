/** Description of Search_2 Class
 *
 * Here the second screen of the search process is shown to user and input is recorded via button press
 * A second different button press replaces the first
 */



package com.example.BirdIView;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


public class Search_2 extends Activity {

    int[] state = {0,0,0,0,0,0,0,0,0};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_2color_chest);




        Button bNext = (Button) findViewById(R.id.BtnNxt);
        bNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Search_2.this, Search_4.class);
                startActivity(intent);
            }
        });

        ImageButton bBlue = (ImageButton) findViewById(R.id.iB_blue);
        bBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences colorCP = getSharedPreferences("colorC", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = colorCP.edit();
                editor.putInt("colorC", 7);
                editor.commit();
                Toast.makeText(view.getContext(), "Blue Selected", Toast.LENGTH_LONG).show();
            }
        });

        ImageButton bBrown = (ImageButton) findViewById(R.id.iB_brown);
        bBrown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences colorCP = getSharedPreferences("colorC", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = colorCP.edit();
                editor.putInt("colorC", 2);
                editor.commit();
                Toast.makeText(view.getContext(),"Brown Selected" , Toast.LENGTH_LONG).show();
            }
        });

        ImageButton bGreen = (ImageButton) findViewById(R.id.iB_green);
        bGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences colorCP = getSharedPreferences("colorC", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = colorCP.edit();
                editor.putInt("colorC", 5);
                editor.commit();
                Toast.makeText(view.getContext(),"Green Selected" , Toast.LENGTH_LONG).show();
            }
        });

        ImageButton bOrange = (ImageButton) findViewById(R.id.iB_orange);
        bOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences colorCP = getSharedPreferences("colorC", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = colorCP.edit();
                editor.putInt("colorC", 8);
                editor.commit();
                Toast.makeText(view.getContext(),"Orange Selected" , Toast.LENGTH_LONG).show();
            }
        });

        ImageButton bYellow = (ImageButton) findViewById(R.id.iB_yellow);
        bYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences colorCP = getSharedPreferences("colorC", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = colorCP.edit();
                editor.putInt("colorC", 9);
                editor.commit();
                Toast.makeText(view.getContext(),"Yellow Selected" , Toast.LENGTH_LONG).show();
            }
        });

        ImageButton bGrey = (ImageButton) findViewById(R.id.iB_grey);
        bGrey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences colorCP = getSharedPreferences("colorC", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = colorCP.edit();
                editor.putInt("colorC", 4);
                editor.commit();
                Toast.makeText(view.getContext(),"Grey Selected" , Toast.LENGTH_LONG).show();
            }
        });

        ImageButton bWhite = (ImageButton) findViewById(R.id.iB_white);
        bWhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences colorCP = getSharedPreferences("colorC", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = colorCP.edit();
                editor.putInt("colorC", 3);
                editor.commit();
                Toast.makeText(view.getContext(),"White Selected" , Toast.LENGTH_LONG).show();
            }
        });

        ImageButton bBlack = (ImageButton) findViewById(R.id.iB_black);
        bBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences colorCP = getSharedPreferences("colorC", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = colorCP.edit();
                editor.putInt("colorC", 1);
                editor.commit();
                Toast.makeText(view.getContext(),"Black Selected" , Toast.LENGTH_LONG).show();
            }
        });

        ImageButton bRed = (ImageButton) findViewById(R.id.iB_red);
        bRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences colorCP = getSharedPreferences("colorC", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = colorCP.edit();
                editor.putInt("colorC", 6);
                editor.commit();
                Toast.makeText(view.getContext(),"Red Selected" , Toast.LENGTH_LONG).show();
            }
        });
    }
}
