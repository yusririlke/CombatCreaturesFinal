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
            textView.setText(new StringBuilder().append(getResources().getString(R.string.credits)).append("\n")
                    .append("Alex Lee\n").
                            append("Hamza Bachnak\n").
                            append("Yusri Zafri Mohd Yuri\n\n").
                                    append(getResources().getString(R.string.music)).
                            append("\nBalloon Game - Kevin MacLeod\n").
                            append("Digital Lemonade - Kevin MacLeod\n").
                            append("Mega Hyper Ultrastorm - Kevin MacLeod\n").
                            append("incompetech.com\n").
                            append("zapsplat.com\n").
                            toString());

            textView.startAnimation(animation);
            Toast.makeText(getApplicationContext(), R.string.thanksText, Toast.LENGTH_SHORT).show();



        }


        @Override
        protected void onSaveInstanceState (Bundle bundle) {

            super.onSaveInstanceState(bundle);
        }
    }