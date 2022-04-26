package com.example.splashscreen;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaParser;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;

public class MenuActivity extends AppCompatActivity {
    public static boolean shouldPlay = false;
    private SoundPool soundPool;
    MediaPlayer music;
    private int click;
    Button b;
    Button btn;
    Button setBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


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
        music= MediaPlayer.create(MenuActivity.this, R.raw.menutheme);
        music.setLooping(true); // Set looping
        music.setVolume(1.0f, 1.0f);
        music.start();



        btn = findViewById(R.id.newGameBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this,TS1.class);
                startActivity(intent);
                soundPool.play(click, 1, 1, 0, 0, 1);

            }

        });

        // Get the Intent that started this activity and extract the string

        setBtn = (Button) findViewById(R.id.settingsBtn);
        setBtn.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                soundPool.play(click, 1, 1, 0, 0, 1);
                //shouldPlay = false;
                                      }
        });
        Intent intent = getIntent();

        b = (Button) findViewById(R.id.creditsBtn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Credits.class));
                soundPool.play(click, 1, 1, 0, 0, 1);

            }
        });

    }




    @Override
    protected void onDestroy() {
        super.onDestroy();
        soundPool.release();
        soundPool = null;
        music.stop();
        music.release();

    }


    @Override
    public void onPause() {
        super.onPause();

        music.pause();
        }


    @Override
    public void onResume (){
        super.onResume();
        music.start();
    }





    @Override
    protected void onSaveInstanceState (Bundle bundle) {

        super.onSaveInstanceState(bundle);
    }

}
