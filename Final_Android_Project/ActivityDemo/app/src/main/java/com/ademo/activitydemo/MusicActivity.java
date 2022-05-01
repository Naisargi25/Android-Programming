package com.ademo.activitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MusicActivity extends AppCompatActivity {

    Button btn,btn2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        setTitle("Music");

        btn = (Button) findViewById(R.id.play);
        btn2 = (Button) findViewById(R.id.stop);
//        img = (ImageView) findViewById(R.id.image);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(), "Hi", Toast.LENGTH_LONG).show();
                startService(new Intent(getApplicationContext(), NewService.class));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
               @Override
                public void onClick(View view) {

                stopService(new Intent(getApplicationContext(),NewService.class));
           }
        });
   }
}