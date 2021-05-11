package com.example.retest4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import static com.example.retest4.R.raw.disappointed;

public class NumberActivity extends AppCompatActivity {

    public Button retour;
    public Button quitter;
    private Button hae ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        this.hae = findViewById(R.id.btnChiffreUn);
        hae.setOnClickListener(view -> {
            Intent autract = new Intent (getApplicationContext(), uaPotu.class);
            startActivity(autract);
            finish();
        });


        final MediaPlayer HaeSound = MediaPlayer.create(this, R.raw.carresound);  //jouer le son "tahi h'ae quand on clique sur l'image
        ImageView  sonHae = this.findViewById(R.id.Hae);
        sonHae.setOnClickListener(t -> HaeSound.start());

        final MediaPlayer faux1 = MediaPlayer.create(this, disappointed);
        Button  sonfaux1 = this.findViewById(R.id.faussereponse2);
        sonfaux1.setOnClickListener(v -> faux1.start());

        final MediaPlayer faux2 = MediaPlayer.create(this, disappointed);
        Button  sonfaux2 = this.findViewById(R.id.faussereponse1);
        sonfaux2.setOnClickListener(v -> faux2.start());


        final MediaPlayer faux3 = MediaPlayer.create(this, disappointed);
        Button  sonfaux3 = this.findViewById(R.id.faussereponse3);
        sonfaux3.setOnClickListener(v -> faux3.start());

        this.quitter = findViewById(R.id.quit); //La croix permet de quitter l'activite mais pas au menu
        quitter.setOnClickListener(view -> {
            Intent Quitte = new Intent (getApplicationContext(), numeraActivity.class);
            startActivity(Quitte);
            finish();
        });


        this.retour = findViewById(R.id.retour_n); //permet de revenir au menu
        retour.setOnClickListener(view -> {
            Intent retourArriere = new Intent (getApplicationContext(), MainActivity.class);
            startActivity(retourArriere);
            finish();
        });




    }
}