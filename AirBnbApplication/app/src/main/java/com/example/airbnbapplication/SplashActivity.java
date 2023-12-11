package com.example.airbnbapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ProgressDialog dialog = new ProgressDialog(this);

        new Handler().postDelayed(() -> {
            dialog.dismiss();
            intentMain();
        }, 3 * 1000);
    }

    public void intentMain(){
        runOnUiThread(()->{
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}