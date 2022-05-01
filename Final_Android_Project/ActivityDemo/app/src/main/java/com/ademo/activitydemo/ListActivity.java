package com.ademo.activitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    ListView SimpleList;
    String countryList[] = {"India","Japan","America","China","NewZealand","Portugle","Australia","Africa","SouthAfrica","NorthAmerica","Asia","India","Japan","America","China","NewZealand","Portugle","Australia","Africa","SouthAfrica","NorthAmerica","Asia","India","Japan","America","China","NewZealand","Portugle","Australia","Africa","SouthAfrica","NorthAmerica","Asia"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        setTitle("List Activity");

        SimpleList = (ListView) findViewById(R.id.listview);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.rawlayout,R.id.text1,countryList);

        SimpleList.setAdapter(arrayAdapter);
    }
}