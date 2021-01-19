package com.example.finalproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class hospitalDetails extends AppCompatActivity {


    String urlHospitals[]={
            "https://www.sjupitesti.ro",
            "https://www.spitalregelecarol.ro",
            "https://www.spitalpsihiatriesfmaria.ro",
            "https://www.spitalleordeni.ro",
            "https://www.spviasului.ro",
            "https://www.spitalbradet.ro",
            "https://www.spitaluldegeriatriestefanesti.ro",
            "https://www.spitaluldebolicronicecalinesti.ro",
            "https://www.pediatriepitesti.ro"
    };

    Button btnSearch;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_details);

        Intent i=getIntent();
        int idHospital=i.getExtras().getInt("id");
        String name=i.getExtras().getString("name");
        String address=i.getExtras().getString("address");
        String city=i.getExtras().getString("city");
        String phone=i.getExtras().getString("phone");
        String email=i.getExtras().getString("email");
        int imageID=i.getExtras().getInt("image");

        ImageView ivHospital=(ImageView) findViewById(R.id.hospitalImage);
        TextView tvName=(TextView) findViewById(R.id.textName);
        TextView tvAddress=(TextView) findViewById(R.id.textAddress);
        TextView tvCity=(TextView) findViewById(R.id.textCity);
        TextView tvPhone=(TextView) findViewById(R.id.textPhone);
        TextView tvEmail=(TextView) findViewById(R.id.textEmail);

        tvName.setText(name);
        tvAddress.setText(address);
        tvCity.setText(city);
        tvPhone.setText(phone);
        tvEmail.setText(email);
        ivHospital.setImageResource(imageID);

        openWeb(idHospital);

    }

    public void openWeb(final int p){

        btnSearch=(Button) findViewById(R.id.openSite);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent j= new Intent(Intent.ACTION_VIEW);
                j.setData(Uri.parse(urlHospitals[p]));
                startActivity(j);
            }
        });

    }

}