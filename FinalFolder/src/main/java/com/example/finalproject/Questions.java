package com.example.finalproject;

public class Questions {

    public String vectIntreb[]={
            "Ati venit dintr-o tara afectata de COVID-19?",
            "Ați interacționat în ultimele 14 zile cu persoane infectate cu Coronavirus SARS-CoV-2 ?",
            "Va simtiti rau?",
            "Ați participat în ultimele 14 zile la petreceri ce au presupus aglomerări de persoane venite din zone afectate?",


    };
    public String vectRasp[][]={
            {"Da","Nu"},
            {"Da","Nu"},
            {"Da","Nu"},
            {"Da","Nu"}
    };
    public String raspCorecte[]={"Da", "Da", "Da","Da"};

    public String getIntrebare(int i){
        return vectIntreb[i];
    }
    public String getRaspA(int i){
        return vectRasp[i][0];
    }
    public String getRaspB(int i){
        return vectRasp[i][1];
    }
    public String getRaspCorect(int i){
        return raspCorecte[i];
    }
}
