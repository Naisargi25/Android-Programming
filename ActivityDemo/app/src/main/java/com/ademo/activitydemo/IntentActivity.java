package com.ademo.activitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class IntentActivity extends AppCompatActivity {
    Button implicit,implicit2,call,email;
    ImageButton img;
    EditText etext,phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        implicit = (Button) findViewById(R.id.implicit);
        implicit2 = (Button) findViewById(R.id.explicit);
        img = (ImageButton) findViewById(R.id.wp);
        etext = (EditText) findViewById(R.id.text);
        phone = (EditText) findViewById(R.id.phone);
        call = (Button) findViewById(R.id.call);
        email = (Button) findViewById(R.id.email);

        setTitle("Intent");

        implicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.com/"));
                startActivity(intent);


            }
        });

        implicit2.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View view)
            {
                String text = "Hey Chipmates!!!";
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(intent.EXTRA_TEXT,text);
                startActivity(Intent.createChooser(intent,"Suggest to friends"));
            }
        });

        img.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View view)
            {
                //String text = "Hey Chipmates!!!";
                String text = etext.getText().toString();
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(intent.EXTRA_TEXT,text);
                intent.setPackage("com.whatsapp");
                startActivity(Intent.createChooser(intent,"Suggest to friends"));
            }
        });

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+phone.getText().toString()));
                startActivity(intent);
            }
        });

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String subject = "Regarding Leave Application";
                String body = "Dear sir, Kindly approve my leave application";
                String recipients = "ap7916237@gmail.com";

                Intent email = new Intent(Intent.ACTION_SEND,Uri.parse("mailto:"));
                email.setType("message/rfc822");
                email.putExtra(Intent.EXTRA_EMAIL,recipients);
                email.putExtra(Intent.EXTRA_SUBJECT,subject);
                email.putExtra(Intent.EXTRA_TEXT,body);
                startActivity(Intent.createChooser(email,"Choose an email client from..."));
            }
        });



    }
}