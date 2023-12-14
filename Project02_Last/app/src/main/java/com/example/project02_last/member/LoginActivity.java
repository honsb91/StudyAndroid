package com.example.project02_last.member;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.project02_last.MainActivity;
import com.example.project02_last.R;
import com.example.project02_last.common.CommonConn;
import com.example.project02_last.databinding.ActivityLoginBinding;
import com.google.gson.Gson;
import com.kakao.sdk.common.KakaoSdk;
import com.navercorp.nid.NaverIdLoginSDK;
import com.navercorp.nid.oauth.NidOAuthLogin;
import com.navercorp.nid.oauth.OAuthLoginCallback;
import com.navercorp.nid.profile.NidProfileCallback;
import com.navercorp.nid.profile.data.NidProfileResponse;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class LoginActivity extends AppCompatActivity {

    ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //NaverIdLoginSDK.initialize(context, {OAUTH_CLIENT_ID}, {OAUTH_CLIENT_SECRET}, {OAUTH_CLIENT_NAME})
        NaverIdLoginSDK.INSTANCE.initialize(this, "qAVZP1XDVwSXzZgpKpLX", "Xlx9HyKOzz", "Project02_Last");

        super.onCreate(savedInstanceState);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        Glide.with(this).load("https://mblogthumb-phinf.pstatic.net/MjAxOTA0MjVfMTA3/MDAxNTU2MTkzNzg1Nzg5.7Iw43beGHWehzpwauk3kRNy9cD1HUvWl5CzeG0hEkEgg.r0P3TsoSljWyClL93z0HJJlBHIZsEA8_oLs5wbGbJ00g.GIF.dudthd97/%EC%99%84%EB%A3%8C1.gif?type=w800")
                .error(R.drawable.ic_launcher_background) //에러발생
                .fallback(R.drawable.ic_launcher_foreground) // null 발생
                .into(binding.imgvLogo);

        /*new CommonConn(this,"amamam.nsb").addParamMap("param","andData").onExcute((isResult, data) -> {
            Log.d("테스트", "onCreate: " + isResult + data);
        });*/

        binding.btnLogin.setOnClickListener(v -> {
            CommonConn conn = new CommonConn(this, "login.me");
            conn.addParamMap("user_id", binding.edtId.getText().toString());
            conn.addParamMap("user_pw", binding.edtPw.getText().toString());
            conn.onExcute((isResult, data) -> {
                // 서버가 응답을 함 ( 또는 오류 )
                Log.d("로그인", "onCreate: " + data);
                MemberVO vo = new Gson().fromJson(data, MemberVO.class);
                if (vo == null) {
                    Toast.makeText(this, "아이디 또는 패스워드 틀림", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                /*finish();*/
            });
        });
        naverlogin();
        kakoLogin();
        getHashKey();
    }

    public void kakoLogin() {
        //KakaoSdk.init(this, "{NATIVE_APP_KEY}");
        KakaoSdk.INSTANCE.init(this,"39b879a0e24b791eab4d0b25e2cfb05e");

    }
        public void naverlogin(){

        }


        private void getHashKey(){
            PackageInfo packageInfo = null;
            try {
                packageInfo = getPackageManager().getPackageInfo(getPackageName(), PackageManager.GET_SIGNATURES);
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
            if (packageInfo == null)
                Log.e("KeyHash", "KeyHash:null");

            for (Signature signature : packageInfo.signatures) {
                try {
                    MessageDigest md = MessageDigest.getInstance("SHA");
                    md.update(signature.toByteArray());
                    Log.d("KeyHash", Base64.encodeToString(md.digest(), Base64.DEFAULT));
                } catch (NoSuchAlgorithmException e) {
                    Log.e("KeyHash", "Unable to get MessageDigest. signature=" + signature, e);
                }
            }
        }

    }
}