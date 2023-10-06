package com.base.trulyiasassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class PDFView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfview);

        String url = getIntent().getStringExtra("pdf_url");

        WebView idPDFview = findViewById(R.id.idPDFview);
        idPDFview.setWebViewClient(new WebViewClient());
        idPDFview.getSettings().setSupportZoom(true);
        idPDFview.loadUrl("https://docs.google.com/gview?embedded=true&url="+url);
    }
}