package com.example.bruteforcesimulator;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WebView webView = new WebView(this);
        setContentView(webView);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        // HIER DEINE STREAMLIT URL EINTRAGEN
        webView.loadUrl("https://DEINNAME-bruteforce-simulator.streamlit.app");
    }

    @Override
    public void onBackPressed() {
        WebView webView = (WebView) findViewById(android.R.id.content);
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
