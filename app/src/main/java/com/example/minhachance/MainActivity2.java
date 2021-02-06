package com.example.minhachance;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity2 extends AppCompatActivity {
    private WebView WebView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView = (WebView) findViewById(R.id.webview3);
        WebView.setWebViewClient(new WebViewClient());
        WebView.loadUrl("https://www.chrome.com/");

    };

    }
