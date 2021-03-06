package com.ademo.activitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MultiLanguageActivity extends AppCompatActivity {

    Button b1;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadlocale();
        setContentView(R.layout.activity_multi_language);


        b1 = (Button) findViewById(R.id.btn1);
        tv = (TextView) findViewById(R.id.name);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changelanguage();
            }
        });


    }


    private void changelanguage() {
        final String languages [] = {"English","Gujarati","Hindi"};
        AlertDialog.Builder alertdialogbuilder = new AlertDialog.Builder(this);
        alertdialogbuilder.setTitle("Change Language");
        alertdialogbuilder.setSingleChoiceItems(languages, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if(i==0)
                {
                    setLocale("");
                    recreate();
                }
                else if(i==1)
                {
                    setLocale("gu");
                    recreate();
                }
                else if(i==2)
                {
                    setLocale("hi");
                    recreate();
                }
            }
        });
        alertdialogbuilder.create();
        alertdialogbuilder.show();
    }



private void setLocale(String language) {
        Locale locale = new Locale(language);
        Locale.setDefault(locale);
        Configuration configuration = new Configuration();
        configuration.locale=locale;
        getBaseContext().getResources().updateConfiguration(configuration,getBaseContext().getResources().getDisplayMetrics());
        SharedPreferences.Editor editor = getSharedPreferences("Settings",MODE_PRIVATE).edit();
        editor.putString("app_language",language);
        editor.apply();
        }
private void loadlocale()
        {
        SharedPreferences preferences = getSharedPreferences("Settings",MODE_PRIVATE);
        String language = preferences.getString("app_language","");
        setLocale(language);
        }
}