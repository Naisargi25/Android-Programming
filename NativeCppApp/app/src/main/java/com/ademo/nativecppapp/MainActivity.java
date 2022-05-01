package com.ademo.nativecppapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.ademo.nativecppapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    Button btnJNI;
    // Used to load the 'nativecppapp' library on application startup.
    static {
        System.loadLibrary("nativecppapp");
    }

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Example of a call to a native method
        TextView tv = binding.sampleText;
        tv.setText(stringFromJNI());

        btnJNI = findViewById(R.id.btnJni);
        View btnJNIStringArray = findViewById(R.id.btnJniStringArray);
        btnJNI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = sendYourName("Naisargi", " Patel");
                Toast.makeText(getApplicationContext(), "Result from JNI is " + result,
                        Toast.LENGTH_LONG).show();
            }
        });
        btnJNIStringArray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] strings = stringArrayFromJNI();
                Toast.makeText(getApplicationContext(), "First element is "+strings[0],
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    /**
     * A native method that is implemented by the 'nativecppapp' native library,
     * which is packaged with this application.
     */

    public native String stringFromJNI();
    public native String sendYourName(String firstName, String lastName);
    public native String[] stringArrayFromJNI();

}