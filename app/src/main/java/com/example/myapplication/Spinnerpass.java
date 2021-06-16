package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Spinnerpass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinnerpass);
        TextView tv =(TextView)findViewById(R.id.spass);
        Bundle  bundle =getIntent().getExtras();//using bundle get intent value
        String s= bundle.get("data").toString();
        tv.setText(s);
    }
}