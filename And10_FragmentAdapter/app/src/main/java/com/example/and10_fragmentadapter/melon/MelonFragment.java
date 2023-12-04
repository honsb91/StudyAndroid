package com.example.and10_fragmentadapter.melon;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.and10_fragmentadapter.R;
import com.example.and10_fragmentadapter.recycler.RecyclerAdapter;

import java.util.ArrayList;

public class MelonFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_melon, container, false);
        RecyclerView recv = v.findViewById(R.id.recv);

        ArrayList<SongDTO> list = new ArrayList<>();
        list.add(new SongDTO(R.drawable.chart_img1),1,"Perfect Night","르세라핌");


        RecyclerAdapter adapter = new RecyclerAdapter(inflater ,list);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);
        recv.setLayoutManager(manager);

        recv.setAdapter(adapter);



        return v;
    }
}