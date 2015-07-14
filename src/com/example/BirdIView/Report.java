package com.example.BirdIView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Bhavani on 02-07-2015.
 */
public class Report extends Activity{

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.report);
        Button bReg = (Button) findViewById(R.id.BtnReportSubmit);
        bReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"Report saved" , Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Report.this, MainMenu.class));
            }
        });
    }
}
