package com.example.learningapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find Views
        LinearLayout layout = findViewById(R.id.mainLayout);
        TextView welcomeText = findViewById(R.id.welcomeText);
        Button btnStartLearning = findViewById(R.id.btnStartLearning);

        // Create fade-in animation in Java
        AlphaAnimation fadeIn = new AlphaAnimation(0.0f, 1.0f);
        fadeIn.setDuration(1000); // 1 second
        fadeIn.setFillAfter(true);

        // Apply animation
        layout.startAnimation(fadeIn);
        welcomeText.startAnimation(fadeIn);
        btnStartLearning.startAnimation(fadeIn);

        // Set button click listener
        btnStartLearning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open Learning Dashboard when button is clicked
                Intent intent = new Intent(MainActivity.this, SplashActivity.class);
                startActivity(intent);
            }
        });
    }
}
