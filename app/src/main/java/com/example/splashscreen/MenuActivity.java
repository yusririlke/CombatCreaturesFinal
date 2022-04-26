package com.example.splashscreen;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {
    Button btn;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btn = findViewById(R.id.newGameBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this,TS1.class);
                startActivity(intent);
            }

        });

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();

        b = (Button) findViewById(R.id.creditsBtn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Credits.class));
            }
        });

    }


    @Override
    protected void onSaveInstanceState (Bundle bundle) {

        super.onSaveInstanceState(bundle);
    }

}
