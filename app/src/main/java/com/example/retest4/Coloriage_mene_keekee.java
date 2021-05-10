package com.example.retest4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

public class Coloriage_mene_keekee extends AppCompatActivity {

    private Button retour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coloriage_mene_keekee);

        this.retour = (Button) findViewById(R.id.buttonbackmenekee);
        retour.setOnClickListener(view -> {
            Intent retourArriere = new Intent (getApplicationContext(), coloriageActivity.class);
            startActivity(retourArriere);
            finish();
        });

        final MediaPlayer buttonone = MediaPlayer.create(this, R.raw.aoe);
        Button soundone = (Button) this.findViewById(R.id.buttonmenekeeroi);
        soundone.setOnClickListener(v -> buttonone.start());

        final MediaPlayer buttontwo = MediaPlayer.create(this, R.raw.aoe);
        Button soundtwo = (Button) this.findViewById(R.id.buttonmenekeepuki);
        soundtwo.setOnClickListener(v -> buttontwo.start());

        final MediaPlayer buttonthree = MediaPlayer.create(this, R.raw.aoe);
        Button soundthree = (Button) this.findViewById(R.id.buttonmenekeeehu);
        soundthree.setOnClickListener(v -> buttonthree.start());
    }
}