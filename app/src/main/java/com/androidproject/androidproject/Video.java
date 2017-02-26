package com.androidproject.androidproject;

import android.content.Intent;
import android.media.session.MediaController;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class Video extends AppCompatActivity {
VideoView myPlayer;
    Button returnButton;
    //MediaController my;
    Uri videoLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        returnButton =(Button)findViewById(R.id.back);
        myPlayer =(VideoView)findViewById(R.id.videoView);
        videoLocation =Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.c);
        myPlayer.setVideoURI(videoLocation);
        myPlayer.requestFocus();
        myPlayer.start();

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                setResult(RESULT_OK,i);
                finish();
            }
        });
    }

}
