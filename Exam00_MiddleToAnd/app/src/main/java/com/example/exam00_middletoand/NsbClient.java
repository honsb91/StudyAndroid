package com.example.exam00_middletoand;

import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class NsbClient {

    public static Retrofit getNsbClient(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.0.48/mid/")
                .addConverterFactory(ScalarsConverterFactory.create())
                .build();


        return retrofit;
    }
}
