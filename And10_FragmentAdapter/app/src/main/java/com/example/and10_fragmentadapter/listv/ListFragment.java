package com.example.and10_fragmentadapter.listv;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.and10_fragmentadapter.R;


public class ListFragment extends Fragment {

    ListView listv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        // Adapter 종류가 다양함 - ArrayAdpater ( 사용빈도낮음 ) , BaseAdapter ( 사용빈도낮음 )
        // ReccyclerAdapter " 중요 "!
        // Fragment는 독립적으로 화면에 존재 할 수 없음 -> 반드시 액티비티를 통해 액티비티의 제어
        // Context ( 액티비티는 그냥 사용 this ) -> Fragment는 액티비티에게 Context를 받아와야 함. -> getContext
        // Fragment -> getContext
        // 일반 클래스는 생성자나 메소드로 받아와야 함
        // 힌트에 @표시가 나오면 R로 시작?

        String[] arr = new String[10];
        for(int i =0; i< arr.length; i++){
            arr[i] = "글자" + i ;
        }
        ArrayAdapter adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1 , arr);

        listv = view.findViewById(R.id.listv); // 보여주는 역할만 함
        listv.setAdapter(adapter);


        return view;
    }
}