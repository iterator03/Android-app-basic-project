package com.androidproject.androidproject;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Camera extends AppCompatActivity {
    Button k1, k2;
    ImageView w1;

    @Override
    protected void onActivityResult ( int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap b = (Bitmap) data.getExtras().get("data");
        w1.setImageBitmap(b);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        k1 = (Button) findViewById(R.id.capture);
        w1 = (ImageView) findViewById(R.id.imageView);
        k2 = (Button) findViewById(R.id.back);
        k1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i,0);
            }
        });
        k2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent g =new Intent(Camera.this,Third.class);
                startActivity(g);
            }

        });

    }

    }



