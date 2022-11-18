package com.example.ls_2_3;


import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GamesAdapter extends RecyclerView.Adapter<com.example.ls_2_3.GamesViewHolder> {

    public GamesAdapter(ArrayList<String> carList) {
        this.gaemsrListList = carList;
    }

    private ArrayList<String> gaemsrListList;
    @NonNull
    @Override
    public com.example.ls_2_3.GamesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new com.example.ls_2_3.GamesViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_games,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull com.example.ls_2_3.GamesViewHolder holder, int position) {
        holder.bind(gaemsrListList.get(position));
    }


    @Override
    public int getItemCount() {
        return gaemsrListList.size();
    }
}

