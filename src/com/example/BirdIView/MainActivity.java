package com.example.BirdIView;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
//import android.view.View.OnClickListener;



public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */



    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        ImageButton start = (ImageButton) findViewById(R.id.BtnStart);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MainMenu.class));
            }
        });

        Button hist = (Button) findViewById(R.id.BtnHistory);
        hist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, History.class));
            }
        });
    }
}
