package com.example.prashant.demo;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageView = (ImageView) findViewById(R.id.logo);


        int secondsDelayed = 1;



        new Handler().postDelayed(new Runnable() {
            public void run() {

                startActivity(new Intent(MainActivity.this, AfterMainActivity.class));
                //overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                finish();
            }
        }, secondsDelayed * 3000);


        //getSupportActionBar().hide();


    }
}
