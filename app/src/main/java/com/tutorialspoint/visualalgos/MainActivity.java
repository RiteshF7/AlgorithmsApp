package com.tutorialspoint.visualalgos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int left=20,top=20,bottom=20,right=20;
        LinearLayout linearLayout = findViewById(R.id.linear_layout);
        //Adding 2 TextViews
        for (int i = 1; i <= 2; i++) {
            TextView textView = new TextView(this);
            textView.setText("TextView " + String.valueOf(i));
            linearLayout.addView(textView);

            LinearLayout.LayoutParams params1 = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );
            params1.setMargins(left, top, right, bottom);

            //Don't forget to set this param to your TextView
            textView.setLayoutParams(params1);

            textView.setPadding(left, top, right, bottom);
        }


        Intent intent = new Intent(MainActivity.this,SelectionSort.class);
        startActivity(intent);


    }
}
