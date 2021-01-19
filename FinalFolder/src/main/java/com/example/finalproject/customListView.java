package com.example.finalproject;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class customListView extends ArrayAdapter {

    private String[] hospitalName;
    private String[] hospitalAddress;
    private String[] hospitalCity;
    private String[] hospitalPhone;
    private String[] hospitalEmail;
    private Integer[] imageid;

    private Activity context;

    public customListView(Activity context, String[] hospitalName, String[] hospitalAddress, String[] hospitalCity, String[] hospitalPhone, String[] hospitalEmail,Integer[] imageid){
        super(context, R.layout.hospital_row_item,hospitalName);

        this.context=context;
        this.hospitalName=hospitalName;
        this.hospitalAddress=hospitalAddress;
        this.hospitalCity=hospitalCity;
        this.hospitalPhone=hospitalPhone;
        this.hospitalEmail=hospitalEmail;
        this.imageid=imageid;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View row=convertView;
        LayoutInflater inflater= context.getLayoutInflater();

        if(convertView==null) row=inflater.inflate(R.layout.hospital_row_item,null,true);

        TextView tvName=(TextView) row.findViewById(R.id.name);
        TextView tvAddress=(TextView) row.findViewById(R.id.address);
        TextView tvCity=(TextView) row.findViewById(R.id.city);
        TextView tvPhone=(TextView) row.findViewById(R.id.phone);
        TextView tvEmail=(TextView) row.findViewById(R.id.email);
        ImageView ivHospital=(ImageView) row.findViewById(R.id.imageViewPic);

        tvName.setText(hospitalName[position]);
        tvAddress.setText(hospitalAddress[position]);
        tvCity.setText(hospitalCity[position]);
        tvPhone.setText(hospitalPhone[position]);
        tvEmail.setText(hospitalEmail[position]);
        ivHospital.setImageResource(imageid[position]);

        return row;
    }



}
