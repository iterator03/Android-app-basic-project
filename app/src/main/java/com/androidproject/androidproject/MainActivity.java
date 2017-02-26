package com.androidproject.androidproject;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class
MainActivity extends AppCompatActivity {
    Button b1;
    Button b2;
    EditText e1;
    EditText e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.login);
        b2=(Button)findViewById(R.id.signup);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        Toast.makeText(MainActivity.this,"Welcome To Our app",Toast.LENGTH_LONG).show();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                if(s1.equals("")||s2.equals(""))
                {
                    Toast.makeText(MainActivity.this,"Please fill the field",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    SQLiteDatabase database=openOrCreateDatabase("myProject",MODE_PRIVATE,null);
                    database.execSQL("create table if not exists record(username varchar,password varchar,email varchar,city varchar,phone number)");
                    String s3="select *from record where username='"+s1+"' and password='"+s2+"'";
                    Cursor cursor=database.rawQuery(s3,null);
                    if(cursor.getCount()==0)
                    {
                        Toast.makeText(MainActivity.this,"User does not exists please sign up ",Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        Intent i=new Intent(MainActivity.this,Third.class);
                        startActivity(i);
                    }
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent k=new Intent(MainActivity.this,Second.class);
                startActivity(k);
            }
        });
    }
}
