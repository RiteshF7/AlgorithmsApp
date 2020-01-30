package com.tutorialspoint.visualalgos;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SelectionSort extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_sort);
        LinearLayout linearLayout = findViewById(R.id.selection_sort_main);

        for(int i=0;i<5;i++){
            TextView textView = new TextView(this);
            textView.setBackgroundColor(Color.RED);
            textView.setHeight(300);
            textView.setWidth(50);
            LinearLayout.LayoutParams params1 = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );
            params1.setMargins(10,10,10,10);
            textView.setLayoutParams(params1);
            textView.setPadding(50,10,50,10);
            textView.setText(i+"");
            textView.setTextColor(Color.WHITE);
            linearLayout.addView(textView);
        }

    }
}
