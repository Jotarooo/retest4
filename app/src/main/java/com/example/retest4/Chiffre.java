package com.example.retest4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Chiffre extends AppCompatActivity {
    private Button retour;
    MediaPlayer mp;
    Button one;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiffre);

        this.retour = (Button) findViewById(R.id.buttonback);
        retour.setOnClickListener(view -> {
            Intent retourArriere = new Intent (getApplicationContext(), MainActivity.class);
            startActivity(retourArriere);
            finish();
        });
        mp = MediaPlayer.create(this, R.raw.tahi);
        one = (Button) this.findViewById(R.id.button1);

        one.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                mp.start();
            }
        });
    }

}