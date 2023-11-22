package com.example.and08_activity_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {

    EditText edt_id , edt_pw;
    Button btn_login;
    TextView tv_join;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edt_id = findViewById(R.id.edt_id);
        edt_pw = findViewById(R.id.edt_pw);
        btn_login = findViewById(R.id.btn_login);
        tv_join = findViewById(R.id.tv_join); // 디자인뷰와 텍스트 객체가 연결


        tv_join.setOnClickListener(v -> {
            Intent intent = new Intent(this,JoinActivity.class);
            startActivity(intent);
        });
       //Toast.makeText(this, "나는 컨텍스트", Toast.LENGTH_SHORT).show();
        //new ContextTest().method(this);
        // setOnclickListner -> 이벤트 처리
        // editText에 있는 글자를 가져오는 메소드 : editText.getText() 메소드
        // id가 admin 비밀번호가 admin1234 인 경우 로그가 성공이라고 찍히고 그 외에는 실패 !
        btn_login.setOnClickListener(v -> {
            // (Activity) Context : 모든 엑티비티는 Context 자체
            // Context라는것은 앱의 현재 상태나 환경에 대한 모든 정보를 제공하고 접근할 수 있는 인터페이스임(static)
            // 화면 전환 , 토스트창을 보여주는 등의 디자인 관련 된 기능을 사용하기 위해서는 내가 현재 액티비티를 반드시 알려줘야할 의무가 있음.

            // Intent 초기화 시 필요한 정보 : 화면 전환 시 -> 1. 현재 앱의 상태 ( 현재 화면 .. 등 ) 2. 실행이 되어야 할 화면 (Activity) 의 클래스 위치.


            if("admin".equals(edt_id.getText()+"") && "admin1234".equals(edt_pw.getText()+"")){
                Log.d("로그인 성공", edt_id.getText()+ "");
                LoginDTO dto = new LoginDTO(edt_id.getText().toString() , edt_pw.getText().toString());
                ArrayList<LoginDTO> list = new ArrayList<>();
                list.add(new LoginDTO("id1", "pw1"));
                list.add(new LoginDTO("id2", "pw2"));


                Intent intent = new Intent(this, MainActivity.class);
                intent.putExtra("strkey", "테스트데이터 스트링");
                intent.putExtra("intkey", "111");
                intent.putExtra("dtokey" , dto);
                intent.putExtra("listkey", list); // list를 보낼 수 있는 이유는 dto가 직렬화 되어있기 때문. ArrayList<직렬화> == list <로그인클래스>

                startActivity(intent);
                finish(); // 현재 activity 종료.

            }else{
                Log.d("로그인 실패", edt_pw.getText()+"");
            }
        });

    }
}