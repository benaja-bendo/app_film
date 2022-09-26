package com.epsi.affichefilm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
private Button showListBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showListBtn = findViewById(R.id.goToList);

        showListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ListAfficheActivity.class);
                startActivity(intent);
            }
        });
    }

    public void autoActionXml_btn_actionValiderMaCommande(View view) {
        Toast.makeText(this.getApplicationContext(), "click sur le button", Toast.LENGTH_SHORT).show();
    }
}