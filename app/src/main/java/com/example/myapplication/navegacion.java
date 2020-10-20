package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class navegacion extends AppCompatActivity {

    WebView wv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navegacion);
        wv1= (WebView)findViewById(R.id.navegador);
        String URL = getIntent().getStringExtra("sitioweb");
        wv1.setWebViewClient(new WebViewClient());
        wv1.loadUrl("https://"+ URL);
    }
}