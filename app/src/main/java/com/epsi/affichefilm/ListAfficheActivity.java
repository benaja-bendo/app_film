package com.epsi.affichefilm;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListAfficheActivity extends AppCompatActivity {
    private ArrayList<Film> films = new ArrayList<>();
    private RecyclerView recyclerView;
    private ListAdapter adapter;
    private LinearLayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_affiche);

        films.add(new Film(R.drawable._161934,"ONE PIECE RED",getResources().getString(R.string.one_piece_red)));
        films.add(new Film(R.drawable.startwars,"Star Wars Poster Episode 8",getResources().getString(R.string.starwars)));
        films.add(new Film(R.drawable.spiderman,"SPIDER-MAN: NO WAY HOME",getResources().getString(R.string.spiderman)));

        recyclerView = findViewById(R.id.recycleView);
        layoutManager = new LinearLayoutManager(ListAfficheActivity.this);

        adapter = new ListAdapter(films, ListAfficheActivity.this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}