package com.example.retest4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Page_de_demarrage extends AppCompatActivity {

    private boolean splashLoaded;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       
        if (!splashLoaded) {
            setContentView(R.layout.activity_page_de_demarrage);
            int secondsDelayed = 1;
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    startActivity(new Intent(Page_de_demarrage.this, MainActivity.class));
                    finish();
                }
            }, secondsDelayed * 1500);

            splashLoaded = true;
        }
        else {
            Intent goToMainActivity = new Intent(Page_de_demarrage.this, MainActivity.class);
            goToMainActivity.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            startActivity(goToMainActivity);
            finish();
        }
    }
}