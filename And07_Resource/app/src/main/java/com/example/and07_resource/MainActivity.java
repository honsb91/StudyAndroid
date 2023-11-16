package com.example.and07_resource;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    private String TAG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shape_layout1);

        Log.d(TAG, "String res : " + R.string.version);
        Log.d(TAG, "String res : " + R.string.server_ip);
    }
}