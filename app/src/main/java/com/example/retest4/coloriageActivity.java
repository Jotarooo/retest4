package com.example.retest4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class coloriageActivity extends AppCompatActivity {

    private Button retour;
    private Button play;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coloriage);

        this.retour = (Button) findViewById(R.id.buttonback);
        retour.setOnClickListener(view -> {
            Intent retourArriere = new Intent (getApplicationContext(), MainActivity.class);
            startActivity(retourArriere);
            finish();
        });

        this.play = (Button) findViewById(R.id.button5);
        play.setOnClickListener(view -> {
            Intent autreact = new Intent (getApplicationContext(), CouleurActivity.class);
            startActivity(autreact);
            finish();
        });
    }
}