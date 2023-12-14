package com.example.project02_last.member;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
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
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.sdk.common.KakaoSdk;
import com.kakao.sdk.user.UserApiClient;
import com.navercorp.nid.NaverIdLoginSDK;
import com.navercorp.nid.oauth.NidOAuthLogin;
import com.navercorp.nid.oauth.OAuthLoginCallback;
import com.navercorp.nid.profile.NidProfileCallback;
import com.navercorp.nid.profile.data.NidProfileResponse;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public class LoginActivity extends AppCompatActivity {

    ActivityLoginBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        NaverIdLoginSDK.INSTANCE.initialize(this , "get" , "Xlx9HyKOzz" , "Project02_Last");

        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Glide.with(this).load("https://taehyunha.files.wordpress.com/2020/05/cdd521b0d71ce352728ffe8055434b8be509dcf819b0d184e360a2699c2ab4413df86935009322be24d8778aa5ededf8d3fbc860f2931c41261cc214d2dfdd731eb47db6d9eb84aa015c90821384078cca79f92d0af79b36726f447190.gif")
                .error(R.drawable.ic_launcher_foreground)// 에러 발생..
                .fallback(R.drawable.ic_launcher_background)// null을 넘김..
                .into(binding.imgvLogo);

//        new CommonConn(this,"amama.kym").addParamMap("param","andData").onExcute((isResult, data) -> {
//            Log.d("테스트", "onCreate: " + isResult + data);
//        });
        binding.btnLogin.setOnClickListener(v->{
            login(binding.edtId.getText().toString(), binding.edtPw.getText().toString());
        });

        binding.imgvKakaoLogin.setOnClickListener(v->{
            kakaoLogin(this);
        });

        naverLogin();

        // 집에서 실행하면 해시키가 다름. 문서확인해야함
       // getHashKey();
    }

    public void kakaoLogin(Context context){
        //KakaoSdk.init(this, "{NATIVE_APP_KEY}")
        KakaoSdk.INSTANCE.init(this, "39b879a0e24b791eab4d0b25e2cfb05e");
        Function2<OAuthToken, Throwable, Unit> callback = new Function2<OAuthToken, Throwable, Unit>() {
            @Override
            public Unit invoke(OAuthToken oAuthToken, Throwable error) {
                if (error == null){
                    Log.d("카카오", "invoke: " + oAuthToken.getAccessToken());
                    UserApiClient.getInstance().me((user, throwable) -> {
                       if (throwable==null){
                           Log.d("카카오", "invoke(정보): " + user.getKakaoAccount().getProfile().getNickname());
                           Log.d("카카오", "invoke(정보): " + user.getKakaoAccount().getProfile().getProfileImageUrl());
                       }else {
                           Log.d("카카오", "invoke(오류): " + throwable.getMessage());
                       }

                        return null;
                    });
                }else{
                    Log.d("카카오", "invoke: " + error.getMessage());
                }
                return null;
            }
        };

        Function2<OAuthToken, Throwable, Unit> callback2 = (oAuthToken, throwable) -> {
            return null;
        };

        if (UserApiClient.getInstance().isKakaoTalkLoginAvailable(context)){
            Log.d("카카오", "kakaoLogin: 카카오톡이 설치 되어 있음");
            UserApiClient.getInstance().loginWithKakaoTalk(context, callback);

        }else {
            Log.d("카카오", "kakaoLogin: 카카오톡이 설치 X -> WEB");
            UserApiClient.getInstance().loginWithKakaoAccount(context,callback);

        }
    }

    public void naverLogin(){
        binding.buttonOAuthLoginImg.setOAuthLogin(new OAuthLoginCallback() {
            @Override
            public void onSuccess() {
                Log.d("네이버", "onSuccess: " + NaverIdLoginSDK.INSTANCE.getAccessToken());

                new NidOAuthLogin().callProfileApi(new NidProfileCallback<NidProfileResponse>() {
                    @Override
                    public void onSuccess(NidProfileResponse nidProfileResponse) {
                        //Social ( key ) 네이버 아이디 ..카카오톡 아이디 등등.
                        //id ( key ) <- naver,kakao... kym@naver.com
                        Log.d("네이버", "onSuccess: " + nidProfileResponse.getProfile().getEmail());

                        login(nidProfileResponse.getProfile().getEmail(), null);

                        Log.d("네이버", "onSuccess: " + nidProfileResponse.getProfile().getMobile());
                        Log.d("네이버", "onSuccess: " + nidProfileResponse.getProfile().getName());
                        Log.d("네이버", "onSuccess: " + nidProfileResponse.getProfile().getProfileImage());

                    }
                    @Override
                    public void onFailure(int i, @NonNull String s) {

                    }
                    @Override
                    public void onError(int i, @NonNull String s) {
                    }
                });
            }
            @Override
            public void onFailure(int i, @NonNull String s) {
                Log.d("네이버", "onFailure: ");
            }
            @Override
            public void onError(int i, @NonNull String s) {
                Log.d("네이버", "onError: ");
            }
        });

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

    // 일반 로그인
    public void login(String user_id , String user_pw){
        CommonConn conn = new CommonConn(this,"login.me");
        conn.addParamMap("user_id" ,user_id);
        if(user_pw == null){
            conn.addParamMap("social" , "y");
        }else {
            conn.addParamMap("user_pw" , user_pw);
        }


        conn.addParamMap("user_pw" ,user_pw);
        conn.onExcute((isResult, data) -> {
            //서버가 응답을 함.(또는 오류)
            //1.toJson ( 내가 StringJson으로 데이터를 줘야함 )
            //2.fromJson ( StringJson을 받아와서 내가 원하는 형태로 바꿈 )
            Log.d("로그인", "onCreate: " + data);
            MemberVO vo = new Gson().fromJson(data , MemberVO.class);
            if(vo == null){
                Toast.makeText(this, "아이디 또는 패스워드 틀림", Toast.LENGTH_SHORT).show();
                return;
            }
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            //finish(); 로그인->Main ( 뒤로가기 눌렀을 때 다시 로그인 화면이 나옴 )

        });
    }

}