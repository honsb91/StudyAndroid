package com.example.airbnbapplication.search;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.airbnbapplication.R;
import com.example.airbnbapplication.databinding.FragmentSearchBinding;

public class SearchFragment extends Fragment {

    FragmentSearchBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentSearchBinding.inflate(inflater,container, false);

        return binding.getRoot();
    }
}