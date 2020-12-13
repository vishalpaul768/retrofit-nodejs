package com.application.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.application.retrofit.api.MyRetrofit;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SignUpActivity extends AppCompatActivity {
    EditText etname,etemail,etpass,etcity,etstate,etcountry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        etname=findViewById(R.id.editName);
        etemail=findViewById(R.id.editEmail);
        etpass=findViewById(R.id.editPass);
        etcity=findViewById(R.id.editCity);
        etstate=findViewById(R.id.editState);
        etcountry=findViewById(R.id.editCountry);
        Button btn_new=findViewById(R.id.buttonAcount);
        btn_new.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createNewAcount();
            }
        });

    }

    private void createNewAcount() {

        String name=etname.getText().toString().trim();
        String email=etemail.getText().toString().trim();
        String pass=etpass.getText().toString().trim();
        String city=etcity.getText().toString().trim();
        String state=etstate.getText().toString().trim();
        String country=etcountry.getText().toString().trim();


        if (name.isEmpty()) {
            etname.setError("Enter name");
            etname.requestFocus();
            return;
        }
        if (email.isEmpty()) {
            etemail.setError("enter email");
            etemail.requestFocus();
            return;
        }
        if (pass.isEmpty()) {
            etpass.setError("enter password");
            etpass.requestFocus();
            return;
        }
        if (city.isEmpty()) {
            etpass.setError("enter password");
            etpass.requestFocus();
            return;
        }
        if (state.isEmpty()) {
            etpass.setError("enter password");
            etpass.requestFocus();
            return;
        }
        if (country.isEmpty()) {
            etpass.setError("enter password");
            etpass.requestFocus();
            return;
        }

        Call<ResponseBody>call= MyRetrofit.getInstance().getMyApi().createNewAcount(name,email,pass,city,state,country);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    String hi=response.body().string();
                    Toast.makeText(getApplicationContext(),hi,Toast.LENGTH_LONG).show();
                    startActivity(new Intent(SignUpActivity.this,MainActivity.class));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });
    }

}
