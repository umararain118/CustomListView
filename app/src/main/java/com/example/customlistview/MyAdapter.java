package com.example.customlistview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MyAdapter extends BaseAdapter {
    Context context;
    List<Pojo> pojoList;


    public MyAdapter (Context context, List<Pojo> pojoList){
        this.context = context;
        this.pojoList = pojoList;
    }

    @Override
    public int getCount() {
        return pojoList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }



    @Override
    public View getView(int i, View view, ViewGroup parent) {

        view  = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);

        ImageView imageView = view.findViewById(R.id.image);
        TextView title = view.findViewById(R.id.title);
        TextView description= view.findViewById(R.id.desc);

        title.setText(pojoList.get(i).getTitle());
        description.setText(pojoList.get(i).getDescription());
        imageView.setImageResource(pojoList.get(i).getImage());

        view.setOnClickListener(view1 -> Toast.makeText(context,"Position"+i,Toast.LENGTH_SHORT).show());

        return view;
    }



}
