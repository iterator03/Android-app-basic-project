package com.androidproject.androidproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fourth extends AppCompatActivity {
    Button w1,w2,w3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        w1=(Button)findViewById(R.id.backthird);
        w3=(Button)findViewById(R.id.mmp);
        w2=(Button)findViewById(R.id.quiz);
        w1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Fourth.this,Third.class);
         startActivity(i);
            }
        });
        w2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kk=new Intent(Fourth.this,Quiz.class);
                startActivity(kk);

            }
        });
        w3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(Fourth.this,MagicalMusicPlayer.class);
                startActivity(k);
            }
        });

    }
}
