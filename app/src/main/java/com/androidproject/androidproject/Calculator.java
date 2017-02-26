package com.androidproject.androidproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.Math;

public class Calculator extends AppCompatActivity {
    Button b13,b14,b16,b15,b17,b18,b19,b20,b21,b22,b23,b24,b25;
    EditText e10,e9;
    TextView t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        b13=(Button)findViewById(R.id.backcalculator);
        e9=(EditText)findViewById(R.id.first);
        e10=(EditText)findViewById(R.id.second);
        t2=(TextView)findViewById(R.id.textView2);

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(Calculator.this,Media.class);
                startActivity(k);
            }
        });
        b14=(Button)findViewById(R.id.add);
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String r1=e9.getText().toString();
                String r2=e10.getText().toString();
                if(r1.equals(" ")||r2.equals(" "))
                {
                    Toast.makeText(Calculator.this,"Please enter both fields",Toast.LENGTH_LONG).show();
                }

                Float i=Float.parseFloat(r1);
                Float j=Float.parseFloat(r2);
            Float k=i+j;
                String s3=Float.toString(k);
                t2.setText(s3);

            }
        });
        b15=(Button)findViewById(R.id.sub);
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String r1=e9.getText().toString();
                String r2=e10.getText().toString();
                if(r1.equals(" ")||r2.equals(" "))
                {
                    Toast.makeText(Calculator.this,"Please enter both fields",Toast.LENGTH_LONG).show();
                }
                Float i=Float.parseFloat(r1);
                Float j=Float.parseFloat(r2);
                Float k=i-j;
                String s3=Float.toString(k);
                t2.setText(s3);

            }
        });
        b16=(Button)findViewById(R.id.mul);
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String r1=e9.getText().toString();
                String r2=e10.getText().toString();
                if(r1.equals(" ")||r2.equals(" "))
                {
                    Toast.makeText(Calculator.this,"Please enter both fields",Toast.LENGTH_LONG).show();
                }
                Float i=Float.parseFloat(r1);
                Float j=Float.parseFloat(r2);
                Float k=i*j;
                String s3=Float.toString(k);
                t2.setText(s3);
            }
        });
        b17=(Button)findViewById(R.id.div);
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String r1=e9.getText().toString();
                String r2=e10.getText().toString();
                if(r1.equals(" ")||r2.equals(" "))
                {
                    Toast.makeText(Calculator.this,"Please enter both fields",Toast.LENGTH_LONG).show();
                }
                Float i=Float.parseFloat(r1);
                Float j=Float.parseFloat(r2);
                Float k=i/j;
                String s3=Float.toString(k);
                t2.setText(s3);
            }
        });
        b18=(Button)findViewById(R.id.capture);
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String r1=e9.getText().toString();
                String r2=e10.getText().toString();
                e10.setText("");
                e9.setText("");
                t2.setText("");
            }
        });

        b19=(Button)findViewById(R.id.result);
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String r1=e9.getText().toString();
                e10.setEnabled(false);
                //String r2=e10.getText().toString();
                Double i=Double.parseDouble(r1);
               // Double j=Double.parseDouble(r2);
                Double k=Math.sqrt(i);
                String s3=Double.toString(k);
                t2.setText(s3);
            }
        });
        b20=(Button)findViewById(R.id.log);
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String r1=e9.getText().toString();
                //String r2=e10.getText().toString();
                Double i=Double.parseDouble(r1);
                e10.setEnabled(false);
                //Double j=Double.parseDouble(r2);
                Double k=Math.log(i);
                String s3=Double.toString(k);
                t2.setText(s3);
            }
        });
        b21=(Button)findViewById(R.id.power);
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String r1=e9.getText().toString();
                String r2=e10.getText().toString();
                if(r1.equals(" ")||r2.equals(" "))
                {
                    Toast.makeText(Calculator.this,"Please enter both fields",Toast.LENGTH_LONG).show();
                }
                Double i=Double.parseDouble(r1);
                Double j=Double.parseDouble(r2);
                Double k=Math.pow(i,j);
                String s3=Double.toString(k);
                t2.setText(s3);
            }
        });
        b22=(Button)findViewById(R.id.sin);
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String r1=e9.getText().toString();
                //String r2=e10.getText().toString();
                Double i=Double.parseDouble(r1);
                e10.setEnabled(false);
               // Double j=Double.parseDouble(r2);
                Double k=Math.sin(i);
                String s3=Double.toString(k);
                t2.setText(s3);
            }
        });
        b23=(Button)findViewById(R.id.cos);
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String r1=e9.getText().toString();
                //String r2=e10.getText().toString();
                Double i=Double.parseDouble(r1);
                e10.setEnabled(false);
               // Double j=Double.parseDouble(r2);
                Double k=Math.cos(i);
                String s3=Double.toString(k);
                t2.setText(s3);
            }
        });
        b24=(Button)findViewById(R.id.tan);
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String r1=e9.getText().toString();
               // String r2=e10.getText().toString();
                e10.setEnabled(false);
                Double i=Double.parseDouble(r1);
                //Double j=Double.parseDouble(r2);
                Double k=Math.tan(i);
                String s3=Double.toString(k);
                t2.setText(s3);
            }
        });
        b25=(Button)findViewById(R.id.exp);
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String r1=e9.getText().toString();
                e10.setEnabled(false);
                Double i=Double.parseDouble(r1);
               // Double j=Double.parseDouble(r2);
                Double k=Math.exp(i);
                String s3=Double.toString(k);
                t2.setText(s3);
            }
        });


    }
}
