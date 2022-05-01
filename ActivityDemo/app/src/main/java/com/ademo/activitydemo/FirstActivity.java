package com.ademo.activitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;


public class FirstActivity extends AppCompatActivity {

    Button b1;
    LinearLayout l1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        setTitle("First Activity");
        b1 = (Button) findViewById(R.id.bt1);
        l1 = findViewById(R.id.llayout);

        Intent i = getIntent();
        String name = i.getStringExtra("Name");
        String mobile = i.getStringExtra("Mobile");

        Toast.makeText(getApplicationContext(),"Name: "+name+"\nMobile: "+mobile,Toast.LENGTH_LONG).show();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(),"Button clicked",Toast.LENGTH_LONG).show();
                Snackbar snackbar = Snackbar.make(l1,"Button clicked",Snackbar.LENGTH_INDEFINITE);
                snackbar.setAction("Cancel",new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view) {
                        Snackbar snackbar1 = Snackbar.make(l1,"Welcome back",Snackbar.LENGTH_SHORT);
                        snackbar1.show();
                    }
                });
                snackbar.show();
            }
        });
    }




}