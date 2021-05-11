package com.example.retest4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class Coloriage_poti_toka extends AppCompatActivity {

    private Button retour;
    private Button play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coloriage_poti_toka);

        final MediaPlayer buttoneka = MediaPlayer.create(this, R.raw.ereere);
        ImageButton soundha = (ImageButton) this.findViewById(R.id.imagebuttonpotitoka);
        soundha.setOnClickListener(v -> buttoneka.start());

        final MediaPlayer buttoned = MediaPlayer.create(this, R.raw.aoe);
        Button sounded = (Button) this.findViewById(R.id.buttonpotitokatavaie);
        sounded.setOnClickListener(v -> buttoned.start());

        final MediaPlayer buttonpuko = MediaPlayer.create(this, R.raw.aoe);
        Button soundurao = (Button) this.findViewById(R.id.buttonpotitokapuatou);
        soundurao.setOnClickListener(v -> buttonpuko.start());

        final MediaPlayer buttontof = MediaPlayer.create(this, R.raw.aoe);
        Button soundninaf = (Button) this.findViewById(R.id.buttonpotitokakopumeika);
        soundninaf.setOnClickListener(v -> buttontof.start());

        this.retour = (Button) findViewById(R.id.buttonbackpotitoka);
        retour.setOnClickListener(view -> {
            Intent retourArriere = new Intent (getApplicationContext(), coloriageActivity.class);
            startActivity(retourArriere);
            finish();
        });

        this.play = (Button) findViewById(R.id.buttonpotitokaereere);
        play.setOnClickListener(view -> {
            Intent autreact = new Intent (getApplicationContext(), Coloriage_poti_pukiki_tokatoka_ereere.class);
            startActivity(autreact);
            finish();
        });
    }
}