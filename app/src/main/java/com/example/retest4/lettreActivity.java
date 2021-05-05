package com.example.retest4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

public class lettreActivity extends AppCompatActivity {
    private Button retour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lettre);

        final MediaPlayer button1 = MediaPlayer.create(this, R.raw.a);
        Button sound1 = (Button) this.findViewById(R.id.button_a);
        sound1.setOnClickListener(v -> button1.start());

        final MediaPlayer button2 = MediaPlayer.create(this, R.raw.e);
        Button sound2 = (Button) this.findViewById(R.id.button_e);
        sound2.setOnClickListener(v -> button2.start());

        final MediaPlayer button3 = MediaPlayer.create(this, R.raw.f);
        Button sound3 = (Button) this.findViewById(R.id.button_f);
        sound3.setOnClickListener(v -> button3.start());

        final MediaPlayer button4 = MediaPlayer.create(this, R.raw.h);
        Button sound4 = (Button) this.findViewById(R.id.button_h);
        sound4.setOnClickListener(v -> button4.start());

        final MediaPlayer button5 = MediaPlayer.create(this, R.raw.i);
        Button sound5 = (Button) this.findViewById(R.id.button_i);
        sound5.setOnClickListener(v -> button5.start());

        final MediaPlayer button6 = MediaPlayer.create(this, R.raw.k);
        Button sound6 = (Button) this.findViewById(R.id.button_k);
        sound6.setOnClickListener(v -> button6.start());

        final MediaPlayer button7 = MediaPlayer.create(this, R.raw.e);
        Button sound7 = (Button) this.findViewById(R.id.button_m);
        sound7.setOnClickListener(v -> button2.start());

        final MediaPlayer button8 = MediaPlayer.create(this, R.raw.f);
        Button sound8 = (Button) this.findViewById(R.id.button_n);
        sound8.setOnClickListener(v -> button8.start());

        final MediaPlayer button9 = MediaPlayer.create(this, R.raw.h);
        Button sound9 = (Button) this.findViewById(R.id.button_o);
        sound9.setOnClickListener(v -> button9.start());

        final MediaPlayer button10 = MediaPlayer.create(this, R.raw.i);
        Button sound10 = (Button) this.findViewById(R.id.button_p);
        sound10.setOnClickListener(v -> button10.start());

        final MediaPlayer button11 = MediaPlayer.create(this, R.raw.e);
        Button sound11 = (Button) this.findViewById(R.id.button_r);
        sound11.setOnClickListener(v -> button11.start());

        final MediaPlayer button12 = MediaPlayer.create(this, R.raw.f);
        Button sound12 = (Button) this.findViewById(R.id.button_t);
        sound12.setOnClickListener(v -> button12.start());

        final MediaPlayer button13 = MediaPlayer.create(this, R.raw.h);
        Button sound13 = (Button) this.findViewById(R.id.button_u);
        sound13.setOnClickListener(v -> button13.start());

        final MediaPlayer button14 = MediaPlayer.create(this, R.raw.i);
        Button sound14 = (Button) this.findViewById(R.id.button_v);
        sound14.setOnClickListener(v -> button14.start());

        this.retour = (Button) findViewById(R.id.buttonback);
        retour.setOnClickListener(view -> {
            Intent retourArriere = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(retourArriere);

        });
    }

}