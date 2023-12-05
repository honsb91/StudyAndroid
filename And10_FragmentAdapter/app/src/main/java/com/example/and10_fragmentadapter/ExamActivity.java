package com.example.and10_fragmentadapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.and10_fragmentadapter.exam.ExamAdapter;

public class ExamActivity extends AppCompatActivity {

    RecyclerView recv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);
        recv = findViewById(R.id.recv);

        ExamAdapter adapter = new ExamAdapter(getLayoutInflater());
        recv.setAdapter(adapter);
        recv.setLayoutManager(new LinearLayoutManager(this));
    }
}