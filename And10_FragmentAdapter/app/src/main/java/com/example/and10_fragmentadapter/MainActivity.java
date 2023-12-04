package com.example.and10_fragmentadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.and10_fragmentadapter.fragments.MyFragment;
import com.example.and10_fragmentadapter.fragments.MyFragment2;
import com.example.and10_fragmentadapter.fragments.MyFragment3;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_frag1 = findViewById(R.id.btn_frag1);
        Button btn_frag2 = findViewById(R.id.btn_frag2);
        Button btn_frag3 = findViewById(R.id.btn_frag3);
        MyFragment fragment = new MyFragment();


        btn_frag1.setOnClickListener(v->{
            getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
        });


        btn_frag2.setOnClickListener(v->{
            getSupportFragmentManager().beginTransaction().replace(R.id.container,new MyFragment2()).commit();
        });

        btn_frag3.setOnClickListener(v -> {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, new MyFragment3()).commit();
        });


    }
}