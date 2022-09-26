package com.epsi.affichefilm;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    protected Button detailBtn;
    protected ImageView imgFilm;
    protected TextView titleFilm;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        detailBtn = itemView.findViewById(R.id.filmBtn);
        imgFilm = itemView.findViewById(R.id.imgFilm);
        titleFilm = itemView.findViewById(R.id.titleFilm);
    }
}
