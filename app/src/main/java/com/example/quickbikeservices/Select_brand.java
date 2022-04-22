package com.example.quickbikeservices;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Select_brand extends AppCompatActivity {
CardView cv1 , cv2,cv3,cv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_brand);
        getSupportActionBar().hide();
        cv1 = findViewById(R.id.cardview_hero);
        cv2 = findViewById(R.id.cardview_honda);
        cv3 = findViewById(R.id.cardview_Bajaj);
        cv4 = findViewById(R.id.cardview_general);
        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Select_brand.this,Homepage.class);
                startActivity(i);
            }
        });

        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Select_brand.this,Homepage.class);
                startActivity(i);
            }
        });

        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Select_brand.this,Homepage.class);
                startActivity(i);
            }
        });
        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Select_brand.this,Homepage.class);
                startActivity(i);
            }
        });
    }
}