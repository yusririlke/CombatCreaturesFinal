package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;

import android.content.Intent;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;


@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity {

    private SoundPool soundPool;
    private int click;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();

            soundPool = new SoundPool.Builder()
                    .setMaxStreams(1)
                    .setAudioAttributes(audioAttributes)
                    .build();
        } else {
            soundPool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        }

        click = soundPool.load(this, R.raw.click, 1);


    }

    public void startClick(View view) {
        soundPool.play(click, 1, 1, 0, 0, 1);
        Intent intent = new Intent(this,MenuActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        soundPool.release();
        soundPool = null;
    }




    @Override
    protected void onSaveInstanceState (Bundle bundle) {

        super.onSaveInstanceState(bundle);
    }


}