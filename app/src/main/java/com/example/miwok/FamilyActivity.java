package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        final ArrayList<Word> strFamily= new ArrayList<Word>();


        strFamily.add(new Word("one", "lutti", R.drawable.number_one, R.raw.number_one));
        strFamily.add(new Word("two", "otiiko", R.drawable.number_two, R.raw.number_two));
        strFamily.add(new Word("three", "tolookosu", R.drawable.number_three, R.raw.number_three));
        strFamily.add(new Word("four", "oyyisa", R.drawable.number_four, R.raw.number_four));
        strFamily.add(new Word("five", "massokka", R.drawable.number_five, R.raw.number_five));
        strFamily.add(new Word("six", "temmokka", R.drawable.number_six, R.raw.number_six));
        strFamily.add(new Word("seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
        strFamily.add(new Word("eight", "kawinta", R.drawable.number_eight, R.raw.number_eight));
        strFamily.add(new Word("nine", "wo’e", R.drawable.number_nine, R.raw.number_nine));
        strFamily.add(new Word("ten", "na’aacha", R.drawable.number_ten, R.raw.number_ten));


        WordAdapter adapter = new WordAdapter(this, strFamily, R.color.category_family);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = strFamily.get(position);
                mediaPlayer = MediaPlayer.create(FamilyActivity.this, word.getAudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}