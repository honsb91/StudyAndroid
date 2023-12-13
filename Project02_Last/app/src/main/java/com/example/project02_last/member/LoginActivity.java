package com.example.project02_last.member;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.example.project02_last.R;
import com.example.project02_last.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        Glide.with(this).load("https://mblogthumb-phinf.pstatic.net/MjAxOTA0MjVfMTA3/MDAxNTU2MTkzNzg1Nzg5.7Iw43beGHWehzpwauk3kRNy9cD1HUvWl5CzeG0hEkEgg.r0P3TsoSljWyClL93z0HJJlBHIZsEA8_oLs5wbGbJ00g.GIF.dudthd97/%EC%99%84%EB%A3%8C1.gif?type=w800")
                .error(R.drawable.ic_launcher_background) //에러발생
                .fallback(R.drawable.ic_launcher_foreground) // null 발생
                .into(binding.imgvLogo);
    }
}