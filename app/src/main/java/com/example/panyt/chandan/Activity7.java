package com.example.panyt.chandan;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static android.view.View.VISIBLE;

public class Activity7 extends AppCompatActivity {
RadioGroup q1,q2,q3,q4,q5,q6,q7;
RadioButton q1c1,q2c2,q3c4,q4c1,q5c4,q6c2,q7c2;
int s1=0,s2=0,s3=0,s4=0,s5=0,s6=0,s7=0,final_score=0;
Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        submit=(Button)findViewById(R.id.SubmitQuiz);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswers();
            }
        });

    }
    public void checkAnswers(){
         q1c1 = (RadioButton)findViewById(R.id.question1choice1);
         if(q1c1.isChecked())
         {
             s1=s1+1;
         }
        q2c2 = (RadioButton)findViewById(R.id.question2choice2);
        if(q2c2.isChecked())
        {
            s2=s2+1;
        }
        q3c4 = (RadioButton)findViewById(R.id.question3choice4);
        if(q3c4.isChecked())
        {
            s3=s3+1;
        }
        q4c1 =(RadioButton)findViewById(R.id.question4choice1);
        if(q4c1.isChecked())
        {
            s4=s4+1;
        }
        q5c4 = (RadioButton)findViewById(R.id.question5choice4);
        if(q5c4.isChecked())
        {
            s5=s5+1;
        }
        q6c2 =(RadioButton)findViewById(R.id.question6choice2);
        if(q6c2.isChecked())
        {
            s6=s6+1;
        }
        q7c2 =(RadioButton)findViewById(R.id.question7choice2);
        if(q7c2.isChecked())
        {
            s7=s7+1;
        }
         final_score =s1+s2+s3+s4+s5+s6+s7;
        Toast.makeText(getApplicationContext(),"Your score:"+final_score,Toast.LENGTH_SHORT).show();
        q1c1.setChecked(false);
        q2c2.setChecked(false);
        q3c4.setChecked(false);
        q4c1.setChecked(false);
        q5c4.setChecked(false);
        q6c2.setChecked(false);
        q7c2.setChecked(false);
        Intent i1 = new Intent(Activity7.this,Activity3.class);
        startActivity(i1);

    }
    }


