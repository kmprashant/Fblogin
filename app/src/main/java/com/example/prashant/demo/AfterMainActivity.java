package com.example.prashant.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AfterMainActivity extends AppCompatActivity {

    ImageView imgViewTesla;
    Button btnSignUp;
    Button btnSignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_main);


        //imgViewTesla = (ImageView)findViewById(R.id.imgView);
        btnSignUp = (Button)findViewById(R.id.btnSignUp);
        btnSignIn = (Button)findViewById(R.id.btnSignIn);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AfterMainActivity.this, signin.class);
                startActivity(intent);

            }
        });

    }
}
