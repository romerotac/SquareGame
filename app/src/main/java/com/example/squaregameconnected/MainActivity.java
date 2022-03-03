package com.example.squaregameconnected;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
<<<<<<<<< Temporary merge branch 1
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    Button guide_btn;
    ImageView question_mark_btn;
=========
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    ImageView settingsButton;

>>>>>>>>> Temporary merge branch 2

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

<<<<<<<<< Temporary merge branch 1
        // button question mark go to guide activity
        question_mark_btn = (ImageView) findViewById(R.id.question_mark_button);
        question_mark_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGuideActivity();
            }
        });

        // guide button on main page go to guide activity
        guide_btn = (Button) findViewById(R.id.guide_button);
        guide_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGuideActivity();
            }
=========
        settingsButton = (ImageView) findViewById(R.id.setting_buttonhome);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSettingsActivity();
            }

>>>>>>>>> Temporary merge branch 2
        });
    }


    public void openSelectionPage() {
        Intent intent = new Intent(this, SelectionPage.class);
        startActivity(intent);
    }

<<<<<<<<< Temporary merge branch 1
    public void openGuideActivity() {
        Intent intent = new Intent(this, GuideActivity.class);
        startActivity(intent);
    }
=========
    public void openSettingsActivity() {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }




>>>>>>>>> Temporary merge branch 2
}
