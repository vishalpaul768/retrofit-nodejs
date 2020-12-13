package com.application.retrofit.api;

import com.application.retrofit.model.MyUserData;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface MyApi {
    @FormUrlEncoded
    @POST("register")
    Call<ResponseBody> createNewAcount(@Field("name") String username,
                                     @Field("email") String email,
                                     @Field("password") String pass,
                                     @Field("city") String city,
                                     @Field("state") String state,
                                     @Field("country") String country
    );

    @FormUrlEncoded
    @POST("login")
    Call<MyUserData>logIn(@Field("email") String email,
                            @Field("password") String pass
    );





}
