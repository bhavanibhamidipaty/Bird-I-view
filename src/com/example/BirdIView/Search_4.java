package com.example.BirdIView;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class Search_4 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_4beaks);

        RadioGroup radio_g = (RadioGroup) findViewById(R.id.beak_Group);
        RadioButton r1,r2,r3,r4,r5,r6,r7;
        r1 = (RadioButton) findViewById(R.id.rB_1);
        r2 = (RadioButton) findViewById(R.id.rB_2);
        r3 = (RadioButton) findViewById(R.id.rB_3);
        r4 = (RadioButton) findViewById(R.id.rB_4);
        r5 = (RadioButton) findViewById(R.id.rB_5);
        r6 = (RadioButton) findViewById(R.id.rB_6);
        r7 = (RadioButton) findViewById(R.id.rB_7);

        Button bBack = (Button) findViewById(R.id.BtnBack);
        bBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Search_4.this, Search_3.class));
            }
        });

        Button bNext = (Button) findViewById(R.id.BtnNxt);
        bNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                Intent intent = new Intent(Search_4.this,Search_5.class);
                startActivity(intent);
            }
        });

        radio_g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int checked_id = radioGroup.getCheckedRadioButtonId();
                int c=0;
                if(checked_id==r1.getId())
                    c=1;
                else if(checked_id==r2.getId())
                    c=2;
                else if(checked_id==r3.getId())
                    c=3;
                else if(checked_id==r4.getId())
                    c=4;
                else if(checked_id==r5.getId())
                    c=5;
                else if(checked_id==r6.getId())
                    c=6;
                else if(checked_id==r7.getId())
                    c=7;
                RadioButton r_button = (RadioButton) findViewById(checked_id);
                SharedPreferences beakP = getSharedPreferences("beakR", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = beakP.edit();
                editor.putString("beakR", String.valueOf(c));//r_button.getText().toString()
                editor.commit();
            }

        });
    }
}
