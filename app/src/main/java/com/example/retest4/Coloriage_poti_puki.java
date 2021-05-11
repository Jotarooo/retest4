package com.example.retest4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class Coloriage_poti_puki extends AppCompatActivity {

    private Button retour;
    private Button play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coloriage_poti_puki);

        final MediaPlayer buttonteka = MediaPlayer.create(this, R.raw.tokatoka);
        ImageButton soundaha = (ImageButton) this.findViewById(R.id.imageButton_poti3);
        soundaha.setOnClickListener(v -> buttonteka.start());

        final MediaPlayer buttonred = MediaPlayer.create(this, R.raw.aoe);
        Button soundred = (Button) this.findViewById(R.id.button37);
        soundred.setOnClickListener(v -> buttonred.start());

        final MediaPlayer buttonpuk = MediaPlayer.create(this, R.raw.aoe);
        Button soundura = (Button) this.findViewById(R.id.button35);
        soundura.setOnClickListener(v -> buttonpuk.start());

        final MediaPlayer buttontok = MediaPlayer.create(this, R.raw.aoe);
        Button soundnina = (Button) this.findViewById(R.id.button38);
        soundnina.setOnClickListener(v -> buttontok.start());

        this.retour = (Button) findViewById(R.id.buttonback4);
        retour.setOnClickListener(view -> {
            Intent retourArriere = new Intent (getApplicationContext(), coloriageActivity.class);
            startActivity(retourArriere);
            finish();
        });

        this.play = (Button) findViewById(R.id.button36);
        play.setOnClickListener(view -> {
            Intent autreact = new Intent (getApplicationContext(), Coloriage_poti_toka.class);
            startActivity(autreact);
            finish();
        });
    }
}