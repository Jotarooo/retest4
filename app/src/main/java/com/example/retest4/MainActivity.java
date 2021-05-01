package com.example.retest4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button play;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.play = (Button) findViewById(R.id.button);
        play.setOnClickListener(view -> {
            Intent autreact = new Intent (getApplicationContext(), Chiffre.class);
            startActivity(autreact);
            finish();
        });

        this.play = (Button) findViewById(R.id.button5);
        play.setOnClickListener(view -> {
            Intent autreact = new Intent (getApplicationContext(), CouleurActivity.class);
            startActivity(autreact);
            finish();
        });

        this.play = (Button) findViewById(R.id.button6);
        play.setOnClickListener(view -> {
            Intent autreact = new Intent (getApplicationContext(), numeraActivity.class);
            startActivity(autreact);
            finish();
        });

        this.play = (Button) findViewById(R.id.button7);
        play.setOnClickListener(view -> {
            Intent autreact = new Intent (getApplicationContext(), formeActivity.class);
            startActivity(autreact);
            finish();
        });
    }
}