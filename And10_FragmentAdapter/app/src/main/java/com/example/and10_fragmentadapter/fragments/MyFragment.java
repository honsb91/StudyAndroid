package com.example.and10_fragmentadapter.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.and10_fragmentadapter.R;


public class MyFragment extends Fragment {

    // Fragement를 만들고 나서는 onCreateView 부분을 제외하고 다 지워도 상관없음
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v =  inflater.inflate(R.layout.fragment_my, container, false);
        Button btn_frag1 =  v.findViewById(R.id.btn_myfrag);

        btn_frag1.setOnClickListener(v1->{
            btn_frag1.setText("버튼 클릭이 되었습니다.");
        });

        return v;
    }
}