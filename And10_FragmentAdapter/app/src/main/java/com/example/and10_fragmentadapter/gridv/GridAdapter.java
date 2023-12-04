package com.example.and10_fragmentadapter.gridv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.and10_fragmentadapter.R;
import com.example.and10_fragmentadapter.listv.ListDTO;

import java.util.ArrayList;

public class GridAdapter extends BaseAdapter {
    // Base 어댑터 종류는 LayoutInflater를 자체적으로 받아오거나 생성이 불가능함.
    // Context에 접근이 가능한 프래그먼트 , 액티비티 등에서 받아와야함.
    LayoutInflater inflater ; // 이걸 받아와야지 getview 에서 활용이 가능?
                              // 칸에 레이아웃을 붙이는 처리를 담당
    ArrayList<ListDTO> list;  // 내용이 바뀌는 처리를 담당

    //생성자 생성
    public GridAdapter(LayoutInflater inflater, ArrayList<ListDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    @Override
    public int getCount() { // 몇 개의 아이템이 있는지
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View v, ViewGroup parent) {
        v = inflater.inflate(R.layout.item_listv , parent , false);
        ImageView imgv_profile = v.findViewById(R.id.imgv_profile);
        imgv_profile.setImageResource(list.get(i).getImgRes());




        return v;
    }
}
