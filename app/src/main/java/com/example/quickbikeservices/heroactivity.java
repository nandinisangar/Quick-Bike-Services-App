package com.example.quickbikeservices;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class heroactivity extends AppCompatActivity {
    private Spinner spinner1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroactivity);
        spinner1 = findViewById(R.id.spinner_id1);
        String [] filters = {"Areas ","Services"};
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,filters);
        spinner1.setAdapter(adapter);
    }
}