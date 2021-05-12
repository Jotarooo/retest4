package com.example.retest4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class tou_meika extends AppCompatActivity {

    public Button retour_N;
    public Button quitter_n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tou_meika);










        this.quitter_n = findViewById(R.id.quit_p); //La croix permet de quitter l'activite mais pas au menu
        quitter_n.setOnClickListener(view -> {
            Intent Quitte = new Intent(getApplicationContext(), numeraActivity.class);
            startActivity(Quitte);
            finish();
        });

        this.retour_N = findViewById(R.id.retour_p); //permet de revenir au menu
        retour_N.setOnClickListener(view -> {
            Intent retourArriere = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(retourArriere);
            finish();
        });
    }
}