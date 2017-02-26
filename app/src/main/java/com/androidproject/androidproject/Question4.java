package com.androidproject.androidproject;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class Question4 extends AppCompatActivity {
    RadioButton r1,r2,r3,r4;
    Button b1,b2;
   // static Integer score=0;
    TextToSpeech t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
        r1=(RadioButton)findViewById(R.id.radioButton5);
        r2=(RadioButton)findViewById(R.id.radioButton6);
        r3=(RadioButton)findViewById(R.id.radioButton7);
        r4=(RadioButton)findViewById(R.id.radioButton8);
        b1=(Button)findViewById(R.id.submit);
        b2=(Button)findViewById(R.id.back);
        t1 = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                t1.setLanguage(Locale.ENGLISH);
                t1.setSpeechRate(0.05f);

            }});
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r3.isChecked()) {
                    ++(Quiz.score);
                    t1.speak("Right Answer",TextToSpeech.QUEUE_FLUSH,null);

                } else {
                    --(Quiz.score);
                    String s1=r3.getText().toString();
                    Toast.makeText(Question4.this,"Wrong Answer,Right answer is"+s1,Toast.LENGTH_LONG).show();

                }
                Intent i = new Intent(Question4.this, Question5.class);
                startActivity(i);
                finish();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Question4.this, Question3.class);
                startActivity(i);

            }
        });



    }
}
