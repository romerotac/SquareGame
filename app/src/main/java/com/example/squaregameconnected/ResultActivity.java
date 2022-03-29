package com.example.squaregameconnected;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {
    Button btn_replay;
    Button btn_go_home;
    ImageView winner_profile;
    TextView winner_text;


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

        winner_profile = (ImageView) findViewById(R.id.winner_player_profile);
        winner_text = (TextView) findViewById(R.id.winner_player_text);

        Bundle bundle = getIntent().getExtras();
        assert bundle != null;
        String result = bundle.getString("Winner");
//        Toast.makeText(ResultActivity.this, result, Toast.LENGTH_SHORT).show();

        assert result != null;
        if (result.equals("player_1")) {
            winner_profile.setImageResource(R.drawable.avatar_1_removed);
            winner_text.setText("PLAYER 1 !!!");
        } else {
            winner_profile.setImageResource(R.drawable.avatar_2_removed);
            winner_text.setText("PLAYER 2 !!!");
        }
        if (result == "tie"){
            winner_text.setText("IT IS A TIE !!!");
        }


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
