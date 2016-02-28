package com.map.traveller.travellertheapp.rest;

import java.util.Map;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.QueryMap;
import com.map.traveller.travellertheapp.model.Shops;

/**
 * Created by vivz on 24/08/15.
 */
public interface GooglePlacesService {
    @GET("/maps/api/place/nearbysearch/json")
    void getCafes(@QueryMap Map<String, String> options, Callback<Shops> callback);
}
