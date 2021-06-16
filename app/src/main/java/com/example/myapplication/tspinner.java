package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class tspinner extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tspinner);
        final Spinner spinner = (Spinner) findViewById(R.id.spinner2);
        final Button b = (Button) findViewById(R.id.nxt);
        //spinner click listner
        spinner.setOnItemSelectedListener(this); //spinner add elements
        List<String> category =new ArrayList<String>();
        category.add("others");
        category.add("college");
        category.add("school");
        //creating adapter for spinner
        ArrayAdapter<String> data = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item,category);//for drop down list in Spinner it is empty in defalut
        //here simple spinner item is the drop down list
        //dropdown list style
        data.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //setting spinner to dataadpter
        spinner.setAdapter(data);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Spinnerpass.class);
                i.putExtra("data",String.valueOf(spinner.getSelectedItem()));//pass selected value to next page
                startActivity(i);
            }
        });
    }




    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
    {
        //seleting aspinnner item
        String s= parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(),"Selected : "+s,Toast.LENGTH_LONG).show();//using adapter
        if(parent.getItemAtPosition(position).equals("school"))
        {
            Intent i = new Intent(getApplicationContext(),Spinnerpass.class);
            i.putExtra("data",String.valueOf(parent.getSelectedItem()));//pass selected value to next page
            startActivity(i);
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}