package com.example.project02_last.customer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project02_last.R;
import com.example.project02_last.common.CommonConn;
import com.example.project02_last.databinding.FragmentCustomerBinding;


public class CustomerFragment extends Fragment {

    FragmentCustomerBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentCustomerBinding.inflate(inflater,container,false);
        select();
        return binding.getRoot();
    }

    void select(){
        CommonConn conn = new CommonConn(getContext(), "select.cu");
        conn.onExcute((isResult, data) -> {
            Log.d("TAG", "select: " +data);
        });
    }
}