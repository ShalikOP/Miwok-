package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;
    private AudioManager mAudioManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);




//        String[] words = new String[10];
//        words[0] = "One";
//        words[1] = "Two";
//        words[2] = "Three";
//        words[3] = "Four";
//        words[4] = "Five";
//        words[5] = "One";
//        words[6] = "One";
//        words[7] = "One";
//        words[8] = "One";
//        words[9] = "One";



//
//        Log.v("NumbersActivity", "String at index 0 =" + words[0]);
//        Log.v("NumbersActivity", "String at index 2 =" + words[2]);
//        Log.v("NumbersActivity", "String at index 4 =" + words[4]);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("one", "lutti", R.drawable.number_one, R.raw.number_one));
        words.add(new Word("Two", "Tutti", R.drawable.number_two, R.raw.number_two));
        words.add(new Word("Three", "Putti", R.drawable.number_three, R.raw.number_three));
        words.add(new Word("Four", "Rutti", R.drawable.number_four, R.raw.number_four));
        words.add(new Word("Five", "Dutti", R.drawable.number_five, R.raw.number_five));
        words.add(new Word("Six", "Sutti", R.drawable.number_six, R.raw.number_six));
        words.add(new Word("Seven", "Kutti", R.drawable.number_seven, R.raw.number_seven));
        words.add(new Word("Eight", "Hutti", R.drawable.number_eight, R.raw.number_eight));
        words.add(new Word("Nine", "Nutti", R.drawable.number_nine, R.raw.number_nine));
        words.add(new Word("Ten", "Ocuti", R.drawable.number_ten, R.raw.number_ten));
        //        Log.v("NumbersActivity", "String at index 0 =" + words.get(0));
//        Log.v("NumbersActivity", "String at index 2 =" + words.get(2));
//        Log.v("NumbersActivity", "String at index 4 =" + words.get(4));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = words.get(position);
                releaseMediaPlayer();
                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getAudioResourceId());
                mMediaPlayer.start();

                mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {

                    }
                });
            }
        });







//        int i = 0;
//        for (i = 0; i < words.size(); i++){
//        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
//        TextView wordView = new TextView(this);
//        wordView.setText(words.get(i));
//        rootView.addView(wordView);
    }
    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }


    /**
     * Clean up the media player by releasing its resources.
     */
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;
        }
    }

//        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);

//        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);
//
//        ListView listView = (ListView) findViewById(R.id.list);
//
//        listView.setAdapter(itemsAdapter);


}







