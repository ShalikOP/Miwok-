package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView) findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNum = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(intentNum);
            }
        });


        TextView family = (TextView) findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentFam = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(intentFam);
            }
        });

        TextView phrases = (TextView) findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPhr = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(intentPhr);
            }
        });

        TextView colours = (TextView) findViewById(R.id.colors);
        colours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCol = new Intent(MainActivity.this, ColoursActivity.class);
                startActivity(intentCol);
            }
        });


    }

//    public void openNumberList(View view){
//        Intent intent = new Intent(this, NumbersActivity.class);
//        startActivity(intent);
//    }
//    public void openFamilyList(View view){
//        Intent intent = new Intent(this, FamilyActivity.class);
//        startActivity(intent);
//    }
//
//    public void openColorList(View view){
//        Intent intent = new Intent(this, ColoursActivity.class);
//        startActivity(intent);
//    }
//
//    public void openPhrasesList(View view){
//        Intent intent = new Intent(this, PhrasesActivity.class);
//        startActivity(intent);
//    }








}

