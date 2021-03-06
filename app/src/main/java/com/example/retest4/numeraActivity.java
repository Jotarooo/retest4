package com.example.retest4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class numeraActivity extends AppCompatActivity {

    private Button retour;
    private Button start ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numera);

        this.start = (Button) findViewById(R.id.startgame);
        start.setOnClickListener(view -> {
            Intent intent = new Intent (numeraActivity.this, NumberActivity.class);
            startActivity(intent);
            finish();
        });


        this.retour = (Button) findViewById(R.id.button2);
        retour.setOnClickListener(view -> {
            Intent retourArriere = new Intent (getApplicationContext(), MainActivity.class);
            startActivity(retourArriere);
            finish();
        });
    }
}