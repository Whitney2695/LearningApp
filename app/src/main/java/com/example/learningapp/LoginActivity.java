package com.example.learningapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginBtn = findViewById(R.id.btnLogin);
        TextView forgotPassword = findViewById(R.id.tvForgotPassword);
        CheckBox rememberMe = findViewById(R.id.cbRememberMe);

        loginBtn.setOnClickListener(v -> {
            startActivity(new Intent(LoginActivity.this, HomeActivity.class));
            finish();
        });

        forgotPassword.setOnClickListener(v -> {
            // Handle forgot password functionality
        });
    }
}
