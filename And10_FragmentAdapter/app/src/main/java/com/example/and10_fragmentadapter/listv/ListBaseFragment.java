package com.example.and10_fragmentadapter.listv;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.and10_fragmentadapter.R;


public class ListBaseFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       View v = inflater.inflate(R.layout.fragment_list_base, container, false);
       ListView listv = v.findViewById(R.id.listv);
       ListBaseAdapter adapter = new ListBaseAdapter(inflater);
       listv.setAdapter(adapter);


        return v;
    }
}