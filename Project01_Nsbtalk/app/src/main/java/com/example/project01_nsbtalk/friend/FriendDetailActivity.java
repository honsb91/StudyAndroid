package com.example.project01_nsbtalk.friend;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.project01_nsbtalk.R;
import com.example.project01_nsbtalk.databinding.ActivityFriendDetailBinding;

public class FriendDetailActivity extends AppCompatActivity {
    ActivityFriendDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityFriendDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();

        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        window.setStatusBarColor(Color.TRANSPARENT);
        View view = getWindow().getDecorView();
        view.setSystemUiVisibility(view.getSystemUiVisibility() & ~view.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        FriendDTO dto = (FriendDTO) getIntent().getSerializableExtra("dto");
        binding.tvName.setText(dto.getName());
        binding.imgvProfile.setImageResource(dto.getProfileImg());
        binding.imgvBack.setImageResource(dto.getSubImg());

        binding.imgvClose.setOnClickListener(v->{
            finish();
        });
    }
}