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
        // ActivityMainBinding -> 클래스의 인스턴스를 생성하고 ,이를 초기화 하는 역할
        // inflate(getLayoutInflater()); -> 현재 액티비티의 LayoutInflater를 얻고 , 이를 사용하여 XML 레이아웃 파일을 인플레이트
        setContentView(binding.getRoot());
        //setContentView(binding.getRoot()): binding.getRoot()는 인플레이트된 레이아웃의 최상위 뷰를 반환.
        // setContentView() 메서드를 통해 현재 액티비티의 화면에 이 최상위 뷰를 설정
        //이렇게 사용하면 XML 레이아웃에 있는 모든 뷰들이 ActivityMainBinding 클래스의 인스턴스에 바인딩되어 사용 가능.

//        ActionBar actionBar = getSupportActionBar();
//        actionBar.setElevation(0f);




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