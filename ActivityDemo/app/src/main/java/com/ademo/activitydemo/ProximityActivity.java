package com.ademo.activitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

public class ProximityActivity extends AppCompatActivity implements SensorEventListener {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proximity);
        setTitle("Proximity Sensor");

        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);

        tv = (TextView) findViewById(R.id.textView);

        if(sensorManager!=null){
            Sensor proximitysensor = sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);
            if(proximitysensor != null){
                sensorManager.registerListener(this,proximitysensor,SensorManager.SENSOR_DELAY_NORMAL);
            }

        }
        else{
            Toast.makeText(getApplicationContext(),"No Proximity Sensor found",Toast.LENGTH_SHORT).show();
        }

    }
    public void onSensorChanged(SensorEvent sensorEvent) {
        if(sensorEvent.sensor.getType()==Sensor.TYPE_PROXIMITY){
            tv.setText("Proximity : "+sensorEvent.values[0]);
        }
        if(sensorEvent.values[0]>0){
            WindowManager.LayoutParams params = getWindow().getAttributes();
            params.screenBrightness = 1;
            getWindow().setAttributes(params);
        }else {
            WindowManager.LayoutParams params = getWindow().getAttributes();
            params.screenBrightness = -1;
            getWindow().setAttributes(params);

        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}