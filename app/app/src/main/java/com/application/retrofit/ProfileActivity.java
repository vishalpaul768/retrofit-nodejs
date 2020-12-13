package com.application.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
TextView username,useremail,usercity,userstate,usercountry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        username=findViewById(R.id.username);
        useremail=findViewById(R.id.useremail);
        usercity=findViewById(R.id.usercity);
        userstate=findViewById(R.id.userstate);
        usercountry=findViewById(R.id.usercountry);
        Intent intent=getIntent();
        String uname=intent.getStringExtra("name");
        String uemail=intent.getStringExtra("email");
        String ucity=intent.getStringExtra("city");
        String ustate=intent.getStringExtra("state");
        String ucountry=intent.getStringExtra("country");

        username.setText("Name : "+uname);
        useremail.setText("Email : "+uemail);
        usercity.setText("City : "+ucity);
        userstate.setText("State : "+ustate);
        usercountry.setText("Country : "+ucountry);

    }
}
