package com.example.and08_activity_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    // 현재는 onCreate 메소드에서 대부분의 코드를 처리해도 무방
    // 추후에 여러 화면 또는 Spring 연동 시 새로고침의 등의 처리가 필요하다면 수명주기가 있다는 사실을 인지하고 사용하면 됨

    // Spring(jsp..) 모든 개발 툴에서는 디버깅 모드가 제공이 됨 -> 이것을 활용하면 프로그램의 전체 구조를 빠르게 파악하거나 오류 수정이 수월
    private final String TAG = "액티비티 수명주기";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
        
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }
}