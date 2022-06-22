package com.pratiksha.miniproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toast.makeText(this, "Hello Welcome", Toast.LENGTH_SHORT).show();

    }
    public void Add(View v){
        EditText et1=(EditText) findViewById(R.id.editTextNumber);
        EditText et2=(EditText) findViewById(R.id.editTextNumber2);
        EditText et3=(EditText) findViewById(R.id.editTextNumber3);

        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        int result=n1+n2;

        et3.setText("Total value="+result);


    }
    public void Subtract(View v){
        EditText et1=(EditText) findViewById(R.id.editTextNumber);
        EditText et2=(EditText) findViewById(R.id.editTextNumber2);
        EditText et3=(EditText) findViewById(R.id.editTextNumber3);

        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        int result=n1-n2;

        et3.setText("Subtract value="+result);


    }
    public void Multiply(View v){
        EditText et1=(EditText) findViewById(R.id.editTextNumber);
        EditText et2=(EditText) findViewById(R.id.editTextNumber2);
        EditText et3=(EditText) findViewById(R.id.editTextNumber3);

        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        int result=n1*n2;

        et3.setText("Subtract value="+result);


    }
    public void Divide(View v){
        EditText et1=(EditText) findViewById(R.id.editTextNumber);
        EditText et2=(EditText) findViewById(R.id.editTextNumber2);
        EditText et3=(EditText) findViewById(R.id.editTextNumber3);

        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        int result=n1/n2;

        et3.setText("Divide value="+result);


    }
}