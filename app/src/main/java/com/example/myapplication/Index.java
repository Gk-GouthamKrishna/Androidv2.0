package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Index extends AppCompatActivity {
   Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);
    }
    public void enterUrl(View view)//Intent to login page
    {

        Intent i = new Intent(getApplicationContext(), Url.class);
        startActivity(i);
    }
    public void enterLogin(View view)//Intent to login page
    {

        Intent i = new Intent(getApplicationContext(), Login.class);
        startActivity(i);
    }

    public void enterSpinner(View view)
    {
        Intent i = new Intent(getApplicationContext(), tspinner.class);
        startActivity(i);
    }
}