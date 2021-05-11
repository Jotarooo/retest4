package com.example.retest4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class Coloriage_mene extends AppCompatActivity {

    private Button play;
    private Button retour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coloriage_mene);

        this.play = (Button) findViewById(R.id.buttonkeemenekee);
        play.setOnClickListener(view -> {
            Intent autreact = new Intent (getApplicationContext(), Coloriage_mene_keekee.class);
            startActivity(autreact);
            finish();
        });
        final MediaPlayer buttoneaha = MediaPlayer.create(this, R.raw.keekee);
        ImageButton soundeaha = (ImageButton) this.findViewById(R.id.buttonmene);
        soundeaha.setOnClickListener(v -> buttoneaha.start());

        final MediaPlayer buttonone = MediaPlayer.create(this, R.raw.aoe);
        Button soundone = (Button) this.findViewById(R.id.buttonkeemeneroi);
        soundone.setOnClickListener(v -> buttonone.start());

        final MediaPlayer buttontwo = MediaPlayer.create(this, R.raw.aoe);
        Button soundtwo = (Button) this.findViewById(R.id.buttonkeemenetoka);
        soundtwo.setOnClickListener(v -> buttontwo.start());

        final MediaPlayer buttonthree = MediaPlayer.create(this, R.raw.aoe);
        Button soundthree = (Button) this.findViewById(R.id.buttonkeemeneereere);
        soundthree.setOnClickListener(v -> buttonthree.start());

        this.retour = (Button) findViewById(R.id.buttonbackmene);
        retour.setOnClickListener(view -> {
            Intent retourArriere = new Intent (getApplicationContext(), coloriageActivity.class);
            startActivity(retourArriere);
            finish();
        });
    }
}