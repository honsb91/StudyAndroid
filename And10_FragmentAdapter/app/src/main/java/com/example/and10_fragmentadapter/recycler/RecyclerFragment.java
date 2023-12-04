package com.example.and10_fragmentadapter.recycler;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.and10_fragmentadapter.R;
import com.example.and10_fragmentadapter.listv.ListDTO;

import java.util.ArrayList;
import java.util.Random;

public class RecyclerFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_recycler, container, false);
        RecyclerView recv = v.findViewById(R.id.recv);

        ArrayList<ListDTO> list = new ArrayList<>();
        list.add(new ListDTO(R.drawable.img1, new Random().nextInt(30)+1, "고양이","남"));
        list.add(new ListDTO(R.drawable.img2, new Random().nextInt(30)+1, "너구리","여"));
        list.add(new ListDTO(R.drawable.img3, new Random().nextInt(30)+1, "코끼리","남"));
        list.add(new ListDTO(R.drawable.img4, new Random().nextInt(30)+1, "강아지","여"));
        list.add(new ListDTO(R.drawable.img5, new Random().nextInt(30)+1, "쿤다","남"));
        list.add(new ListDTO(R.drawable.img1, new Random().nextInt(30)+1, "고양이","남"));
        list.add(new ListDTO(R.drawable.img2, new Random().nextInt(30)+1, "너구리","여"));
        list.add(new ListDTO(R.drawable.img3, new Random().nextInt(30)+1, "코끼리","남"));
        list.add(new ListDTO(R.drawable.img4, new Random().nextInt(30)+1, "강아지","여"));
        list.add(new ListDTO(R.drawable.img5, new Random().nextInt(30)+1, "쿤다","남"));
        list.add(new ListDTO(R.drawable.img1, new Random().nextInt(30)+1, "고양이","남"));
        list.add(new ListDTO(R.drawable.img2, new Random().nextInt(30)+1, "너구리","여"));
        list.add(new ListDTO(R.drawable.img3, new Random().nextInt(30)+1, "코끼리","남"));
        list.add(new ListDTO(R.drawable.img4, new Random().nextInt(30)+1, "강아지","여"));
        list.add(new ListDTO(R.drawable.img5, new Random().nextInt(30)+1, "쿤다","남"));


        RecyclerAdapter adapter = new RecyclerAdapter(inflater ,list);
        // 방향성을 지정해주는 레이아웃 매니저
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);
        recv.setLayoutManager(manager);

        recv.setAdapter(adapter);
        return v;
    }
}