package com.rifat.refatportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Contact extends AppCompatActivity {
    TextView t6;
    TextView t7;
    TextView t8;
    TextView t9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        t6=(TextView) findViewById(R.id.textView6);
        t7=(TextView) findViewById(R.id.textView7);
        t9=(TextView)findViewById(R.id.textView9) ;
        t8=(TextView)findViewById(R.id.textView8);
        t6.animate().scaleXBy(.5f).setDuration(10000);

        t7.animate().scaleXBy(.8f).setDuration(10000);
        t8.animate().scaleXBy(.8f).setDuration(10000);
        t9.animate().scaleXBy(.8f).setDuration(10000);
    }
}
