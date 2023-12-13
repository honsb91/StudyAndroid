package com.example.exam00_middletoand;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NsbInterface nsbInterface = NsbClient.getNsbClient().create(NsbInterface.class);

        NsbVO vo = new NsbVO();
        vo.setStr("hds");
        vo.setNum(29);
        vo.setDoubleF(3.14);

        String jsonData = new Gson().toJson(vo);
        HashMap<String,Object> params = new HashMap<>();
        params.put("param",jsonData);

        nsbInterface.getData("asdf.nsb",params).enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {

            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {

            }
        });
    }
}