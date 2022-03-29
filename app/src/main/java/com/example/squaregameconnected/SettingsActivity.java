package com.example.squaregameconnected;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_settings);
    }
    public void PlayBackgroundSound(View view) {
        Intent intent = new Intent(SettingsActivity.this, BackgroundSoundService.class);
        startService(intent);
    }
}


