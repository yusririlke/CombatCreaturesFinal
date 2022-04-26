    package com.example.splashscreen;

    import androidx.appcompat.app.AppCompatActivity;

    import android.os.Bundle;
    import android.view.View;
    import android.view.animation.Animation;
    import android.view.animation.AnimationUtils;
    import android.widget.Button;
    import android.widget.TextView;
    import android.widget.Toast;

    public class Credits extends AppCompatActivity {
        TextView textView;
        Animation animation;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_credits);

            animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.credits);
            textView = findViewById(R.id.textView3);
            textView.setText(new StringBuilder().append(getResources().getString(R.string.credits)).append("\n").append("Alex Lee\n").append("Hamza Bachnak\n").append("Yusri Zafri Mohd Yuri").toString());

            textView.startAnimation(animation);
            Toast.makeText(getApplicationContext(), R.string.thanksText, Toast.LENGTH_SHORT).show();



        }


        @Override
        protected void onSaveInstanceState (Bundle bundle) {

            super.onSaveInstanceState(bundle);
        }
    }