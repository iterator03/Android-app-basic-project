package com.androidproject.androidproject;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Second extends AppCompatActivity {

    Button b3;
    Button b4;
 EditText e3;
    EditText e4;
    EditText e5,e6,e7,e8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        b3 = (Button) findViewById(R.id.back);
        b4 = (Button) findViewById(R.id.register);
        e3 = (EditText) findViewById(R.id.editText3);
        e4 = (EditText) findViewById(R.id.editText4);
        e5 = (EditText) findViewById(R.id.editText5);
        e6 = (EditText) findViewById(R.id.editText6);
        e7 = (EditText) findViewById(R.id.editText7);
        e8 = (EditText) findViewById(R.id.editText8);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Second.this,"Back to Login page",Toast.LENGTH_SHORT).show();
                Intent k=new Intent(Second.this,MainActivity.class);
                startActivity(k);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s4=e3.getText().toString();
                String s5=e4.getText().toString();
                String s6=e5.getText().toString();
                String s7=e6.getText().toString();
                String s8=e7.getText().toString();
                String s9=e8.getText().toString();
                if(s4.equals("")||s5.equals("")||s6.equals("")||s7.equals("")||s8.equals("")||s9.equals(""))
                {
                    Toast.makeText(Second.this,"Please fill the fields",Toast.LENGTH_LONG).show();
                }
                else {
                    if (s5.equals(s6)) {
                        SQLiteDatabase database = openOrCreateDatabase("myProject", MODE_PRIVATE, null);
                         database.execSQL("create table if not exists record(username varchar,password varchar,email varchar,city varchar,phone number)");
                         database.execSQL("insert into record values('"+s4+"','"+s5+"','"+s7+"','"+s8+"','"+s9+"')");
                        Toast.makeText(Second.this,"Record Updated",Toast.LENGTH_SHORT).show();
                        Intent j=new Intent(Second.this,Third.class);
                        startActivity(j);
                    }
                    else
                    {
                        Toast.makeText(Second.this,"Password don't match",Toast.LENGTH_SHORT).show();

                    }
                }
            }
        });
    }
}
