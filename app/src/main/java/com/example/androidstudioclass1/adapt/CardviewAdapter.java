package com.example.androidstudioclass1.adapt;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidstudioclass1.R;

import java.util.ArrayList;

public class CardviewAdapter extends RecyclerView.Adapter<CardviewAdapter.DesignViewHolder> {
    ArrayList<CardviewData> CardviewDatas;


    //this will hold the Data
    public CardviewAdapter(ArrayList<CardviewData> CardviewDatas) {
        this.CardviewDatas = CardviewDatas;
    }

    @NonNull
    @Override
    public DesignViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view,parent,false);
        DesignViewHolder DesignViewHolder=new DesignViewHolder(view);

        return DesignViewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull DesignViewHolder holder, int position) {
        //main function to bind the design
        //pass down the position
        CardviewData CardviewData= CardviewDatas.get(position);
        //set the image
        holder.tv_name.setText(CardviewData.getName());

    }

    @Override
    public int getItemCount() {
        return CardviewDatas.size();
    }

    //this will hold the View Design
    public static class DesignViewHolder extends RecyclerView.ViewHolder{
        TextView tv_name;

        public DesignViewHolder(@NonNull View itemView) {
            super(itemView);
             tv_name=itemView.findViewById(R.id.txt_name);


        }
    }


}