package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    List<Pojo> list;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);

        listShow();
        myAdapter = new MyAdapter(this,list);
        listView.setAdapter(myAdapter);

    }

    private void listShow(){

        list = new ArrayList<>();
        list.add(new Pojo(R.drawable.banana,"Banana","This is Banana"));
        list.add(new Pojo(R.drawable.stawbery,"Strawberry","This is Strawberry"));
        list.add(new Pojo(R.drawable.apple,"Apple","This is Apple"));
        list.add(new Pojo(R.drawable.pineapple,"Pine Apple","This is Pine Apple"));
        list.add(new Pojo(R.drawable.pear,"Pear","This is Pear"));
        list.add(new Pojo(R.drawable.pomegranate,"Pomegranate","This is Pomegranate"));
        list.add(new Pojo(R.drawable.orange,"Orange","This is Orange"));
        list.add(new Pojo(R.drawable.mango,"Mango","This is Mango"));
        list.add(new Pojo(R.drawable.blackberry,"Black Berry","This is Black Berry"));
        list.add(new Pojo(R.drawable.cherries,"Cherries","This is Cherries"));

    }

}