package com.example.finalproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class Informatii extends AppCompatActivity {

    String[] Measures={
            "1.   Spălatul mâinilor frecvent – cu apă și săpun sau cu dezinfectant de mâini pe bază de alcool – elimină virusul dacă acesta se află pe mâini.",
            "2.   Practicați igiena respiratorie – când tușiți sau strănutați, acoperiți gura cu cotul flexat sau un șervețel care va fi aruncat imediat la coș, apoi spălați mâinile cu apă și săpun – făcând acest lucru, împiedicați răspândirea germenilor și a virusurilor. Dacă puneți mâna la gură când tușiți, puteți contamina ulterior obiectele și suprafețele care le atingeți.",
            "3.   Mențineți distanța – păstrați o distanță de cel puțin 1 metru față de persoanele care tușesc sau au febră – când acestea tușesc sau strănută se eliberează mici picături de salivă care pot conține virusul, iar dacă sunteți prea aproape de ele le puteți inhala.",
            "4.   Evitați atingerea ochilor, nasului și a gurii – mâinile vin în contact cu multe suprafețe care pot fi contaminate iar prin atingerea ochilor, nasului și a gurii favorizăm infectarea cu virusuri.",
            "5.   Dacă aveți febră, dificultăți de respirație și tușiți, sunați medicul de familie – spuneți-i acestuia dacă ați călătorit recent în afara țării sau ați avut contact apropiat cu o persoană care s-a întors recent din aceste zone și are simptome respiratorii.",
            "6.   Dacă aveți simptome respiratorii ușoare și nu ați călătorit în străinătate sau nu ați intrat în contact cu o persoană care s-a întors recent – practicați igiena mâinilor și a respirației, stați la domiciliu până vă simțiți bine, dacă este posibil.",
            "7.   Nu urmați niciun fel de tratament fără ca aceste să fie recomandat de medic.",
            "8.   Animalele de companie nu transmit noul coronavirus – nu există dovezi că animalele de companie, câini și pisici, pot fi infectate de virus. În orice caz, trebuie să ne spălăm tot timpul mâinile cu apă și săpun după ce intrăm în contact cu animalele de companie.",
            "9.   Curățați suprafețele cu dezinfectanți pe bază de clor sau alcool – dezinfectanți ce conțin, clor, înnălbitori, solvent, etanol de 75%, acid paracetic și cloroform pot ucide noul coronavirus.",
            "10.  Evitați zonele aglomerate, mijloacele de transport în comun.",
            "11.  Alegeți să vă informați din surse oficiale.",
            "12.  Purtând o mască medicală (dacă avem simptome respiratorii) putem ajuta la împiedicarea răspândirii unor afecțiuni respiratorii. Totuși, doar această măsură nu garantează oprirea infecțiilor și ar trebui combinată cu celelalte măsuri de prevenție: igiena mâinilor și a respirației, păstrarea distanței de cel puțin 1 metru între persoane."
    };

    ListView lvMeasures;
    Button btnWebInfo;
    TextView statisticsRo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informatii);
        setList();
        webSearch();

    }

    public void setList(){
        lvMeasures=findViewById(R.id.measureList);
        ArrayAdapter<String> measuresAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,Measures);
        lvMeasures.setAdapter(measuresAdapter);
    }

    public void webSearch(){
        btnWebInfo=(Button) findViewById(R.id.btnOnWeb);
        statisticsRo=(TextView) findViewById(R.id.webStatistics);

        btnWebInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url="https://www.google.ro/search?sxsrf=ALeKk02HdCNqIZ0aUFIFB02679r8rnN2uw%3A1610890727593&ei=5z0EYN7gI-firgS21aO4Ag&q=covid+19+preventie&oq=covid+19+preventie&gs_lcp=CgZwc3ktYWIQAzICCAAyBggAEBYQHjIICAAQFhAKEB46BAgAEEM6BwgAELEDEEM6CggAELEDEIMBEEM6CAgAELEDEIMBOgQIIxAnOgUIABCxAzoECAAQCjoFCAAQywE6CggAELEDEIMBEApQivw5WMiZOmCImzpoAXACeAGAAaMBiAGUEJIBBDE2LjWYAQCgAQGqAQdnd3Mtd2l6wAEB&sclient=psy-ab&ved=0ahUKEwie8NvMi6PuAhVnsYsKHbbqCCcQ4dUDCA0&uact=5";
                Intent i= new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        statisticsRo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.ro/search?sxsrf=ALeKk00Hleq757BNDPu6kBNfhZ6ums-ZVw%3A1610890721442&ei=4T0EYNm9GqayrgT18pzQBA&q=statistici+covid&oq=statistici+covid&gs_lcp=CgZwc3ktYWIQAzICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCAA6BwgjEOoCECc6CQgjEOoCECcQEzoECCMQJzoECAAQQzoICAAQsQMQgwE6BQgAELEDOggILhCxAxCDAToKCAAQxwEQowIQQzoHCAAQsQMQQzoOCAAQsQMQgwEQxwEQowI6AgguOgoIABDHARCvARBDOgQIABADOgcILhCxAxBDOgQILhBDOg4IABCxAxCDARDHARCvAToFCCEQoAFQshBY0ilgkytoA3AAeACAAYUCiAGeFJIBBjAuMTYuMpgBAKABAaoBB2d3cy13aXqwAQrAAQE&sclient=psy-ab&ved=0ahUKEwiZsuTJi6PuAhUmmYsKHXU5B0oQ4dUDCA0&uact=5";
                Intent i=new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }

}