package com.example.finalproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class UnitatiTestare extends AppCompatActivity {


    private ListView listView;

    private String[] centerNames={
            "Spitalul Judetean de Urgenta Pitesti",
            "Spitalul Orasenesc Sf.Spiridon Mioveni",
            "Spitalul Municipal Campulung"
    };

    private String[] centerAddresses={
            "Aleea Spitalului 36",
            "Bulevardul Dacia 131A",
            "Strada Doctor Costea 8"
    };

    private String[] centerCities={
            "Pitesti",
            "Mioveni",
            "Campulung"
    };

    private String[] centerPhones={
            "0248 287 150",
            "0248 433 877",
            "0248 5100 100"
    };

    private Integer[] imageID={
            R.drawable.spjudetean,R.drawable.spjudetean,R.drawable.spstefanesti
    };

    private String[] Email={
            "","",""
    };

    private String[] programmingPages={
            "http://www.programari.sjupitesti.ro/",
            "http://spitalmioveni.ro/servicii-pacienti/prima-vizita-in-ambulatoriu/program-ambulatoriu/",
            "http://www.smcampulung.ro/"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unitati_testare);

        listView=(ListView) findViewById(R.id.centersList);
        customListView customList= new customListView(this,centerNames,centerAddresses,centerCities,centerPhones,Email,imageID);

        listView.setAdapter(customList);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i=new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(programmingPages[position]));
                startActivity(i);
            }
        });
    }

}