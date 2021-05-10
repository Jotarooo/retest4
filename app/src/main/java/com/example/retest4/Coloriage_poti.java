package com.example.retest4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class Coloriage_poti extends AppCompatActivity {

    private Button retour;
    private Button play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coloriage_poti);

        final MediaPlayer buttoneaha = MediaPlayer.create(this, R.raw.pukiki);
        ImageButton soundeaha = (ImageButton) this.findViewById(R.id.imageButton_poti);
        soundeaha.setOnClickListener(v -> buttoneaha.start());

        final MediaPlayer buttonred = MediaPlayer.create(this, R.raw.aoe);
        Button soundred = (Button) this.findViewById(R.id.button12);
        soundred.setOnClickListener(v -> buttonred.start());

        final MediaPlayer buttongren = MediaPlayer.create(this, R.raw.epukiki);
        Button soundee = (Button) this.findViewById(R.id.button18);
        soundee.setOnClickListener(v -> buttongren.start());

        final MediaPlayer buttonbrown = MediaPlayer.create(this, R.raw.aoe);
        Button soundao = (Button) this.findViewById(R.id.button25);
        soundao.setOnClickListener(v -> buttonbrown.start());

        final MediaPlayer buttonblack = MediaPlayer.create(this, R.raw.aoe);
        Button soundait = (Button) this.findViewById(R.id.button19);
        soundait.setOnClickListener(v -> buttonblack.start());

        this.play = (Button) findViewById(R.id.button18);
        play.setOnClickListener(view -> {
            Intent autreact = new Intent (getApplicationContext(), Coloriage_poti_puki.class);
            startActivity(autreact);
            finish();
        });


        this.retour = (Button) findViewById(R.id.buttonback2);
        retour.setOnClickListener(view -> {
            Intent retourArriere = new Intent (getApplicationContext(), coloriageActivity.class);
            startActivity(retourArriere);
            finish();
        });
    }
}