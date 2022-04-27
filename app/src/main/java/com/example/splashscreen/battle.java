package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;



public class battle extends AppCompatActivity {

    MediaPlayer music;
    private int currPos;

    /* DocumentReference docRef = db.collection("creatureData").document(*//*enter creature name to get *//*);*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle);
        music= MediaPlayer.create(battle.this, R.raw.battletheme);
        music.setLooping(true); // Set looping
        music.setVolume(1.0f, 1.0f);
        music.start();

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        music.stop();

    }


    @Override
    public void onPause() {
        super.onPause();
        if (music.isPlaying()) {
            music.pause();
            currPos = music.getCurrentPosition();
        }
    }

    @Override
    public void onResume (){
        super.onResume();
        if(music.isPlaying()==false)
        {
            music.seekTo(currPos);
            music.start();
        }

    }





    @Override
    protected void onSaveInstanceState (Bundle bundle) {

        super.onSaveInstanceState(bundle);
    }




}