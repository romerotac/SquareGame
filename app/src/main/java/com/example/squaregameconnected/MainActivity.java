package com.example.squaregameconnected;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    ImageView settingsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Connecting the button with id button_play to the activity SelectionPage on click
        button = (Button) findViewById(R.id.button_play);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSelectionPage();
            }
        });

        settingsButton = (ImageView) findViewById(R.id.setting_buttonhome);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSettingsActivity();
            }

        });
    }


    public void openSelectionPage() {
        Intent intent = new Intent(this, SelectionPage.class);
        startActivity(intent);
    }

    public void openSettingsActivity() {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }




}
