package com.application.retrofit.model;

import com.google.gson.annotations.SerializedName;

public class UserData {


    @SerializedName("name")
    public String name;

    @SerializedName("email")
    public String email;

    @SerializedName("city")
    public String city;

    @SerializedName("state")
    public String state;

    @SerializedName("country")
    public String country;

    public UserData(String name, String email, String city, String state, String country) {
        this.name = name;
        this.email = email;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
