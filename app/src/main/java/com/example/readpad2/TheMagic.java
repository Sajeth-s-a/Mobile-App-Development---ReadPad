package com.example.readpad2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class TheMagic  extends AppCompatActivity {

    PDFView themagic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_magic);

        themagic=(PDFView) findViewById(R.id.pdfView2);
        themagic.fromAsset("The Magic.pdf").load();
    }
}
