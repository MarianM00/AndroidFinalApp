package com.example.finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class logged extends AppCompatActivity {


    TextView patientName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged);

        patientName=(TextView) findViewById(R.id.tvName5);

        String name=getIntent().getStringExtra("name");
        String phone=getIntent().getStringExtra("phone");

        patientName.setText(name);
    }

}