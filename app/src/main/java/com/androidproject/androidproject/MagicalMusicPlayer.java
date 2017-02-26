package com.androidproject.androidproject;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MagicalMusicPlayer extends AppCompatActivity implements SensorEventListener{

    Sensor s;
    SensorManager sm;
    MediaPlayer mp;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magical_music_player);
        b1=(Button)findViewById(R.id.back);
        mp = MediaPlayer.create(this, R.raw.b);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MagicalMusicPlayer.this,Third.class);
                startActivity(i);
                finish();
                mp.stop();
            }
        });
        sm = (SensorManager) getSystemService(SENSOR_SERVICE);
        s = sm.getDefaultSensor(Sensor.TYPE_LIGHT);
        sm.registerListener(this, s, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.values[0] > 1) {
            mp.start();
        } else {
            mp.stop();
            mp=MediaPlayer.create(getBaseContext(),R.raw.b);
        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }


}
