package com.example.airbnbapplication.tag;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.airbnbapplication.R;

import java.util.ArrayList;

public class TagAdapter extends RecyclerView.Adapter<TagAdapter.ViewHolder> {


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.tag_item , parent , false);
        TagAdapter.ViewHolder vh = new TagAdapter.ViewHolder(view);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull TagAdapter.ViewHolder holder, int position) {
        TagDTO dto = list.get(position);

        holder.tag_list.setImageResource(R.drawable.camping);
        holder.tag_tv.setText(dto.getTagName());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView tag_list;
        TextView tag_tv;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tag_list = (ImageView) itemView.findViewById(R.id.tag_list);
            tag_tv = (TextView) itemView.findViewById(R.id.tag_tv);
        }
    }

    private ArrayList<TagDTO> list = null;

    public TagAdapter(ArrayList<TagDTO> list) {
        this.list = list;
    }
}
