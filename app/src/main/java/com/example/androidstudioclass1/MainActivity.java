package com.example.androidstudioclass1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidstudioclass1.adapt.CardviewAdapter;
import com.example.androidstudioclass1.adapt.CardviewData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
  RecyclerView recycleView;
  RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycleView=findViewById(R.id.recycleView);
        card();
    }
    public void card() {
        recycleView.setHasFixedSize(true);
        recycleView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        ArrayList<CardviewData> card=new ArrayList<CardviewData>();
        card.add(new CardviewData("Card 01"));
        card.add(new CardviewData("Card 02"));
        card.add(new CardviewData("Card 03"));
        card.add(new CardviewData("Card 04"));
        card.add(new CardviewData("Card 05"));
        card.add(new CardviewData("Card 06"));
        card.add(new CardviewData("Card 07"));
        card.add(new CardviewData("Card 08"));

        adapter=new CardviewAdapter(card);
        recycleView.setAdapter(adapter);
    }
}