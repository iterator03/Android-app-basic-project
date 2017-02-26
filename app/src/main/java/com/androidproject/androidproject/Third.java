package com.androidproject.androidproject;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Locale;

public class Third extends AppCompatActivity {
    Button b5;
    Button b6,b7,b8,b9;
    //TextToSpeech t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        b5=(Button)findViewById(R.id.back2);
        Toast.makeText(Third.this,"Select to explore app",Toast.LENGTH_SHORT).show();
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(Third.this,Second.class);
                startActivity(j);
            }
        });
        b6=(Button)findViewById(R.id.media);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(Third.this,Media.class);
                startActivity(j);
            }
        });
        b7=(Button)findViewById(R.id.calculator);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(Third.this,Calculator.class);
                startActivity(j);
            }
        });
        b8=(Button)findViewById(R.id.camera);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(Third.this,Camera.class);
                startActivity(j);
            }
        });
        b9=(Button)findViewById(R.id.special);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(Third.this,Fourth.class);
                startActivity(j);
            }
        });
    }
}
