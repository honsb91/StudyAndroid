package com.example.airbnbapplication.tag;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.airbnbapplication.R;
import com.example.airbnbapplication.databinding.FragmentTagBinding;

import java.util.ArrayList;

public class TagFragment extends Fragment {

    FragmentTagBinding binding;
    RecyclerView recv;
    ArrayList<TagDTO> list ;
    TagAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentTagBinding.inflate(inflater,container,false);

        firstInit();

        for(int i=0; i<5; i++){
            addItem(R.drawable.camping,"tak" + i );
        }

        adapter = new TagAdapter(list);
        recv.setAdapter(adapter);
        recv.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL, false));



        return binding.getRoot();
    }
   /* public void firstInit(){
        recv = (RecyclerView) findViewById(R.id.tag_listview);
        list = new ArrayList<>();
    }*/

    public void addItem(int tagImg, String tagName){
        TagDTO dto = new TagDTO();

        dto.setTagImg(tagImg);
        dto.setTagName(tagName);

        list.add(dto);
    }


}