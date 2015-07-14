/** Description of Search Class
 *
 * Here the first screen of the search process is shown to user and input is recorded via scrollbar change
 */





package com.example.BirdIView;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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



        SeekBar sizeSeek = (SeekBar) findViewById(R.id.seekBar);
        TextView test = (TextView) findViewById(R.id.test);
        int seekMax = 10;
        sizeSeek.setMax(seekMax);

        Button bNext = (Button) findViewById(R.id.BtnNxt);
        bNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                Intent intent = new Intent(Search.this, Search_2.class);
                startActivity(intent);
            }
        });


        sizeSeek.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,boolean fromUser) {
                test.setText(String.valueOf(progress));
                SharedPreferences sizeP = getSharedPreferences("sizeV", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sizeP.edit();
                editor.putInt("sizeV", progress);
                editor.commit();
            }
        });

    }

}
