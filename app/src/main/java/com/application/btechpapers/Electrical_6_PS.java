package com.application.btechpapers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Electrical_6_PS extends AppCompatActivity {

    private WebView webView;

    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webviewcontainer);

        webView = (WebView) findViewById(R.id.webviewcontain);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setAllowContentAccess(true);
        webView.loadUrl("https://drive.google.com/drive/folders/1ELScbEhbRhgL08q00q38Ry2YfdHiqCnU?usp=sharing");
    }
}