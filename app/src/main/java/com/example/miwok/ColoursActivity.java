package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColoursActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colours);

        final ArrayList<Word> strColours= new ArrayList<Word>();


        strColours.add(new Word("red", "weṭeṭṭi", R.drawable.color_red, R.raw.color_red));
        strColours.add(new Word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow,
                R.raw.color_mustard_yellow));
        strColours.add(new Word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow,
                R.raw.color_dusty_yellow));
        strColours.add(new Word("green", "chokokki", R.drawable.color_green, R.raw.color_green));
        strColours.add(new Word("brown", "ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
        strColours.add(new Word("gray", "ṭopoppi", R.drawable.color_gray, R.raw.color_gray));
        strColours.add(new Word("black", "kululli", R.drawable.color_black, R.raw.color_black));
        strColours.add(new Word("white", "kelelli", R.drawable.color_white, R.raw.color_white));


        WordAdapter adapter = new WordAdapter(this, strColours, R.color.category_colors);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = strColours.get(position);
                mediaPlayer = MediaPlayer.create(ColoursActivity.this, word.getAudioResourceId());
                mediaPlayer.start();
            }
        });
    }

}