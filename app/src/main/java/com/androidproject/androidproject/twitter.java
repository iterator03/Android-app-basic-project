package com.androidproject.androidproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class
twitter extends AppCompatActivity {
Button j1;
    WebView w1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter);
        j1=(Button)findViewById(R.id.back);
        w1=(WebView)findViewById(R.id.webView3);
        j1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(twitter.this,Special.class);
                startActivity(i);
            }
        });
        w1.loadUrl("http://www.twitter.com/");
    }
}
