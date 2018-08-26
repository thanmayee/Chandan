package com.example.panyt.chandan;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.app.Activity;
import android.app.AlertDialog;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FilterQueryProvider;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Activity6 extends AppCompatActivity {

    Button nextbutton, previousbutton;

    EditText word, meaning;
    SQLiteDatabase database;
    Cursor cursor;
    String GetQuery;

    String GetWord, GetMeaning;
    TextView idtextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);
        nextbutton = (Button) findViewById(R.id.shownext);
        previousbutton = (Button) findViewById(R.id.showprevious);
        word = (EditText) findViewById(R.id.DisplayWord);
        meaning = (EditText) findViewById(R.id.DisplayMeaning);
        idtextview = (TextView)findViewById(R.id.textview1);

        GetQuery = "SELECT * FROM th";
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

        word.setText(cursor.getString(1).toString());

        meaning.setText(cursor.getString(2).toString());
    }
}
