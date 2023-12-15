package com.example.project02_last.customer;

import android.os.Bundle;

import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project02_last.R;
import com.example.project02_last.common.CommonConn;
import com.example.project02_last.databinding.FragmentCustomerBinding;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;


public class CustomerFragment extends Fragment {

    FragmentCustomerBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentCustomerBinding.inflate(inflater,container,false);
        select("");

        binding.searchBar.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                // 검색 버튼을 눌럿을 때 호출이 됨
                Log.d("검색", "onQueryTextSubmit: " + query);
                select(query);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                // 검색어가 변경될 때 호출됨 - 실시간 검색을 해야한다면 이용이 가능함 ( 서버가 빠르고 퍼포먼스가 좋은 경우 )
                Log.d("검색", "onQueryTextSubmit: " + newText);
                if (newText.isEmpty()){
                    select("");
                }

                return true;
            }
        });

        return binding.getRoot();
    }

    void select(String query){
        CommonConn conn = new CommonConn(getContext(), "select.cu");
        conn.addParamMap("query",query);
        conn.onExcute((isResult, data) -> {
            Log.d("TAG", "select: " +data);
        List<CustomerVO> list = new Gson().fromJson(data , new TypeToken<List<CustomerVO>>(){}.getType());
        CustomerAdapter adapter = new CustomerAdapter(list,getContext(),this);
        binding.recvCustomer.setAdapter(adapter);
        binding.recvCustomer.setLayoutManager(new LinearLayoutManager(getContext()));




        });
    }


}