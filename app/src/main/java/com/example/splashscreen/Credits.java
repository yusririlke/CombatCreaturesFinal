    package com.example.splashscreen;

    import androidx.appcompat.app.AppCompatActivity;

    import android.os.Bundle;
    import android.view.View;
    import android.view.animation.Animation;
    import android.view.animation.AnimationUtils;
    import android.widget.Button;
    import android.widget.TextView;

    public class Credits extends AppCompatActivity {
        TextView textView;
        Animation animation;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_credits);

            animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.credits);
            textView = findViewById(R.id.textView3);
            textView.setText("Credits \n" + "Alex Lee\n"+ "Hamza Bachnak\n" + "Yusri Zafri Mohd Yuri");

            textView.startAnimation(animation);


        }


        @Override
        protected void onSaveInstanceState (Bundle bundle) {

            super.onSaveInstanceState(bundle);
        }
    }