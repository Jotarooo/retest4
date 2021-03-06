package com.example.retest4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Chiffre extends AppCompatActivity {

    private Button retour;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiffre);

        final MediaPlayer button1 = MediaPlayer.create(this, R.raw.tahi);
        Button sound1 = (Button) this.findViewById(R.id.button1);
        sound1.setOnClickListener(v -> button1.start());

        final MediaPlayer button2 = MediaPlayer.create(this, R.raw.eua);
        Button sound2 = (Button) this.findViewById(R.id.button2);
        sound2.setOnClickListener(v -> button2.start());

        final MediaPlayer button3 = MediaPlayer.create(this, R.raw.etou);
        Button sound3 = (Button) this.findViewById(R.id.button3);
        sound3.setOnClickListener(v -> button3.start());

        final MediaPlayer button4 = MediaPlayer.create(this, R.raw.eha);
        Button sound4 = (Button) this.findViewById(R.id.button4);
        sound4.setOnClickListener(v -> button4.start());

        final MediaPlayer button5 = MediaPlayer.create(this, R.raw.eima);
        Button sound5 = (Button) this.findViewById(R.id.button5);
        sound5.setOnClickListener(v -> button5.start());

        final MediaPlayer button6 = MediaPlayer.create(this, R.raw.tahi);
        Button sound6 = (Button) this.findViewById(R.id.button6);
        sound6.setOnClickListener(v -> button6.start());

        final MediaPlayer button7 = MediaPlayer.create(this, R.raw.eua);
        Button sound7 = (Button) this.findViewById(R.id.button7);
        sound7.setOnClickListener(v -> button7.start());

        final MediaPlayer button8 = MediaPlayer.create(this, R.raw.etou);
        Button sound8 = (Button) this.findViewById(R.id.button8);
        sound8.setOnClickListener(v -> button8.start());

        final MediaPlayer button9 = MediaPlayer.create(this, R.raw.eha);
        Button sound9 = (Button) this.findViewById(R.id.button9);
        sound9.setOnClickListener(v -> button9.start());

        final MediaPlayer button10 = MediaPlayer.create(this, R.raw.eima);
        Button sound10 = (Button) this.findViewById(R.id.button10);
        sound10.setOnClickListener(v -> button10.start());

        final MediaPlayer button0 = MediaPlayer.create(this, R.raw.eima);
        Button sound0 = (Button) this.findViewById(R.id.button0);
        sound0.setOnClickListener(v -> button0.start());


        this.retour = (Button) findViewById(R.id.buttonback);
        retour.setOnClickListener(view -> {
            Intent retourArriere = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(retourArriere);

        });
    }
}