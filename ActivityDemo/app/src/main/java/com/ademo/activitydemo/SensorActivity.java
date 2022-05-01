package com.ademo.activitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;

public class SensorActivity extends AppCompatActivity {

    TextView tv;
    private SensorManager sensorManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor);
        setTitle("Sensor List");

        tv = (TextView) findViewById(R.id.sensortext);
        tv.setVisibility(View.GONE);

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        List<Sensor> sList = sensorManager.getSensorList(Sensor.TYPE_ALL);

        for(int i=1;i<sList.size();i++)
        {
            tv.setVisibility(View.VISIBLE);
            tv.append("\n"+ sList.get(i).getName());
        }
    }
}