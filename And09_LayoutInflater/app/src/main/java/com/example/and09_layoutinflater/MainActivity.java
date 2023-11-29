package com.example.and09_layoutinflater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //TextView tv;
    Button btn_inflate;
    LinearLayout ll_layout;
    LinearLayout rl_layout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        tv = findViewById(R.id.tv);
//        tv.setText("오류!");

        btn_inflate = findViewById(R.id.btn_inflate);
        ll_layout = findViewById(R.id.ll_layout);
        rl_layout = findViewById(R.id.rl_layout);

        // 안드로이드 어려운점 : 대부분의 기능들이 구현이 되어있음 ( == IOS도 같음 )
        // 어느정도의 커스터마이징은 되지만 , 그 이상은 개인정보침해나 해킹의 위험요소로 제약이 약간 있음
        // 문서가 초급자에게 친절하지 않음

        // 레이아웃 인플레이트 ( 레이아웃 인플레이션 과정을 통한 화면 붙이기 )
        // 1 . 화면이 붙을 공간 ( 레이아웃 ) 을 액티비티 내부에 미리 만들어 놓음
        // 2 . 화면에 붙일 레이아웃을 별도로 만든다 ( 현재 : sub_layout1.xml , sub_layout2.xml )
        // 3 . Java 코드를 이용해서 레이아웃 인프레이트 시키기 <= 프래그먼트


        LayoutInflater inflater = getLayoutInflater(); // layoutInflater 초기화 식 , 명령을 내리면 레이아웃을 붙이는 역할

        btn_inflate.setOnClickListener(v ->  {
            // 뷰를 부모에게 즉시 연결할지 여부를 결정
            // 프래그먼트는 따로 자바코드를 가지고있고 , 붙는 처리를 메소드로 따로 진행함
            View viewSub1 = inflater.inflate(R.layout.sub_layout1,ll_layout,true);
            Button btn_sub1 = viewSub1.findViewById(R.id.btn_sub1);

            inflater.inflate(R.layout.sub_layout2,rl_layout,true);
        });

    }
}