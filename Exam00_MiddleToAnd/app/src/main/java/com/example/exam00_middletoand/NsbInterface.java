package com.example.exam00_middletoand;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Url;

public interface NsbInterface {

    @FormUrlEncoded
    @POST
    Call<String> getData(@Url String url , @FieldMap HashMap<String , Object> params);
}
