package com.application.btechpapers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class Chem_7_PSE extends AppCompatActivity {

    public WebView webView;
    public ProgressBar progressBar;


    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webviewcontainer);
        progressBar = (ProgressBar)findViewById(R.id.prg);
        webView = (WebView) findViewById(R.id.webviewcontain);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setAllowContentAccess(true);


        webView.loadUrl("https://drive.google.com/open?id=1mJYZ2cimu4_2Cag6BlqqCIyBS_qfb5Yy&authuser=btechpapers777%40gmail.com&usp=drive_fs");
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                progressBar.setVisibility(View.VISIBLE);
                setTitle("Chemical 5th Sem Syllabus");
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                progressBar.setVisibility(View.GONE);
                setTitle(view.getTitle());
            }
        });


    }
}