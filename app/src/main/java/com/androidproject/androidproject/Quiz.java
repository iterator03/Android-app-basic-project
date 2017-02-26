package com.androidproject.androidproject;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.Locale;

public class Quiz extends AppCompatActivity {
    RadioButton r1,r2,r3,r4;
    Button l1,l2;
    static Integer score=0;
    TextToSpeech t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        r1= (RadioButton)findViewById(R.id.radioButton5);
         r2= (RadioButton)findViewById(R.id.radioButton6);
        r3 = (RadioButton)findViewById(R.id.radioButton7);
        r4 = (RadioButton)findViewById(R.id.radioButton8);
        l1 = (Button)findViewById(R.id.submit);
        l2 = (Button)findViewById(R.id.back);
        t1 = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                t1.setLanguage(Locale.ENGLISH);
                t1.setSpeechRate(0.05f);

            }
        });
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r1.isChecked()) {
                    ++score;
                    t1.speak("Right Answer",TextToSpeech.QUEUE_FLUSH,null);
                            Intent i = new Intent(Quiz.this, Main3Activity.class);
                    startActivity(i);
                    finish();
                } else {
                    --score;
                    String s1=r1.getText().toString();
                    Toast.makeText(Quiz.this, "Wrong Answer,Right answer is "+s1, Toast.LENGTH_LONG).show();
                    Intent i = new Intent(Quiz.this, Main3Activity.class);
                    startActivity(i);
                    finish();
                }
            }
        });
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(Quiz.this,Fourth.class);
                startActivity(in);
            }
        });

    }
}
