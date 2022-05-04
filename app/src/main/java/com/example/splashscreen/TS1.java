package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TS1 extends AppCompatActivity {
    Button btnR, btnstar, btnSputnik, btnMonkey, btnLion, btnRock, btnBaguette, btnTako, btnCat;
    private SoundPool soundPool;
    private int click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ts1);

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

        btnR = findViewById(R.id.river);
        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TS1.this, TS2.class);
                intent.putExtra("creature1", 1);
                startActivity(intent);
                soundPool.play(click, 1, 1, 0, 0, 1);
            }
        });

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        //
        btnstar = findViewById(R.id.star);
        btnstar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TS1.this, TS2.class);
                intent.putExtra("creature1", 6);
                startActivity(intent);
                soundPool.play(click, 1, 1, 0, 0, 1);
            }
        });

        // Get the Intent that started this activity and extract the string
        Intent intent2 = getIntent();

        btnSputnik = findViewById(R.id.sputnik);
        btnSputnik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TS1.this, TS2.class);
                intent.putExtra("creature1", 2);
                startActivity(intent);
                soundPool.play(click, 1, 1, 0, 0, 1);
            }
        });

        // Get the Intent that started this activity and extract the string
        Intent intent3 = getIntent();

        btnMonkey = findViewById(R.id.monkey);
        btnMonkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TS1.this, TS2.class);
                intent.putExtra("creature1", 5);
                startActivity(intent);
                soundPool.play(click, 1, 1, 0, 0, 1);
            }
        });

        // Get the Intent that started this activity and extract the string
        Intent intent4 = getIntent();

        btnLion = findViewById(R.id.lion);
        btnLion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TS1.this,TS2.class);
                intent.putExtra("creature1", 3);
                startActivity(intent);
            }
        });

        // Get the Intent that started this activity and extract the string
        Intent intent5 = getIntent();


        btnRock = findViewById(R.id.rock);
        btnRock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TS1.this,TS2.class);
                intent.putExtra("creature1", 9);
                startActivity(intent);
                soundPool.play(click, 1, 1, 0, 0, 1);
            }
        });

        // Get the Intent that started this activity and extract the string
        Intent intent6 = getIntent();


        btnBaguette = findViewById(R.id.baguette);
        btnBaguette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TS1.this, TS2.class);
                intent.putExtra("creature1", 4);
                startActivity(intent);
                soundPool.play(click, 1, 1, 0, 0, 1);
            }
        });

        // Get the Intent that started this activity and extract the string
        Intent intent7 = getIntent();

        btnTako = findViewById(R.id.tako);
        btnTako.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TS1.this, TS2.class);
                intent.putExtra("creature1", 8);
                startActivity(intent);
                soundPool.play(click, 1, 1, 0, 0, 1);
            }
        });

        // Get the Intent that started this activity and extract the string
        Intent intent8 = getIntent();

        btnCat = findViewById(R.id.cat);
        btnCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TS1.this, TS2.class);
                intent.putExtra("creature1", 7);
                startActivity(intent);
                soundPool.play(click, 1, 1, 0, 0, 1);
            }
        });

        // Get the Intent that started this activity and extract the string
        Intent intent9 = getIntent();






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