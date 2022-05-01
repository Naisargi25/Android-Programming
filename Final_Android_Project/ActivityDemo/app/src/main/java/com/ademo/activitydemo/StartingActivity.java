package com.ademo.activitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class StartingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting);
        setTitle("Main Activity");

        Toast.makeText(this, "onCreate method called", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LoadActivity", "onStart method called");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LoadActivity","onDestroy method called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LoadActivity","onPause method called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LoadActivity","onResume method called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LoadActivity","onRestart method called");
    }
}