package com.example.and02_intolayoutconst;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView 메소드 실행 후 -> activity_main.xml에 내부에 있는 모든 위젯이 메모리에 로딩됨.(id가 부여되어야만 찾아서 사용이 가능)
        //Android는 코드영역과 Gradle(빌드)도구가 나누어져 있어 , 가끔 Sync를 해줘야 최신본을 읽는다.
        //따라서 코드가 오류가 없는데 , 빨간줄이 나오면 우측 상단의 Gradle Sync로 연결을 해줘야한다.
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(this);
//        btn.setOnClickListener(new View.OnClickListener()){
//            @Override
//            public void onClick(View v){
//                Toast.makeText(this, "토스트창?", Toast.LENGTH_SHORT).show();
//            }
//        };
//        btn.setOnClickListener((v)->{
//            Toast.makeText(this, "람다 토스트", Toast.LENGTH_SHORT).show();
//        });

    }

//    @Override
//    public void onClick(View v) {
//        Toast.makeText(this, "이", Toast.LENGTH_SHORT).show();
//    }
}