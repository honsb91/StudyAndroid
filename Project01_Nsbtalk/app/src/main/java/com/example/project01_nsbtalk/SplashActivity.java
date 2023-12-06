package com.example.project01_nsbtalk;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide(); // 액션바 숨기기 ( NoActionbar의 경우 NullPointerException 발생 !)

        ProgressDialog dialog = new ProgressDialog(this);
        dialog.setTitle("Nsb Talk");
        dialog.setMessage("로딩중 대기 바랍니다..");
        dialog.setCancelable(false); // 다이얼로그를 취소하지 못하게 처리해주는 로직
        dialog.show(); // 실제 보이는 처리

        new Handler().postDelayed(() -> {
            dialog.dismiss();// 눈에 안보이게 처리하는 로직
            intentMain();
        }, 5 * 1000);
    }

    public void intentMain(){
        runOnUiThread( ()->{
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}