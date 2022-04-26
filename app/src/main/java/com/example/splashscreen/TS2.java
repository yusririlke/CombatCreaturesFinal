package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TS2 extends AppCompatActivity {
    Button btnR, btnstar, btnSputnik, btnMonkey, btnLion, btnRock, btnBaguette, btnTako, btnCat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ts2);

        btnR = findViewById(R.id.river);
        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TS2.this, battle.class);
                startActivity(intent);
            }
        });

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();

        btnstar = findViewById(R.id.star);
        btnstar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TS2.this, battle.class);
                startActivity(intent);
            }
        });

        // Get the Intent that started this activity and extract the string
        Intent intent2 = getIntent();

        btnSputnik = findViewById(R.id.sputnik);
        btnSputnik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TS2.this, battle.class);
                startActivity(intent);
            }
        });

        // Get the Intent that started this activity and extract the string
        Intent intent3 = getIntent();

        btnMonkey = findViewById(R.id.monkey);
        btnMonkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TS2.this, battle.class);
                startActivity(intent);
            }
        });

        // Get the Intent that started this activity and extract the string
        Intent intent4 = getIntent();

        btnLion = findViewById(R.id.lion);
        btnLion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TS2.this,battle.class);
                startActivity(intent);
            }
        });

        // Get the Intent that started this activity and extract the string
        Intent intent5 = getIntent();


        btnRock = findViewById(R.id.rock);
        btnRock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TS2.this,battle.class);
                startActivity(intent);
            }
        });

        // Get the Intent that started this activity and extract the string
        Intent intent6 = getIntent();


        btnBaguette = findViewById(R.id.baguette);
        btnBaguette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TS2.this, battle.class);
                startActivity(intent);
            }
        });

        // Get the Intent that started this activity and extract the string
        Intent intent7 = getIntent();

        btnTako = findViewById(R.id.tako);
        btnTako.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TS2.this, battle.class);
                startActivity(intent);
            }
        });

        // Get the Intent that started this activity and extract the string
        Intent intent8 = getIntent();

        btnCat = findViewById(R.id.cat);
        btnCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TS2.this, battle.class);
                startActivity(intent);
            }
        });

        // Get the Intent that started this activity and extract the string
        Intent intent9 = getIntent();
    }


}