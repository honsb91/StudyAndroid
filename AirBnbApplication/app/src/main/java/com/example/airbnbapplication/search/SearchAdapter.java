package com.example.airbnbapplication.search;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class SearchAdapter extends FragmentStateAdapter {

    ArrayList<Fragment> list;

    public SearchAdapter(@NonNull Fragment fragment , ArrayList<Fragment> list) {
        super(fragment);
        this.list = list;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return list.get(position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
