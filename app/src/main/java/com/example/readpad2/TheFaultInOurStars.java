package com.example.readpad2;

import androidx.appcompat.app.AppCompatActivity;
import com.github.barteksc.pdfviewer.PDFView;

import android.os.Bundle;

public class TheFaultInOurStars extends AppCompatActivity {
    PDFView thefault;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_fault_in_our_stars);

        thefault=(PDFView) findViewById(R.id.pdfView1);
        thefault.fromAsset("The Fault in Our Stars.pdf").load();

    }
}
