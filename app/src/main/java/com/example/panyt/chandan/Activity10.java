package com.example.panyt.chandan;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity10 extends AppCompatActivity {
    Button nextbutton, previousbutton;

    EditText name, comment;
    SQLiteDatabase database;
    Cursor cursor;
    String GetQuery;

    String GetWord, GetMeaning;
    TextView idtextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_10);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        nextbutton = (Button) findViewById(R.id.Show_next);
        previousbutton = (Button) findViewById(R.id.Show_previous);
        name = (EditText) findViewById(R.id.DisplayName);
        comment = (EditText) findViewById(R.id.DisplayComment);
        idtextview = (TextView)findViewById(R.id.textview1);

        GetQuery = "SELECT * FROM th7";
        database = openOrCreateDatabase("Chandan_Vocab", MODE_PRIVATE, null);
        cursor = database.rawQuery(GetQuery, null);
        cursor.moveToFirst();
        GetDBRecords();
        nextbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!cursor.isLast()) {
                    cursor.moveToNext();
                }
                GetDBRecords();

            }
        });
        previousbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!cursor.isFirst()) {
                    cursor.moveToPrevious();
                }
                GetDBRecords();

            }
        });
    }
    public void GetDBRecords(){
        idtextview.setText(cursor.getString(0));

        name.setText(cursor.getString(1).toString());

        comment.setText(cursor.getString(2).toString());
    }


    }


