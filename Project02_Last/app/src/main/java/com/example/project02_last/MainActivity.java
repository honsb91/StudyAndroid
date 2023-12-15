package com.example.project02_last;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;

import com.example.project02_last.common.CommonConn;
import com.example.project02_last.common.CommonService;
import com.example.project02_last.customer.CustomerFragment;
import com.example.project02_last.databinding.ActivityMainBinding;

import java.util.HashMap;

import me.ibrahimsn.lib.OnItemSelectedListener;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements OnItemSelectedListener{

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.bottomBar.setOnItemSelectedListener(this);
        onItemSelect(0);
    }
    @Override
    public boolean onItemSelect(int i) {
        Log.d("btm", "onItemSelect: " +i);
        if(i==0){
            getSupportFragmentManager().beginTransaction().replace(binding.container.getId(),new CustomerFragment()).commit();
        }
        return true;
    }
}