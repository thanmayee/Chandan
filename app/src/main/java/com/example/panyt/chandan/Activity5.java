package com.example.panyt.chandan;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import java.util.Locale;
import android.content.Context;
import android.app.AlertDialog;
import android.widget.EditText;

public class Activity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        Button b1,b2;
        final Context context=this;
        b1 =(Button)findViewById(R.id.add_new) ;
        final SQLiteDatabase mydatabase = openOrCreateDatabase("Chandan_Vocab",MODE_PRIVATE,null);
        mydatabase.setVersion(1);
        mydatabase.setLocale(Locale.getDefault());
        //final String Create_Table_Vocab = "CREATE TABLE th("+ "id INTEGER PRIMARY KEY AUTOINCREMENT,"+",Word, TEXT"+",Meaning, TEXT);";
        mydatabase.execSQL("CREATE TABLE IF NOT EXISTS th(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,Word VARCHAR,Meaning VARCHAR);");
        b1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {


                 LayoutInflater li = LayoutInflater.from(context);
                 View promptlist =li.inflate(R.layout.vocab,null);
                 AlertDialog.Builder adb = new AlertDialog.Builder(context);
                 adb.setView(promptlist);
               final EditText word =(EditText)promptlist.findViewById(R.id.word);
               final EditText meaning =(EditText)promptlist.findViewById(R.id.meaning);
               Button btn =(Button)findViewById(R.id.add);
                adb.setCancelable(false).setPositiveButton("Add", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String a =word.getText().toString();
                        String b = meaning.getText().toString();
                        //ContentValues v = new ContentValues();
                        //v.put("Word",a);
                        //v.put("Meaning",b);
                       // mydatabase.insertOrThrow("th",null,v);
                        String sqldb ="INSERT INTO th(Word,Meaning) VALUES('"+a+"','"+b+"');";
                        mydatabase.execSQL(sqldb);
                    }

                })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });

                AlertDialog ad =adb.create();
                ad.show();

             }

         });
        b2=(Button)findViewById(R.id.display);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Activity5.this,Activity6.class);
                startActivity(i1);
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
