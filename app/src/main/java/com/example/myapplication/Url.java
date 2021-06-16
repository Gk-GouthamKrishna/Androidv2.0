package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Url extends AppCompatActivity {
    EditText e;
    Button b,g,select;
    RadioButton rd;
    RadioGroup gp;
    CheckBox eng,mal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.url);
        TextView t1=(TextView)findViewById(R.id.view1);
        Intent i1=getIntent();
        String name=i1.getStringExtra("msg");
        t1.setText("Welcome "+name);
        e=(EditText)findViewById(R.id.tv);
        b=(Button)findViewById(R.id.go);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url=e.getText().toString();
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));//External intent
                startActivity(i);
            }
        });

    }

    public void toast(View view) {
        Toast.makeText(getApplicationContext(),"Heloo...",Toast.LENGTH_LONG).show();
    }

    public void showgeender(View view)
    {
        gp=(RadioGroup)findViewById(R.id.rg);
        int selected =gp.getCheckedRadioButtonId();//gets no associated with selected rbutton
        rd=(RadioButton)findViewById(selected);//use this no to get orginal id
        Toast.makeText(getApplicationContext(),rd.getText(),Toast.LENGTH_LONG).show();


    }

    public void lang(View view) {
        CheckBox mal = (CheckBox)findViewById(R.id.mal);
        CheckBox eng =(CheckBox)findViewById(R.id.eng);
        if(mal.isChecked())
        {
            Toast.makeText(getApplicationContext(),"Malayalam",Toast.LENGTH_LONG).show();
        }
        if(eng.isChecked())
        {
            Toast.makeText(getApplicationContext(),"English",Toast.LENGTH_LONG).show();
        }
        
    }
}