package com.example.project01_nsbtalk;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.project01_nsbtalk.chat.ChatFragment;
import com.example.project01_nsbtalk.databinding.ActivityMainBinding;
import com.example.project01_nsbtalk.friend.FriendFragment;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater()); // 바인딩 초기화
        setContentView(binding.getRoot());

        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0f); // 액션바 밑에 명암 , 그림자를 없애는 코드
        actionBar.setTitle("친구"); // 액션바 이름

//        binding.bottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                return false;
//            }
//        });

        changeFragment(new FriendFragment());
        binding.bottomNav.setOnItemSelectedListener(item ->{
            if (item.getItemId() == R.id.tab1){
                changeFragment(new FriendFragment());
            } else if (item.getItemId() == R.id.tab2) {
                changeFragment(new ChatFragment());    
            }else if (item.getItemId() == R.id.tab3) {

            }else if (item.getItemId() == R.id.tab4) {

            }else if (item.getItemId() == R.id.tab5) {

            }
            actionBar.setTitle(item.getTitle());

            return true;
        });
    }

    public void changeFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
    }

}