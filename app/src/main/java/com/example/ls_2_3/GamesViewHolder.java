package com.example.ls_2_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GamesViewHolder extends RecyclerView.ViewHolder {
    private TextView games;

    public GamesViewHolder(@NonNull View itemView) {
        super(itemView);

        games = itemView.findViewById(R.id.text_View);

    }

    void bind(String gam) {
        games.setText(gam);
    }
}