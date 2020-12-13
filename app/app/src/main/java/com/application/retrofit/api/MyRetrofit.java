package com.application.retrofit.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MyRetrofit {
    private static final String BASE_URL="http://10.0.2.2:3000/";
    private static MyRetrofit myRetrofit;
    private Retrofit retrofit;

    private MyRetrofit(){

        retrofit=new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();

    }

    public static synchronized MyRetrofit getInstance(){
        if (myRetrofit==null){
            myRetrofit=new MyRetrofit();
        }
        return myRetrofit;
    }

    public MyApi getMyApi(){
        return retrofit.create(MyApi.class);
    }
}
