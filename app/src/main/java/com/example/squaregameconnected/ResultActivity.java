package com.example.squaregameconnected;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class ResultActivity extends AppCompatActivity {
    Button btn_replay;
    Button btn_go_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_result);

        //connecting the button with id button_replay to open the GamePlay activity
        btn_replay = (Button)findViewById(R.id.button_replay);
        btn_replay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSelectionPage();
            }
        });

        //connecting the button with id button_go_home to open the Main activity
        btn_go_home = (Button)findViewById(R.id.button_go_home);
        btn_go_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
    }

    public void openSelectionPage() {
        Intent intent_game = new Intent (this,SelectionPage.class);
        startActivity(intent_game);
    }

    public void openMainActivity() {
        Intent intent_game = new Intent (this,MainActivity.class);
        startActivity(intent_game);
    }
}
