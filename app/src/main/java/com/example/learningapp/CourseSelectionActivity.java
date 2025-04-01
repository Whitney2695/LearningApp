package com.example.learningapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class CourseSelectionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_selection);

        Button continueBtn = findViewById(R.id.btnContinue);
        continueBtn.setOnClickListener(v -> {
            startActivity(new Intent(CourseSelectionActivity.this, HomeActivity.class));
        });
    }
}
