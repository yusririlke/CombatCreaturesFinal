package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


public class battle extends AppCompatActivity {


   /* DocumentReference docRef = db.collection("creatureData").document(*//*enter creature name to get *//*);*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle);

    }


    @Override
    protected void onSaveInstanceState (Bundle bundle) {

        super.onSaveInstanceState(bundle);
    }

 
}