package com.example.retest4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

public class formeActivity extends AppCompatActivity {

    private Button retour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forme);

        final MediaPlayer carreSound = MediaPlayer.create(this, R.raw.disappointed);
        Button  sonCarre = this.findViewById(R.id.Carre);
        sonCarre.setOnClickListener(v -> carreSound.start());

        final MediaPlayer rectangleSound = MediaPlayer.create(this, R.raw.carresound);
        Button  sonRectangle = this.findViewById(R.id.rectangle);
        sonRectangle.setOnClickListener(v -> rectangleSound.start());

        final MediaPlayer circleSound = MediaPlayer.create(this, R.raw.disappointed);
        Button  sonCercle = this.findViewById(R.id.cercle);
        sonCercle.setOnClickListener(v -> circleSound.start());

        final MediaPlayer triangleSound = MediaPlayer.create(this, R.raw.disappointed);
        Button  sontrianglele = this.findViewById(R.id.triangle);
        sontrianglele.setOnClickListener(v -> triangleSound.start());


        this.retour = findViewById(R.id.button2);
        retour.setOnClickListener(view -> {
            Intent retourArriere = new Intent (getApplicationContext(), MainActivity.class);
            startActivity(retourArriere);
            finish();



        });
    }
}