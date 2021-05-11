package com.example.retest4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button play;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.play = findViewById(R.id.button);
        play.setOnClickListener(view -> {
            Intent autreact = new Intent (getApplicationContext(), Chiffre.class);
            startActivity(autreact);
            finish();
        });

        this.play = findViewById(R.id.button6);
        play.setOnClickListener(this::numerasound);

        this.play = findViewById(R.id.button5);
        play.setOnClickListener(view -> {
            Intent autreact = new Intent (getApplicationContext(), CouleurActivity.class);
            startActivity(autreact);
            finish();
        });

        this.play = findViewById(R.id.button7);
        play.setOnClickListener(view -> {
            Intent autreact = new Intent (getApplicationContext(), formeActivity.class);
            startActivity(autreact);
            finish();
        });

        this.play = findViewById(R.id.button3);
        play.setOnClickListener(view -> {
            Intent autreact = new Intent (getApplicationContext(), lettreActivity.class);
            startActivity(autreact);
            finish();
        });

        this.play = findViewById(R.id.button4);
        play.setOnClickListener(view -> {
            Intent autreact = new Intent (getApplicationContext(), coloriageActivity.class);
            startActivity(autreact);
            finish();
        });
    }


    private void numerasound(View view) {
        Intent autreact = new Intent(getApplicationContext(), numeraActivity.class);
        final MediaPlayer tetaunumerasound = MediaPlayer.create(this, R.raw.e);
        tetaunumerasound.start();
        startActivity(autreact);
        finish();
    }
}