package com.ademo.activitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class AllTasksActivity extends AppCompatActivity {

    Button alc,logact,listact,battery,recycle,sensor,intentact,multilan,spinact,mapact,accel,proximity,navigation,tab,fragment,splash,rel,music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_tasks);

        alc = (Button) findViewById(R.id.alc);
        alc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllTasksActivity.this,StartingActivity.class);
                startActivity(intent);
            }
        });

        logact = (Button) findViewById(R.id.logact);
        logact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllTasksActivity.this,LogActivity.class);
                startActivity(intent);
            }
        });

        splash = (Button) findViewById(R.id.splash);
        splash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllTasksActivity.this,splashActivity.class);
                startActivity(intent);
            }
        });

        rel = (Button) findViewById(R.id.rel);
        rel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllTasksActivity.this, RelativeLayoutActivity.class);
                startActivity(intent);
            }
        });

        listact = (Button) findViewById(R.id.lstact);
        listact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllTasksActivity.this,ListActivity.class);
                startActivity(intent);
            }
        });

        battery = (Button) findViewById(R.id.battery);
        battery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllTasksActivity.this,BatteryDemo.class);
                startActivity(intent);
            }
        });

        recycle = (Button) findViewById(R.id.recycle);
        recycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllTasksActivity.this,RecyclerViewActivity.class);
                startActivity(intent);
            }
        });

        sensor = (Button) findViewById(R.id.sensor);
        sensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllTasksActivity.this,SensorActivity.class);
                startActivity(intent);
            }
        });

        intentact = (Button) findViewById(R.id.intentact);
        intentact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllTasksActivity.this,IntentActivity.class);
                startActivity(intent);
            }
        });

        multilan = (Button) findViewById(R.id.multilan);
        multilan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllTasksActivity.this,MultiLanguageActivity.class);
                startActivity(intent);
            }
        });

        spinact = (Button) findViewById(R.id.spinact);
        spinact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllTasksActivity.this,SpinnerActivity.class);
                startActivity(intent);
            }
        });

        mapact = (Button) findViewById(R.id.mapact);
        mapact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllTasksActivity.this,MapsActivity.class);
                startActivity(intent);
            }
        });

        accel = (Button) findViewById(R.id.accel);
        accel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllTasksActivity.this,AccelerometerSensor.class);
                startActivity(intent);
            }
        });

        proximity = (Button) findViewById(R.id.proximity);
        proximity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllTasksActivity.this,ProximityActivity.class);
                startActivity(intent);
            }
        });

        navigation = (Button) findViewById(R.id.navigation);
        navigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllTasksActivity.this,NavigationActivity.class);
                startActivity(intent);
            }
        });

        tab = (Button) findViewById(R.id.tab);
        tab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllTasksActivity.this,TabbedActivityDemo.class);
                startActivity(intent);
            }
        });

        fragment = (Button) findViewById(R.id.fragment);
        fragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllTasksActivity.this,FragmentActivity.class);
                startActivity(intent);
            }
        });

        music = (Button) findViewById(R.id.music);
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllTasksActivity.this,MusicActivity.class);
                startActivity(intent);
            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);

        // first parameter is the file for icon and second one is menu
        return super.onCreateOptionsMenu(menu);
    }
}