package com.factorybyte.demosc1.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.factorybyte.demosc1.R;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();


        String name = intent.getStringExtra("name");


        TextView myname = findViewById(R.id.myname);

        myname.setText(name);


    }
}
