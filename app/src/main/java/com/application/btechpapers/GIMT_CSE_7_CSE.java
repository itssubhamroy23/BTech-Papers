package com.application.btechpapers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class GIMT_CSE_7_CSE extends AppCompatActivity {

    private WebView webView;

    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webviewcontainer);

        webView = (WebView) findViewById(R.id.webviewcontain);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setAllowContentAccess(true);
        webView.loadUrl("https://drive.google.com/open?id=1IlYaiT5sZoJGGUQ8Sn5ihiNhU2PPU4dB&authuser=btechpapers777%40gmail.com&usp=drive_fs");
    }
}