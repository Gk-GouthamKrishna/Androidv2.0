package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

Button b2;
    int n=3;
    EditText e1 ,e2;
    TextView left,atleft,lock;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        b2 = (Button)findViewById(R.id.login);//login button
        left=(TextView)findViewById(R.id.left);
        atleft=(TextView)findViewById(R.id.atleft);
        lock=(TextView)findViewById(R.id.loginlocked);
        e1= (EditText)findViewById(R.id.name);//Name field
        e2 = (EditText)findViewById(R.id.pass);//password field

    }

    public void onBackPressed()
            //on Back press app exit code
    {
        Intent a = new Intent(Intent.ACTION_MAIN);
        a.addCategory(Intent.CATEGORY_HOME);
        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(a);
    }

    public void login(View view) {
        if(e1.getText().toString().equals("admin")&&e2.getText().toString().equals(""))
        {
            String str=e1.getText().toString();
            Toast.makeText(getApplicationContext(),"LOGIN SUCESSFULL....",Toast.LENGTH_LONG).show();
            Intent i = new Intent (getApplicationContext(), Url.class);
            i.putExtra("msg",str);  //Passing value to next page
            startActivity(i);
        }
        else
            Toast.makeText(getApplicationContext(),"LOGIN FAIL!!!",Toast.LENGTH_LONG).show();
            n--;
            left.setText(Integer.toString(n));
            left.setVisibility(View.VISIBLE);//setting visibility
            atleft.setVisibility(View.VISIBLE);
            if(n==0)
            {
                b2.setEnabled(false);
                lock.setVisibility(view.VISIBLE);
                b2.setBackgroundColor(android.R.color.holo_orange_dark);

            }

    }
}