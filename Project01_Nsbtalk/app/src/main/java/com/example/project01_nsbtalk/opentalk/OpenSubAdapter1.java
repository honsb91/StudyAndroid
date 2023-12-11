package com.example.project01_nsbtalk.opentalk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_nsbtalk.databinding.ItemOpentalkChatBinding;
import com.example.project01_nsbtalk.opentalk.OpenSubDTOs;

import java.util.ArrayList;

public class OpenSubAdapter1 extends RecyclerView.Adapter<OpenSubAdapter1.ViewHolder> {
    ArrayList<OpenSubDTOs.OpenSub1DTO> list ;

    public OpenSubAdapter1(ArrayList<OpenSubDTOs.OpenSub1DTO> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemOpentalkChatBinding binding = ItemOpentalkChatBinding.inflate(LayoutInflater.from(parent.getContext()) , parent , false );
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.imgvChat.setImageResource(list.get(i).getImgTitle());
        h.binding.tvChatcnt.setText(list.get(i).getChatCnt()+"");
        h.binding.tvMsg.setText(list.get(i).getRecentChat());
        h.binding.tvDate.setText(list.get(i).getChatDate());
        h.binding.tvTitle.setText(list.get(i).getRoomTitle());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemOpentalkChatBinding binding;
        public ViewHolder(@NonNull ItemOpentalkChatBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}