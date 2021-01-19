package com.example.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Unitati extends AppCompatActivity {

    private ListView listView;

    private String hospitalsName[]={
            "Spitalul Judeţean de Urgenţă ",
            "Spitalul Orăşenesc \"Regele Carol I\" ",
            "Spitalul de Psihiatrie \"Sf. Maria\" ",
            "Spitalul de Pneumoftiziologie Cronici ",
            "Spitalul de Pneumoftiziologie \"Sf. Andrei\" ",
            "Spitalul de Recuperare Brădet ",
            "Spitalul de Geriatrie şi Boli Cronice \"C-tin Bălăceanu Stolnici\"  ",

    };

    private String hospitalsAddress[]={
            "Str. Aleea Spitalului nr.36",
            "Str. Industriei nr.19",
            "Str. Principală",
            "Str. Coloniei nr.106",
            "Str. Valea Iaşului",
            "Str. Bradet",
            "Str. Coasta Câmpului nr.54",

    };

    private String hospitalsCity[]={
            "Pitesti","Costesti","Vedea","Leordeni","Valea Iasului","Bradulet","Stefanesti"
    };

    private String hospitalsPhone[]={
            "0248-287.150","0248-673.550","0248-248.109","0248-653.694","0248-724.431"," 0248-267.755","0248-266.929"
    };

    private String hospitalsEmail[]={
            "spiturgag01@yahoo.com",
            "spitalcostesti@yahoo.com",
            "sfmariapsih@yahoo.com",
            "contact@spitalleordeni.ro",
            "postmaster@spviasului.ro",
            "spitalbradet@yahoo.com",
            "spitalul_stefanesti@yahoo.com",

    };

    private Integer[] imageid ={
            R.drawable.spjudetean,
            R.drawable.spitalulcostesti,
            R.drawable.spvedea,
            R.drawable.spleordeni,
            R.drawable.spviasului,
            R.drawable.spbradet,
            R.drawable.spstefanesti,

    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unitati);

        listView=(ListView) findViewById(R.id.hospitalsList);
        customListView customList=new customListView(this,hospitalsName,hospitalsAddress,hospitalsCity,hospitalsPhone,hospitalsEmail,imageid);

        listView.setAdapter(customList);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i= new Intent(getApplicationContext(),hospitalDetails.class);
                i.putExtra("name",hospitalsName[position]);
                i.putExtra("address",hospitalsAddress[position]);
                i.putExtra("city",hospitalsCity[position]);
                i.putExtra("phone",hospitalsPhone[position]);
                i.putExtra("email",hospitalsEmail[position]);
                i.putExtra("image",imageid[position]);
                i.putExtra("id",position);
                startActivity(i);

            }
        });
    }

}