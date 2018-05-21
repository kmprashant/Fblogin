package com.example.prashant.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.facebook.login.LoginManager;

public class secondActivity extends AppCompatActivity {

    ImageView imgProfilePic;
    TextView txtName,txtEmail;
    Button btnLogOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        imgProfilePic = (ImageView)findViewById(R.id.imgProfilePic);
        txtName = (TextView)findViewById(R.id.txtName);
        txtEmail = (TextView)findViewById(R.id.txtEmail);

        btnLogOut = (Button)findViewById(R.id.btnLogOut);


        String first_name = getIntent().getExtras().getString("first_name");
        String last_name = getIntent().getExtras().getString("last_name");
        String email = getIntent().getExtras().getString("email");
        String image = getIntent().getExtras().getString("image");

        //if(first_name!=null && last_name!=null && email!=null && image!=null){

            txtName.setText(first_name + " " + last_name);
            txtEmail.setText(email);
            Glide.with(secondActivity.this).load(image).into(imgProfilePic);
        /*
        else
        {
            Toast.makeText(getApplicationContext(),"Data not Found",Toast.LENGTH_SHORT).show();
        }*/


        btnLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoginManager.getInstance().logOut();
                Intent in = new Intent(secondActivity.this,signin.class);
                startActivity(in);
                finish();
            }
        });
    }
}
