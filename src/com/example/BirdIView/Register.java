/** Description of Register Class
 *
 *
 */

package com.example.BirdIView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Bhavani on 29-06-2015.
 */
public class Register extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        Button bReg = (Button) findViewById(R.id.BtnReg);
        bReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"Registration Done" , Toast.LENGTH_SHORT).show();

                startActivity(new Intent(Register.this, MainMenu.class));

            }
        });
    }
}
