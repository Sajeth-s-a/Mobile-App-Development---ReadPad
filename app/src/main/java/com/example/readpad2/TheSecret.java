package com.example.readpad2;

import androidx.appcompat.app.AppCompatActivity;
import com.github.barteksc.pdfviewer.PDFView;
import android.os.Bundle;

public class TheSecret extends AppCompatActivity {
    PDFView thesecret;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_secret);

        thesecret=(PDFView) findViewById(R.id.pdfView3);
        thesecret.fromAsset("The Secret.pdf").load();
    }
}
