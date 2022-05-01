package com.ademo.activitydemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class AccelerometerSensor extends AppCompatActivity implements SensorEventListener {

    TextView textview2;
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accelerometer_sensor);

        setTitle("Accelerometer sensor");
        SensorManager sensorManager =(SensorManager)getSystemService(SENSOR_SERVICE);
        constraintLayout = (ConstraintLayout)findViewById(R.id.constraint);
        textview2=(TextView) findViewById(R.id.textview);

        if(sensorManager != null)
        {
            Sensor proximitrysensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
            if(proximitrysensor != null)
            {
                sensorManager.registerListener(this, proximitrysensor, SensorManager.SENSOR_DELAY_NORMAL);
            }
        }
        else
        {
            Snackbar snackbar = Snackbar.make(constraintLayout, "Sensor nathi", Snackbar.LENGTH_LONG);
            snackbar.show();
        }
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {

        if(sensorEvent.sensor.getType()==Sensor.TYPE_ACCELEROMETER){
            textview2.setText("Accelerator : \nX:   "+sensorEvent.values[0]  + " \nY:   " + sensorEvent.values[1] + "\nZ:   " + sensorEvent.values[2]);
        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }

}