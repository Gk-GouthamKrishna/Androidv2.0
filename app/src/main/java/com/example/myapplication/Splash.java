package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Handler h=new Handler();
       h.postDelayed(new Runnable() {
           @Override
           public void run() {
               Intent i =new Intent(getApplicationContext(), Index.class);
               startActivity(i);
           }
       },2000);
    }
}