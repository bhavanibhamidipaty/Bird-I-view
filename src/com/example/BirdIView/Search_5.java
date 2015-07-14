/** Description of Search_5 Class
 *
 * Here the fifth screen of the search process is shown to user and input is recorded via button press
 * A second different button press replaces the first
 */

package com.example.BirdIView;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Bhavani on 02-07-2015.
 */
public class Search_5 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_5habitat);

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
                editor.putInt("habiB", 1);
                editor.commit();
                Toast.makeText(view2.getContext(), "In Flight Selected", Toast.LENGTH_LONG).show();
            }
        });

        Button hab2 =(Button) findViewById(R.id.btHabGrd);
        hab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2){
                SharedPreferences habP = getSharedPreferences("habiB", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = habP.edit();
                editor.putInt("habiB", 2);
                editor.commit();
                Toast.makeText(view2.getContext(), "On the Ground Selected", Toast.LENGTH_LONG).show();
            }
        });

        Button hab3 =(Button) findViewById(R.id.btHabPch);
        hab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2){
                SharedPreferences habP = getSharedPreferences("habiB", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = habP.edit();
                editor.putInt("habiB", 3);
                editor.commit();
                Toast.makeText(view2.getContext(), "Perched Selected", Toast.LENGTH_LONG).show();
            }
        });

        Button hab4 =(Button) findViewById(R.id.btHabSwim);
        hab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2){
                SharedPreferences habP = getSharedPreferences("habiB", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = habP.edit();
                editor.putInt("habiB", 4);
                editor.commit();
                Toast.makeText(view2.getContext(), "Swimming or Wadding Selected", Toast.LENGTH_LONG).show();
            }
        });

    }
}
