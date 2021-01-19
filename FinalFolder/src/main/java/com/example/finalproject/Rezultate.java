package com.example.finalproject;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Rezultate extends AppCompatActivity {
    DatabaseHelper myDb;

    EditText getCNP;
    EditText putName;
    EditText putCNP;
    EditText putPhone;
    Button loginBtn;
    Button insertBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rezultate);

        putName=(EditText) findViewById(R.id.insert_name);
        putCNP=(EditText) findViewById(R.id.insert_cnp);
        putPhone=(EditText) findViewById(R.id.insert_phone);

        getCNP=(EditText) findViewById(R.id.editCNP);

        loginBtn=(Button) findViewById(R.id.conButton);

        insertBtn=(Button) findViewById(R.id.submit);




        myDb=new DatabaseHelper(this);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cnp=getCNP.getText().toString().trim();

                Cursor myCursor=myDb.getData(cnp);
                StringBuffer Name= new StringBuffer();
                StringBuffer Phone= new StringBuffer();
                if(myCursor.getCount()==0) Toast.makeText(getBaseContext(), "CNP-ul nu exista in baza de date",Toast.LENGTH_SHORT).show();
                else{
                    while(myCursor.moveToNext()) {
                        Name.append(myCursor.getString(1));

                        Phone.append(myCursor.getString(2));

                        Intent i = new Intent(Rezultate.this, logged.class);
                        i.putExtra("name", Name.toString());
                        i.putExtra("phone", Phone.toString());

                        startActivity(i);
                    }
                }
            }
        });


        insertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nume=putName.getText().toString().trim();
                String cnpA=putCNP.getText().toString().trim();
                String telefon=putPhone.getText().toString().trim();

                if(myDb.insertData(nume,cnpA,telefon)){
                    Toast.makeText(getBaseContext(),"Data added", Toast.LENGTH_SHORT).show();

                }
                else Toast.makeText(getBaseContext(),"Error", Toast.LENGTH_SHORT).show();
            }
        });





    }

}