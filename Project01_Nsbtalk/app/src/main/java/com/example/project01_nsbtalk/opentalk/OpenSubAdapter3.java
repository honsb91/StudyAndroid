package com.example.project01_nsbtalk.opentalk;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_nsbtalk.databinding.ItemOpentalkChat2Binding;
import com.example.project01_nsbtalk.databinding.ItemOpentalkChatVerticalBinding;
import com.example.project01_nsbtalk.opentalk.OpenSubDTOs;

import java.util.ArrayList;

public class OpenSubAdapter3 extends RecyclerView.Adapter<OpenSubAdapter3.ViewHolder> {
    ArrayList<OpenSubDTOs.OpenSub3DTO> list ;

    public OpenSubAdapter3(ArrayList<OpenSubDTOs.OpenSub3DTO> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemOpentalkChatVerticalBinding binding = ItemOpentalkChatVerticalBinding.inflate(LayoutInflater.from(parent.getContext()) , parent , false );
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.imgvProfile.setImageResource(list.get(i).getBackgroundImgRes());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemOpentalkChatVerticalBinding binding;
        public ViewHolder(@NonNull ItemOpentalkChatVerticalBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}