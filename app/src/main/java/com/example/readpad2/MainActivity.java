package com.example.readpad2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnFaultInOurStars;
    Button btnMagic;
    Button btnSecret;

    public static int SPLASH_TIME_OUT=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable()
        {
            public void run()
            {
                Intent homeIntent=new Intent(MainActivity.this,HomeActivity.class);
                startActivity(homeIntent);
                finish();
            }

        },SPLASH_TIME_OUT);   }}
