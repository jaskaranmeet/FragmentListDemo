package com.example.hp.fragmentlistdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Hp on 28-Mar-17.
 */

public class MyAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<SingleRow> singleRowArrayList;
    private LayoutInflater inflater;

    public MyAdapter(Context context, ArrayList<SingleRow> singleRowArrayList) {
        this.context = context;
        this.singleRowArrayList = singleRowArrayList;
    }

    @Override
    public int getCount() {
        return singleRowArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return singleRowArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.singlerow, parent, false);

        //find all views of singlerow.xml
        TextView txtnam = (TextView) convertView.findViewById(R.id.txtname);
        TextView txtdes = (TextView) convertView.findViewById(R.id.txtdesc);
        ImageView imagevie = (ImageView) convertView.findViewById(R.id.imageview);


        //geeting data from adapter

        SingleRow singleRow = singleRowArrayList.get(position);
        String name = singleRow.getName();
        String desc = singleRow.getDesc();
        int image = singleRow.getImage();

        //setting data
        txtnam.setText(name);
        txtdes.setText(desc);
        imagevie.setImageResource(image);
        return convertView;
    }
}

