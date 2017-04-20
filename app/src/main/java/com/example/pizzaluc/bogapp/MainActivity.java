package com.example.pizzaluc.bogapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.pizzaluc.bogapp.R.id.but1;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View[] sems = new View[]{findViewById(R.id.Sem_1), findViewById(R.id.Seme_2), findViewById(R.id.Seme_3),findViewById(R.id.Seme_4),findViewById(R.id.Seme_5),findViewById(R.id.Seme_6)};


        for(int i = 0; i <= 5; i++) {
            sems[i].setVisibility(View.GONE);
        }


        }






    public void LUL(View v){

        View[] buts = new View[]{findViewById(R.id.but1), findViewById(R.id.but2), findViewById(R.id.but3),findViewById(R.id.but4),findViewById(R.id.but5),findViewById(R.id.but6)};
        View[] sems = new View[]{findViewById(R.id.Sem_1), findViewById(R.id.Seme_2), findViewById(R.id.Seme_3),findViewById(R.id.Seme_4),findViewById(R.id.Seme_5),findViewById(R.id.Seme_6)};



        for(int i = 0; i <= 5; i++) {
            if (v.getId() == buts[i].getId()) {
                Button button = (Button) buts[i];
                if (sems[Integer.parseInt(button.getHint().toString())-1].getVisibility() == View.GONE) {
                    System.out.println("GONE");
                    sems[Integer.parseInt(button.getHint().toString())-1].setVisibility(View.VISIBLE);
                } else{
                    System.out.println("NOT GONE");
                    sems[Integer.parseInt(button.getHint().toString())-1].setVisibility(View.GONE);
                    }


                }
            }
    }



    public void LUL3(View v){

        /*
        ArrayList<String> imageUris = new ArrayList<>();
        imageUris.add("LUL123"); // Add your image URIs here
        imageUris.add("LUL321");

        Intent shareIntent = new Intent(this, Bog.class);
        shareIntent.putExtra(imageUris);
        startActivity(Intent.createChooser(shareIntent, "Share images to.."));
        */



        TextView text = (TextView) v.findViewById(R.id.Titel);
        String titel = text.getText().toString();

        TextView text2 = (TextView) v.findViewById(R.id.Forfatter);
        String forfatter = text2.getText().toString();

        TextView text3 = (TextView) v.findViewById(R.id.ISBN);
        String isbn = text3.getText().toString();

        //TextView text4 = (TextView) v.findViewById(R.id.Resume);
        //String resume = text4.getText().toString();

        Bundle b=new Bundle();
        b.putStringArray("KEY", new String[]{titel, forfatter, isbn});
        Intent Bog=new Intent(this, Bog.class);
        Bog.putExtras(b);
        startActivity(Bog);

        //Intent GotoBog = new Intent (this, Bog.class);
        //startActivity(GotoBog);

    }
}
