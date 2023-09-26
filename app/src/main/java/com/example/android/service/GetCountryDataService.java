package com.example.android.service;

import com.example.android.model.FetchedCountryData;

import retrofit2.Call;
import retrofit2.http.GET;

public class GetCountryDataService {
//    RETROFIT INTERFACE

   @GET("countries")
    Call<FetchedCountryData> fetchedCountryData();
}
