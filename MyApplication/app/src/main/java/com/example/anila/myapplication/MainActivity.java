package com.example.anila.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Declare EditText globally to access it in the setclick function
    EditText e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        e=findViewById(R.id.editText);
//one more way of iplementing click
//        Button b;
//        b=findViewById(R.id.button);
//        b.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });



    }

    public void setclick(View view){
        ImageView i;
        i=findViewById(R.id.myImage);
        i.setVisibility(view.VISIBLE);
        String name=e.getText().toString().trim();
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();

    }




}
