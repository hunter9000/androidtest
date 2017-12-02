package com.example.hdavis.example;

import android.app.Activity;
import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    GridView gridView;
    ListView listView;

    ArrayList<String> listItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridview);
        listView = findViewById(R.id.listview);

        // setup list view
        for (int i=0; i<200; i++) {
            listItems.add(""+i);
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.list_adapter_items, listItems);

        listView.setAdapter(arrayAdapter);

        // set up grid view

        gridView.setAdapter(new GridAdapter(this));

    }
}
