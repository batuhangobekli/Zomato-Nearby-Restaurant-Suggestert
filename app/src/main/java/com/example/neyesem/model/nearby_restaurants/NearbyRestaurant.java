package com.example.neyesem.model.nearby_restaurants;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NearbyRestaurant {

    @SerializedName("restaurant")
    @Expose
    private Restaurant restaurant;

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }


}

