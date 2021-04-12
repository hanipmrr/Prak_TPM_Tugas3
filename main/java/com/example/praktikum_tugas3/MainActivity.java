package com.example.praktikum_tugas3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.praktikum_tugas3.R;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private ArrayList<GenshinModel> listAgent = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Genshin Impact");

        rv = findViewById(R.id.rvGenshin);
        rv.setHasFixedSize(true);
        listAgent.addAll(GenshinData.getListData());
        showRecyclerCardView();
    }

    private void showRecyclerCardView() {
        rv.setLayoutManager(new LinearLayoutManager(this));
        GenshinAdapter agentAdapter = new GenshinAdapter(listAgent,this);
        rv.setAdapter(agentAdapter);

    }
}