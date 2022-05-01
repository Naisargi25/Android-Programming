package com.ademo.activitydemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Button btn1,btn2,btn3;
    ImageView id;
    TextView tv;
    BatteryReceiver batteryReceiver;

    String[] banks = {"SBI","PNB","HDFC","BOI","OBC"};
    public static final String PREFS_NAME = "MyPrefsFile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
//        setTitle("Main Activity");

        Toast.makeText(this, "onCreate method called", Toast.LENGTH_LONG).show();



        Spinner spin = (Spinner) findViewById(R.id.spin);
        spin.setOnItemSelectedListener(this);

        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,banks);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spin.setAdapter(aa);
        //public static final String PREFS_NAME = "MyPrefsFile";
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        boolean dialogShown = settings.getBoolean("dialogShown", false);
        if (!dialogShown) {
// AlertDialog code here
            Toast.makeText(this, "Dialogue box", Toast.LENGTH_LONG).show();
            SharedPreferences.Editor editor = settings.edit();
            editor.putBoolean("dialogShown", true);
            editor.commit();
        }



        //btn1 = (Button) findViewById(R.id.button1);

//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(MainActivity.this, FirstActivity.class);
//                i.putExtra("Name","Naisargi Patel");
//                i.putExtra("Mobile","6354651284");
//                startActivity(i);
//                //finish();
//            }
//        });
        //btn3 = (Button) findViewById(R.id.stop);

//        btn3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                stopService(new Intent(getApplicationContext(),NewService.class));
//            }
//        });
        //btn2 = (Button) findViewById(R.id.start);

//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                startService(new Intent(getApplicationContext(),NewService.class));
//            }
//        });


//        id = (ImageView) findViewById(R.id.image1);
//
//        Intent i = getIntent();
//        String action = i.getAction();
//        String type = i.getType();
//        if (Intent.ACTION_SEND.equals(action) && type != null) {
//            id.setImageURI(i.getParcelableExtra(Intent.EXTRA_STREAM));
//        }
////        Toast.makeText(this,"First activity called",Toast.LENGTH_LONG);
//        //Log.d("LoadActivity","onCreate method called");
  }



    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LoadActivity","onStop method called");
        unregisterReceiver(batteryReceiver);
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




    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int i, long l) {
        Toast.makeText(getApplicationContext(),banks[i],Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}