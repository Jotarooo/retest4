package com.example.retest4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class NumberActivity extends AppCompatActivity {

    private Button retour;
    private Button quit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);







        this.quit = (Button) findViewById(R.id.quitter);
        quit.setOnClickListener(view -> {
            Intent revenirMenu = new Intent (getApplicationContext(), numeraActivity.class);
            startActivity(revenirMenu);
            finish();
        });


        this.retour = (Button) findViewById(R.id.button2);
        retour.setOnClickListener(view -> {
            Intent retourArriere = new Intent (getApplicationContext(), numeraActivity.class);
            startActivity(retourArriere);
            finish();
        });
    }
}