package com.example.panyt.chandan;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class Activity3 extends AppCompatActivity {

    ImageButton b1,b2,b3,b4,b5,b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        b1 = (ImageButton) findViewById(R.id.bio);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity3.this,Activity4.class);
                startActivity(i);
            }
        });
        b2=(ImageButton)findViewById(R.id.vocab);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2= new Intent(Activity3.this,Activity5.class);
                startActivity(i2);
            }
        });
        b3=(ImageButton)findViewById(R.id.quiz);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent i3 = new Intent(Activity3.this,Activity7.class);
            startActivity(i3);

            }
        });
        b4=(ImageButton)findViewById(R.id.gallery);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(Activity3.this,Activity8.class);
                startActivity(i4);
            }
        });
        b5 =(ImageButton)findViewById(R.id.feed);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5 = new Intent(Activity3.this,Activity9.class);
                startActivity(i5);
            }
        });
        b6 =(ImageButton)findViewById(R.id.todo1);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6 = new Intent(Activity3.this,ToDoList.class);
                startActivity(i6);
            }
        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


    }

}
