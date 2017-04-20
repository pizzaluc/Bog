package com.example.pizzaluc.bogapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Bog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bog);



        Bundle b=this.getIntent().getExtras();
        String[] array=b.getStringArray("KEY");

        System.out.println(array[0] + " " + array[1] + " " + array[2] + " " + array[3-1]);

        TextView titel = (TextView) findViewById(R.id.Titel);
        titel.setText(array[0]);

        TextView forfatter = (TextView) findViewById(R.id.Forfatter);
        forfatter.setText(array[1]);

        TextView isbn = (TextView) findViewById(R.id.ISBN);
        isbn.setText(array[2]);

        //TextView resume = (TextView) findViewById(R.id.Resume);
        //resume.setText(array[3]);


    }


    public void GOTO123(View v) {

        System.out.println("LULULULULUL");


        TextView text = (TextView) findViewById(R.id.Titel);
        String titel = text.getText().toString();

        Spinner antal_sem =(Spinner) findViewById(R.id.spinner2);
        String antal = antal_sem.getSelectedItem().toString();

        System.out.println(antal);
        System.out.println(titel);


        Bundle b=new Bundle();
        b.putStringArray("KEY", new String[]{antal, titel});
        Intent Bog=new Intent(this, checkout.class);
        Bog.putExtras(b);
        startActivity(Bog);
    }

}


