package com.rifat.refatportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class About extends AppCompatActivity {
    TextView t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        t3=(TextView)findViewById(R.id.textView3);
        t3.animate().scaleXBy(.8F).setDuration(5000);
    }
}
