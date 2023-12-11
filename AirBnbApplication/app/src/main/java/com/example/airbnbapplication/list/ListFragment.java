package com.example.airbnbapplication.list;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.airbnbapplication.R;
import com.example.airbnbapplication.databinding.FragmentListBinding;

public class ListFragment extends Fragment {

    FragmentListBinding binding;

       @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

           binding = FragmentListBinding.inflate(inflater, container , false);
        return binding.getRoot();


    }
}