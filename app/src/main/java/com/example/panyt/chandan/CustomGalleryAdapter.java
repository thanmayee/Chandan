package com.example.panyt.chandan;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class CustomGalleryAdapter extends BaseAdapter {
    private Context context;
    private int[] images;
    public CustomGalleryAdapter(Context c,int[] images)
    {
        context =c;
        this.images=images;

    }
    public int getCount(){
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }
    public long getItemId(int position)
    {
        return  position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageview = new ImageView(context);
        imageview.setImageResource(images[position]);
        imageview.setLayoutParams(new Gallery.LayoutParams(200,200));
        return imageview;
    }
}
