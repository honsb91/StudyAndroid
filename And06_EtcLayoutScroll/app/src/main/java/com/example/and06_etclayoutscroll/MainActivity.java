package com.example.and06_etclayoutscroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv_text;
    HorizontalScrollView scroll_h;
    ScrollView scroll_v;
    View btm_nav;

    // id를 부여하고 find를 하면 무조건 사용할 수 있다.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_text = findViewById(R.id.tv_text);
        scroll_h = findViewById(R.id.scroll_h);
        scroll_v = findViewById(R.id.scroll_v);
        btm_nav = findViewById(R.id.btm_nav);

        btm_nav.setOnClickListener( v->{
            Log.d("Scroll위치", "getScrollY" + scroll_v.getScrollY());
            Log.d("Scroll위치", "getScrollX" + scroll_h.getScrollX());
            scroll_v.scrollTo(0,scroll_v.getScrollY()+100);
            scroll_h.smoothScrollTo(scroll_h.getScrollX()+100,0);
        });

        //int errorNum = 1;
        //tv_text.setText(errorNum+"");// int형을 넣으면 res하위에 있는 리소스 아이디로 판단. String 형태로 바꿔서 넣어줘야 함.

        tv_text.setText("글자"); // 기존 글자를 현재 파라메터의 String으로 바꿈.
        //tv_text.append("\n붙이기"); // 글자열을 붙이는 용도
        //ScrollView ( <- Verctial)
       for(int i=0; i<50; i++){
           for(int j=0; j<30; j++){
               tv_text.append("가나다라");
           }
           tv_text.append("\n붙이기" + i);
       }


    }
}