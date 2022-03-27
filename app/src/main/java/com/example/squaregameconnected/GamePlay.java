package com.example.squaregameconnected;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

@RequiresApi(api = Build.VERSION_CODES.O)
public class GamePlay extends AppCompatActivity {

    Color color_player1 = Color.valueOf(0xff00ff00); //green color
    Color color_palyer2 = Color.valueOf(0xffffff00);///yellow color
    Color color_used;
    int integer_color_player1 = Color.GREEN;
    int integer_color_player2 = Color.YELLOW;
    int integer_color_used;
    boolean setplayer = true;
    private static final int[] buttonArray = {R.id.button3,R.id.button10,R.id.button12,
            R.id.button9,R.id.button11,R.id.button14,R.id.button999,R.id.button111111,
            R.id.button141414,R.id.button99,R.id.button1111,R.id.button141414,R.id.button99,
            R.id.button1111,R.id.button1414,R.id.button7,R.id.button8,R.id.button13,R.id.button151515
    ,R.id.button15,R.id.button888,R.id.button131313,R.id.button1515,R.id.button777, R.id.button88,
            R.id.button1313,R.id.button2};

    private Button[] gridButton = new Button[buttonArray.length];
    int i;

    ImageView question_mark_btn;
    ImageView settingsButton;
    Button buttonRow1_1,buttonRow1_2,buttonRow1_3;
    Button buttonRow2_1,buttonRow2_2,buttonRow2_3;
    Button buttonRow3_1,buttonRow3_2,buttonRow3_3;
    Button buttonRow4_1,buttonRow4_2,buttonRow4_3;
    Button buttonColumn1_1,buttonColumn1_2,buttonColumn1_3,buttonColumn1_4;
    Button buttonColumn2_1,buttonColumn2_2,buttonColumn2_3,buttonColumn2_4;
    Button buttonColumn3_1,buttonColumn3_2,buttonColumn3_3,buttonColumn3_4;

    boolean inGame;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //hide the top part of the app (blue part)
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_game_play);

            //start button for the gameplay grid
            buttonColumn1_1 = (Button) findViewById(R.id.button7);

            buttonColumn1_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonColumn1_1.setBackgroundColor(integer_color_used);
                    buttonColumn1_1.setEnabled(false);
                    //checkAllChecked();
                    setplayer = !setplayer;

                }
            });

            buttonColumn1_2 = (Button) findViewById(R.id.button8);
            buttonColumn1_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonColumn1_2.setBackgroundColor(integer_color_used);
                    buttonColumn1_2.setEnabled(false);
                    //checkAllChecked();
                    setplayer = !setplayer;
                }
            });

            buttonColumn1_3 = (Button) findViewById(R.id.button13);
            buttonColumn1_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonColumn1_3.setBackgroundColor(integer_color_used);
                    buttonColumn1_3.setEnabled(false);
                    //checkAllChecked();
                    setplayer = !setplayer;
                }
            });

            buttonColumn1_4 = (Button) findViewById(R.id.button151515);
            buttonColumn1_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonColumn1_4.setBackgroundColor(integer_color_used);
                    buttonColumn1_4.setEnabled(false);
                    //checkAllChecked();
                    setplayer = !setplayer;
                }
            });

            buttonColumn2_1 = (Button) findViewById(R.id.button15);
            buttonColumn2_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonColumn2_1.setBackgroundColor(integer_color_used);
                    buttonColumn2_1.setEnabled(false);
                    //checkAllChecked();
                    setplayer = !setplayer;
                }
            });

            buttonColumn2_2 = (Button) findViewById(R.id.button888);
            buttonColumn2_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonColumn2_2.setBackgroundColor(integer_color_used);
                    buttonColumn2_2.setEnabled(false);
                    //checkAllChecked();
                    setplayer = !setplayer;
                }
            });

            buttonColumn2_3 = (Button) findViewById(R.id.button131313);
            buttonColumn2_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonColumn2_3.setBackgroundColor(integer_color_used);
                    buttonColumn2_3.setEnabled(false);
                    //checkAllChecked();
                    setplayer = !setplayer;
                }
            });

            buttonColumn2_4 = (Button) findViewById(R.id.button1515);
            buttonColumn2_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonColumn2_4.setBackgroundColor(integer_color_used);
                    buttonColumn2_4.setEnabled(false);
                    //checkAllChecked();
                    setplayer = !setplayer;
                }
            });

            buttonColumn3_1 = (Button) findViewById(R.id.button777);
            buttonColumn3_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonColumn3_1.setBackgroundColor(integer_color_used);
                    buttonColumn3_1.setEnabled(false);
                    //checkAllChecked();
                    setplayer = !setplayer;
                }
            });

            buttonColumn3_2 = (Button) findViewById(R.id.button88);
            buttonColumn3_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonColumn3_2.setBackgroundColor(integer_color_used);
                    buttonColumn3_2.setEnabled(false);
                    //checkAllChecked();
                    setplayer = !setplayer;
                }
            });

            buttonColumn3_3 = (Button) findViewById(R.id.button1313);
            buttonColumn3_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonColumn3_3.setBackgroundColor(integer_color_used);
                    buttonColumn3_3.setEnabled(false);
                    //checkAllChecked();
                    setplayer = !setplayer;
                }
            });

            buttonColumn3_4 = (Button) findViewById(R.id.button2);
            buttonColumn3_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonColumn3_4.setBackgroundColor(integer_color_used);
                    buttonColumn3_4.setEnabled(false);
                    //checkAllChecked();
                    setplayer = !setplayer;
                }
            });

            buttonRow1_1 = (Button) findViewById(R.id.button3);
            buttonRow1_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonRow1_1.setBackgroundColor(integer_color_used);
                    buttonRow1_1.setEnabled(false);
                    //checkAllChecked();
                    setplayer = !setplayer;
                }
            });

            buttonRow1_2 = (Button) findViewById(R.id.button10);
            buttonRow1_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonRow1_2.setBackgroundColor(integer_color_used);
                    buttonRow1_2.setEnabled(false);
                    //checkAllChecked();
                    setplayer = !setplayer;
                }
            });

            buttonRow1_3 = (Button) findViewById(R.id.button12);
            buttonRow1_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonRow1_3.setBackgroundColor(integer_color_used);
                    buttonRow1_3.setEnabled(false);
                    //checkAllChecked();
                    setplayer = !setplayer;
                }
            });

            buttonRow2_1 = (Button) findViewById(R.id.button9);
            buttonRow2_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonRow2_1.setBackgroundColor(integer_color_used);
                    buttonRow2_1.setEnabled(false);
                    //checkAllChecked();
                    setplayer = !setplayer;
                }
            });

            buttonRow2_2 = (Button) findViewById(R.id.button11);
            buttonRow2_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonRow2_2.setBackgroundColor(integer_color_used);
                    buttonRow2_2.setEnabled(false);
                    //checkAllChecked();
                    setplayer = !setplayer;
                }
            });

            buttonRow2_3 = (Button) findViewById(R.id.button14);
            buttonRow2_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonRow2_3.setBackgroundColor(integer_color_used);
                    buttonRow2_3.setEnabled(false);
                    //checkAllChecked();
                    setplayer = !setplayer;
                }
            });

            buttonRow3_1 = (Button) findViewById(R.id.button999);
            buttonRow3_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonRow3_1.setBackgroundColor(integer_color_used);
                    buttonRow3_1.setEnabled(false);
                    //checkAllChecked();
                    setplayer = !setplayer;
                }
            });

            buttonRow3_2 = (Button) findViewById(R.id.button111111);
            buttonRow3_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonRow3_2.setBackgroundColor(integer_color_used);
                    buttonRow3_2.setEnabled(false);
                    //checkAllChecked();
                    setplayer = !setplayer;
                }
            });

            buttonRow3_3 = (Button) findViewById(R.id.button141414);
            buttonRow3_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonRow3_3.setBackgroundColor(integer_color_used);
                    buttonRow3_3.setEnabled(false);
                    //checkAllChecked();
                    setplayer = !setplayer;
                }
            });

            buttonRow4_1 = (Button) findViewById(R.id.button99);
            buttonRow4_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonRow4_1.setBackgroundColor(integer_color_used);
                    buttonRow4_1.setEnabled(false);
                    //checkAllChecked();
                    setplayer = !setplayer;
                }
            });

            buttonRow4_2 = (Button) findViewById(R.id.button1111);
            buttonRow4_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonRow4_2.setBackgroundColor(integer_color_used);
                    buttonRow4_2.setEnabled(false);
                    //checkAllChecked();
                    setplayer = !setplayer;
                }
            });

            buttonRow4_3 = (Button) findViewById(R.id.button1414);
            buttonRow4_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonRow4_3.setBackgroundColor(integer_color_used);
                    buttonRow4_3.setEnabled(false);
                    //checkAllChecked();
                    setplayer = !setplayer;
                }
            });

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

            //check if all the button have filled color
            //checkAllChecked();

            //if the game has at least one button with no fill color it will change the value of the
            //player to the second player (player1 = true, player2 = false)


        //}
    }
    public void openGuideActivity() {
        Intent intent = new Intent(this, GuideActivity.class);
        startActivity(intent);
    }

    public void openSettingsActivity() {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

    //function that set the color to used based on the boolean value
    public void setPlayerButtonResponse(){

        if (setplayer == true){
            integer_color_used = integer_color_player1;
        }
        else{
            integer_color_used = integer_color_player2;
        }
    }

    public void checkAllChecked(){

        for (i = 0; i<buttonArray.length;i++){
            Button momentaryButton = (Button)findViewById(buttonArray[i]);
            ColorDrawable viewColor = (ColorDrawable)momentaryButton.getBackground();
            int colorNow = viewColor.getColor();
            if (colorNow == integer_color_player1 || colorNow == integer_color_player2){
                continue;
            }else{
                break;
            }
        }

    }

}
