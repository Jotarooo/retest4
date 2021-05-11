package com.example.retest4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class uaPotu extends AppCompatActivity {

    public Button retour_N;
    public Button quitter_n;
    private Button potubutt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ua_potu);

        this.potubutt = findViewById(R.id.btnjuste);
        potubutt.setOnClickListener(view -> {
            Intent autract = new Intent(getApplicationContext(), tou_meika.class);
            final MediaPlayer papakisound = MediaPlayer.create(this, R.raw.e);
            papakisound.start();
            startActivity(autract);
            finish();
        });


        final MediaPlayer HaeSound = MediaPlayer.create(this, R.raw.carresound);  //jouer le son "tahi h'ae quand on clique sur l'image
        ImageView sonHae = this.findViewById(R.id.potuimage);
        sonHae.setOnClickListener(t -> HaeSound.start());

        final MediaPlayer faux4 = MediaPlayer.create(this, R.raw.aoe);
        Button sonfaux4 = this.findViewById(R.id.faussereponse4);
        sonfaux4.setOnClickListener(v -> faux4.start());

        final MediaPlayer faux = MediaPlayer.create(this, R.raw.aoe);
        Button sonfaux = this.findViewById(R.id.faussereponse6);
        sonfaux.setOnClickListener(v -> faux.start());


        final MediaPlayer faux5 = MediaPlayer.create(this, R.raw.aoe);
        Button sonfaux5 = this.findViewById(R.id.faussereponse5);
        sonfaux5.setOnClickListener(v -> faux5.start());


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