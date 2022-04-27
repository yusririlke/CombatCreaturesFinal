package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Toast;

public class victory extends AppCompatActivity {
    MediaPlayer music;
    private int currPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_victory);
        music= MediaPlayer.create(victory.this, R.raw.victorytheme);
        music.setLooping(true); // Set looping
        music.setVolume(1.0f, 1.0f);
        music.start();
        Toast.makeText(getApplicationContext(), R.string.victoryText, Toast.LENGTH_SHORT).show();
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