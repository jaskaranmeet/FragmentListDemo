package com.example.hp.fragmentlistdemo;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private SingleRow singleRow;
    private ArrayList<SingleRow> singleRowArrayList;
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lv= (ListView) findViewById(R.id.lv);



        String name[] = {"raj", "as", "asd", "dhsk", "dsha", "dyds", "dsfe", "gdj", "xsbahd", "fgf"};
        String desc[] = {"this is desc", "this is desc", "this is desc", "this is desc", "this is desc", "this is desc", "this is desc", "this is desc", "this is desc", "this is desc"};
        int image[] = {R.drawable.image,R.drawable.image, R.drawable.image, R.drawable.image, R.drawable.image, R.drawable.image, R.drawable.image, R.drawable.image, R.drawable.image, R.drawable.image};

        singleRowArrayList = new ArrayList<>();
        for (int i = 0; i < name.length; i++)
        {
            singleRow = new SingleRow(name[i], desc[i], image[i]);
            singleRowArrayList.add(singleRow);
        }
        MyAdapter adapter= new MyAdapter(this,singleRowArrayList);
        lv.setAdapter(adapter);

    }
    }

