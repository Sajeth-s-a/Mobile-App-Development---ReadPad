package com.example.readpad2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Philosophy extends AppCompatActivity {

    Button btnMagic;
    Button btnSecret;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_philosophy);

        btnMagic=findViewById(R.id.btnMagic);
        btnSecret=findViewById(R.id.btnSecret);

        btnMagic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Philosophy.this,TheMagic.class);
                startActivity(intent);
            }
        });

        btnSecret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Philosophy.this,TheSecret.class);
                startActivity(intent);
            }
        });
    }
}
