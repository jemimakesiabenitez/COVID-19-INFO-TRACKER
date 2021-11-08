package com.example.covid_19tracker;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUtilities {

    public static Retrofit retrofit=null;

    public static ApiInterface getApiInterface(){
        if (retrofit==null){
            Retrofit.Builder builder = new Retrofit.Builder();
            builder.baseUrl(ApiInterface.BASE_URL);
            builder.addConverterFactory(GsonConverterFactory.create());
            retrofit= builder.build();
        }
        return retrofit.create(ApiInterface.class);
    }
}
