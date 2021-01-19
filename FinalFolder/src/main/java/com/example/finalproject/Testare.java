package com.example.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Testare extends AppCompatActivity {

    Button btnGallery;
    ImageButton btnResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testare);

        btnGallery=(Button) findViewById(R.id.testGalleryButton);
        btnResults=(ImageButton) findViewById(R.id.resultsButton);

        btnGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Testare.this,UnitatiTestare.class);
                startActivity(i);
            }
        });


        btnResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Testare.this,Rezultate.class);
                startActivity(i);
            }
        });

    }

}