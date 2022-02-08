package com.example.co3q2explint2;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = getIntent();
        Uri uri = i.getData();
        URL pageurl = null;
        if(uri !=null){
            try{
                pageurl = new URL(uri.getScheme(),uri.getHost(),uri.getPath());
            }
            catch ( Exception e) {
                Toast.makeText(getApplicationContext(),"Error Occured",Toast.LENGTH_LONG).show();
            }
        }
        WebView web =(WebView) findViewById(R.id.webview);
        web.setWebViewClient(new WebViewClient());
        web.loadUrl(String.valueOf(pageurl));
    }
}