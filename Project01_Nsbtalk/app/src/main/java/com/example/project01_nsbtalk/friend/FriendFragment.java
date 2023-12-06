package com.example.project01_nsbtalk.friend;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project01_nsbtalk.R;
import com.example.project01_nsbtalk.databinding.FragmentFriendBinding;

import java.util.ArrayList;

public class FriendFragment extends Fragment {

    FragmentFriendBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentFriendBinding.inflate(inflater, container, false);

        binding.recvFriend.setAdapter(new FriendRecvAdapter(inflater, getFriendList()));
        binding.recvFriend.setLayoutManager(new LinearLayoutManager(getContext()));


        return binding.getRoot();
    }

    ArrayList<FriendDTO> getFriendList() {
        ArrayList<FriendDTO> list = new ArrayList<>();
        list.add(new FriendDTO(R.drawable.friend_profile_img1, R.drawable.friend_back_img1, "배배", "이이😘"));
        list.add(new FriendDTO(R.drawable.friend_profile_img2, R.drawable.friend_back_img2, "제제", "집"));
        list.add(new FriendDTO(R.drawable.friend_profile_img3, R.drawable.friend_back_img3, "키키", "👏"));
        list.add(new FriendDTO(R.drawable.friend_profile_img4, R.drawable.friend_back_img4, "철수", "긴딘"));
        list.add(new FriendDTO(R.drawable.friend_profile_img5, R.drawable.friend_back_img5, "짱구", "미키"));
        list.add(new FriendDTO(R.drawable.friend_profile_img6, R.drawable.friend_back_img6, "훈이", ""));
        list.add(new FriendDTO(R.drawable.friend_profile_img7, R.drawable.friend_back_img7, "맹구", "퀴🤦‍♀️뉘"));
        list.add(new FriendDTO(R.drawable.friend_profile_img8, R.drawable.friend_back_img8, "덜덜", "뫄뫄"));
        list.add(new FriendDTO(R.drawable.friend_profile_img9, R.drawable.friend_back_img9, "뚱이", ""));
        list.add(new FriendDTO(R.drawable.friend_profile_img10, R.drawable.friend_back_img10, "사운", "크티"));

        return list;
    }
}