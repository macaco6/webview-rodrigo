package com.example.minhachance;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;



public class MainActivity extends AppCompatActivity {
    private WebView WebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView = (WebView) findViewById(R.id.paulo);
        WebView.setWebViewClient(new WebViewClient());
        WebView.loadUrl("https://www.facebook.com/samfooddelivery/");


    }

}