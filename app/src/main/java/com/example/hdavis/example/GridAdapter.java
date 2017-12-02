package com.example.hdavis.example;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class GridAdapter extends BaseAdapter {

    private Context context;

    // references to our images
    private List<String> stringList = new ArrayList<>();

    public GridAdapter(Context context) {
        this.context = context;

        for (int i=0; i<200; i++) {
            stringList.add(""+i);
        }
    }

    @Override
    public int getCount() {
        return stringList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Button button;

        if (convertView == null) {
            button = new Button(context);
            button.setLayoutParams(new GridView.LayoutParams(85, 85));
            button.setPadding(8, 8, 8, 8);
        }
        else {
            button = (Button)convertView;
        }

        button.setText(stringList.get(position));
        return button;
    }
}
