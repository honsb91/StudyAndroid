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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentTagBinding.inflate(inflater,container,false);


        return binding.getRoot();
    }


}