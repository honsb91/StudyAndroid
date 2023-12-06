package com.example.project01_nsbtalk.friend;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_nsbtalk.databinding.ItemFriendRecvBinding;

import java.util.ArrayList;

public class FriendRecvAdapter extends RecyclerView.Adapter<FriendRecvAdapter.ViewHolder> {

    LayoutInflater inflater;
    ArrayList<FriendDTO> list;

    public FriendRecvAdapter(LayoutInflater inflater, ArrayList<FriendDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemFriendRecvBinding binding = ItemFriendRecvBinding.inflate(inflater, parent ,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.imgvProfile.setImageResource( list.get(i).getProfileImg());
        h.binding.tvName.setText( list.get(i).getName());
        h.binding.tvMsg.setText( list.get(i).getMsg());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    // 위젯들을 묶어놓기 위한 뷰홀더

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemFriendRecvBinding binding; // 모든 위젯 종류를 사용할 거

        public ViewHolder(@NonNull ItemFriendRecvBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
