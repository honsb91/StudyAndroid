package com.example.airbnbapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.airbnbapplication.databinding.ActivityMainBinding;
import com.example.airbnbapplication.list.ListFragment;
import com.example.airbnbapplication.login.LoginFragment;
import com.example.airbnbapplication.message.MessageFragment;
import com.example.airbnbapplication.search.SearchFragment;
import com.example.airbnbapplication.travel.TravelFragment;

public class MainActivity extends AppCompatActivity {

    
    ActivityMainBinding binding; // (1). binding 선언

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityMainBinding.inflate(getLayoutInflater()); // (2). binding 초기화
        setContentView(binding.getRoot());

        changeFragment(new SearchFragment());
        binding.bottomNav.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.tab1) {
                changeFragment(new SearchFragment());
            } else if (item.getItemId() == R.id.tab2) {
                changeFragment(new ListFragment());
            }else if (item.getItemId() == R.id.tab3) {
                changeFragment(new TravelFragment());
            }else if (item.getItemId() == R.id.tab4) {
                changeFragment(new MessageFragment());
            }else if (item.getItemId() == R.id.tab5) {
                changeFragment(new LoginFragment());
            }
            return true;
        });
    }
    public void changeFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
    }


}