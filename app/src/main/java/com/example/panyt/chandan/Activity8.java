package com.example.panyt.chandan;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;


public class Activity8 extends AppCompatActivity {
    Gallery simplegallery;
    CustomGalleryAdapter customgalleryadapter;
    ImageView imgView;
     int[] imageResource = {
            R.mipmap.chan5, R.mipmap.chan1,
            R.mipmap.chan2, R.mipmap.chan3,
            R.mipmap.chan4, R.mipmap.chan6,
            R.mipmap.chan7, R.mipmap.chandan,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8);

        imgView = (ImageView) findViewById(R.id.selectedimage);
        simplegallery = (Gallery) findViewById(R.id.gallery);
        customgalleryadapter = new CustomGalleryAdapter(getApplicationContext(),imageResource);
        simplegallery.setAdapter(customgalleryadapter);
        simplegallery.setSpacing(10);
        simplegallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                imgView.setImageResource(imageResource[position]);
            }
        });

    }

}