package com.example.hdavis.example;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MenuBarView extends LinearLayout {

    Button mainButton;
    Button secondButton;

    public MenuBarView(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        layoutInflater.inflate(R.layout.menu_bar_view, this, true);

        mainButton = findViewById(R.id.main_button);
        secondButton = findViewById(R.id.second_button);

        mainButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity.class);
                context.startActivity(intent);
            }
        });

        secondButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, SecondActivity.class);
                context.startActivity(intent);
            }
        });
    }



}
