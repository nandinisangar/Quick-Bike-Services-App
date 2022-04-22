package com.example.quickbikeservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Select_Bike extends AppCompatActivity {
    LinearLayout l ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_bike);
        getSupportActionBar().hide();
        l = findViewById(R.id.click_bike);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Select_Bike.this,Select_brand.class);
                startActivity(i);
            }
        });

    }
}