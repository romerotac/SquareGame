package com.example.squaregameconnected;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class GamePlay extends AppCompatActivity {

    ImageView question_mark_btn;
    ImageView settingsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_play);


        // button question mark go to guide activity
        question_mark_btn = (ImageView) findViewById(R.id.question_mark_button);
        question_mark_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGuideActivity();
            }
        });

        // settings button on main page go to settings activity
        settingsButton = (ImageView) findViewById(R.id.setting_buttonhome);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSettingsActivity();
            }
        });
    }

    public void openGuideActivity() {
        Intent intent = new Intent(this, GuideActivity.class);
        startActivity(intent);
    }

    public void openSettingsActivity() {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
}
