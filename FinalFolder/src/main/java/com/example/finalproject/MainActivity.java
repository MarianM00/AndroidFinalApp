package com.example.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnInfo,btnTest,btnUnitati,btnChestionar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickedButton();

    }

    public void clickedButton(){
        btnInfo=(Button) findViewById(R.id.covidInfo);
        btnTest=(Button) findViewById(R.id.covidTest);
        btnUnitati=(Button) findViewById(R.id.covidUnitati);
        btnChestionar=(Button) findViewById(R.id.covidChestionar);

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Informatii.class);
                startActivity(i);
            }
        });

        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,Testare.class);
                startActivity(i);
            }
        });

        btnUnitati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,Unitati.class);
                startActivity(i);
            }
        });

        btnChestionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,quiz.class);
                startActivity(i);
            }
        });

    }

}