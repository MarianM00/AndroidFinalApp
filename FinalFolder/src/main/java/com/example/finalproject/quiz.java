package com.example.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class quiz extends AppCompatActivity {

    Button raspA,raspB;
    TextView tvScor,tvIntrebare, tvIntNo;
    private Questions vectIntrebari = new Questions();
    private String rasp;
    private int scor=0;
    private int nrIntrebari=vectIntrebari.vectIntreb.length;
    static  int index=0;
    int i = 0;
    private int nrIntReal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        setTitle("Quiz COVID-19");
        raspA = findViewById(R.id.btnRaspA);
        raspB = findViewById(R.id.btnRaspB);
        tvIntrebare = findViewById(R.id.tvIntrebare);
        tvScor = findViewById(R.id.tvScor);
        tvIntNo = findViewById(R.id.tvIntNo);
        index = 0;
        nrIntReal = index+1;
        tvIntNo.setText("Intrebarea #" + nrIntReal + "/" + nrIntrebari);
        actIntrebare(index);
        raspA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (raspA.getText() == rasp) {
                    scor++;
                    tvScor.setText("scor" + scor);
                }
                if(index < nrIntrebari-1){
                    index++;
                    actIntrebare(index);
                }
                else{
                    //Toast.makeText(getBaseContext(), "Felicitari, ai terminat testul cu " + scor + " puncte !", Toast.LENGTH_SHORT).show();
                    if(scor > 0) {
                        Intent intent = new Intent(getApplicationContext(), SendMail.class);
                        intent.putExtra("scor", String.valueOf(scor));
                        startActivity(intent);
                    }
                    finish();
                }
                nrIntReal = index+1;
                tvIntNo.setText("Intrebarea #" + nrIntReal + "/" + nrIntrebari);
            }
        });
        raspB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (raspB.getText() == rasp) {
                    scor++;
                    tvScor.setText("Scor: " + scor);
                }
                if(index < nrIntrebari-1){
                    index++;
                    actIntrebare(index);
                }
                else{
                    //Toast.makeText(getBaseContext(), "Felicitari, ai terminat testul cu " + scor + " puncte !", Toast.LENGTH_SHORT).show();
                    if(scor > 0) {
                        Intent intent = new Intent(getApplicationContext(), SendMail.class);
                        intent.putExtra("scor", String.valueOf(scor));
                        startActivity(intent);
                    }
                    finish();
                }
                nrIntReal = index+1;
                tvIntNo.setText("Intrebarea #" + nrIntReal + "/" + nrIntrebari);
            }
        });

    }
    private void actIntrebare(int i){
        tvIntrebare.setText(vectIntrebari.getIntrebare(i));
        raspA.setText(vectIntrebari.getRaspA(i));
        raspB.setText(vectIntrebari.getRaspB(i));
        rasp=vectIntrebari.getRaspCorect(i);
    }
}