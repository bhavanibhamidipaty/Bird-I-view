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
public class MainMenu extends Activity {
    public static int DEF = -1;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button search = (Button) findViewById(R.id.BtnSrch);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sizeP = getSharedPreferences("sizeV", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sizeP.edit();
                editor.clear();
                editor.commit();

                SharedPreferences colorCP = getSharedPreferences("colorC", Context.MODE_PRIVATE);
                editor = colorCP.edit();
                editor.clear();
                editor.commit();

                SharedPreferences colorBP = getSharedPreferences("colorB", Context.MODE_PRIVATE);
                editor = colorBP.edit();
                editor.clear();
                editor.commit();

                SharedPreferences beakP = getSharedPreferences("beakR", Context.MODE_PRIVATE);
                editor = beakP.edit();
                editor.clear();
                editor.commit();

                SharedPreferences habiP = getSharedPreferences("habiB", Context.MODE_PRIVATE);
                editor = habiP.edit();
                editor.clear();
                editor.commit();
                startActivity(new Intent(MainMenu.this, Search.class));
            }
        });

        Button register = (Button) findViewById(R.id.BtnReg);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainMenu.this, Register.class));
            }
        });

        /*
        Button report = (Button) findViewById(R.id.BtnRpt);

        report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainMenu.this, Report.class));
            }
        });*/

        Button hist = (Button) findViewById(R.id.BtnHistory);
        hist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainMenu.this, History.class));
            }
        });
    }
}
