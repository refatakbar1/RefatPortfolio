package com.rifat.refatportfolio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void contact(View v){
        Intent i=new Intent(this,Contact.class);
        startActivity(i);
    }

    public void about(View v){
        Intent i=new Intent(this,About.class);
        startActivity(i);
    }
    public void portfolio(View v){
        Intent i=new Intent(this,Portfolio.class);
        startActivity(i);
    }
}
