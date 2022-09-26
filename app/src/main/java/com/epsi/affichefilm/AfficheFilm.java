package com.epsi.affichefilm;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AfficheFilm extends AppCompatActivity {

    ImageView imageAffiche;
    Button btnAffiche;
    TextView txtAffiche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affiche_film);
        imageAffiche = findViewById(R.id.imageAffiche);
        btnAffiche = findViewById(R.id.buttonAnonce);
        txtAffiche = findViewById(R.id.textAffiche);

        Film film = getIntent().getParcelableExtra(("film").toLowerCase());
        imageAffiche.setImageDrawable(getResources().getDrawable(film.getPicture()));
        txtAffiche.setText(film.getDescription());
        btnAffiche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AfficheFilm.this, "Bon visionnage", Toast.LENGTH_SHORT).show();
            }
        });
    }
}