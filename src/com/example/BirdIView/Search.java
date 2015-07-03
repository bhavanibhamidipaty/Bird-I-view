package com.example.BirdIView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;


public class Search extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_1size);


        Button bBack = (Button) findViewById(R.id.BtnBack);
        bBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Search.this, MainMenu.class));
            }
        });

        Button bNext = (Button) findViewById(R.id.BtnNxt);
        bNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                startActivity(new Intent(Search.this, Search_2.class));
            }
        });

        SeekBar sizeSeek = (SeekBar) findViewById(R.id.seekBar);
        TextView test = (TextView) findViewById(R.id.test);

        sizeSeek.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            int p=0;

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                if(p<30)
                {
                    p=30;
                    sizeSeek.setProgress(p);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,boolean fromUser) {
            
                p=progress;
                test.setTextSize(p);
            }
        });

    }

}
