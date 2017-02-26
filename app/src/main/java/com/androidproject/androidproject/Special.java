package com.androidproject.androidproject;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class
Special extends AppCompatActivity {
Button b1,b2,b3,b4;
    TextView t1;
    TextToSpeech t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_special);

       b1=(Button)findViewById(R.id.fb);
        b2=(Button)findViewById(R.id.tw);
        b3=(Button)findViewById(R.id.net);
        b4=(Button)findViewById(R.id.home);
        t1=(TextView)findViewById(R.id.textView3);
        t1.setText("Your score is"+Quiz.score);
        t2 = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                t2.setLanguage(Locale.ENGLISH);
                t2.setSpeechRate(0.05f);
                t2.speak("THANKS FOR PLAYING",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Special.this, facebook.class);
                        startActivity(i);
                    }
                });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(Special.this,twitter.class);
                startActivity(j);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(Special.this,netcamp.class);
                startActivity(k);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l=new Intent(Special.this,Third.class);
                startActivity(l);

            }
        });

    }
}
