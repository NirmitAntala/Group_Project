package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash_Sreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_sreen);

        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                Intent i = new Intent(Splash_Sreen.this, MainActivity.class); startActivity(i);
                finish(); } }, 3000);
    }
    }
