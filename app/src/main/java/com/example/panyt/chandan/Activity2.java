package com.example.panyt.chandan;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Activity2 extends AppCompatActivity {
    Button b1;
    EditText e1, e2;
    String a, b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        b1 = (Button) findViewById(R.id.Login2);
        e1 = (EditText) findViewById(R.id.username);
        e2 = (EditText) findViewById(R.id.password);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              if(e1.getText().toString().equals("chandan")&& e2.getText().toString().equals("chandan"))
              {
                  Intent i1 = new Intent(Activity2.this,Activity3.class);
                  startActivity(i1);
              }
              else
              {
                  Toast.makeText(getApplicationContext(),"Enter correct details",Toast.LENGTH_SHORT).show();
              }
            }

        });
    }


}


