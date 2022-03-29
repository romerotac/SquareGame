package com.example.squaregameconnected;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.PaintDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

@RequiresApi(api = Build.VERSION_CODES.O)
public class GamePlay extends AppCompatActivity {

    TextView point_of_player_1;
    TextView point_of_player_2;

    int integer_color_player1 = Color.GREEN;
    int integer_color_player2 = Color.YELLOW;
    int integer_color_used;
    int totChecked = 0;
    boolean setplayer = true;
    boolean winplayer = false;

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

    //all start on false
    Boolean bool_buttonRow1_1 = true ,bool_buttonRow1_2 = true,bool_buttonRow1_3 = true;
    Boolean bool_buttonRow2_1 = true ,bool_buttonRow2_2 = true,bool_buttonRow2_3 = true;
    Boolean bool_buttonRow3_1 = true,bool_buttonRow3_2 = true,bool_buttonRow3_3 = true;
    Boolean bool_buttonRow4_1=  true,bool_buttonRow4_2 =  true,bool_buttonRow4_3 = true;
    Boolean bool_buttonColumn1_1 = true,bool_buttonColumn1_2 = true,bool_buttonColumn1_3 = true,bool_buttonColumn1_4 = true;
    Boolean bool_buttonColumn2_1 = true,bool_buttonColumn2_2 = true,bool_buttonColumn2_3 = true,bool_buttonColumn2_4 = true;
    Boolean bool_buttonColumn3_1 = true,bool_buttonColumn3_2 = true,bool_buttonColumn3_3 = true,bool_buttonColumn3_4 = true;

    public Boolean[] square1 = {bool_buttonColumn1_1,bool_buttonRow1_1,bool_buttonColumn1_2,bool_buttonRow2_1};
    public Boolean[] square2 = {bool_buttonColumn1_2,bool_buttonRow1_2,bool_buttonColumn1_3,bool_buttonRow2_2};
    public Boolean[] square3 = {bool_buttonColumn1_3,bool_buttonRow1_3,bool_buttonColumn1_4,bool_buttonRow2_3};
    public Boolean[] square4 = {bool_buttonColumn2_1,bool_buttonRow2_1,bool_buttonColumn2_2,bool_buttonRow3_1};
    public Boolean[] square5 = {bool_buttonColumn2_2,bool_buttonRow2_2,bool_buttonColumn2_3,bool_buttonRow3_2};
    public Boolean[] square6 = {bool_buttonColumn2_3,bool_buttonRow2_3,bool_buttonColumn2_4,bool_buttonRow3_3};
    public Boolean[] square7 = {bool_buttonColumn3_1,bool_buttonRow3_1,bool_buttonColumn3_2,bool_buttonRow4_1};
    public Boolean[] square8 = {bool_buttonColumn3_2,bool_buttonRow3_2,bool_buttonColumn3_3,bool_buttonRow4_2};
    public Boolean[] square9 = {bool_buttonColumn3_3,bool_buttonRow3_3,bool_buttonColumn3_4,bool_buttonRow4_3};

    Boolean check_square1 = false, check_square2 = false, check_square3 = false, check_square4 = false, check_square5 = false, check_square6 = false, check_square7 = false,check_square8 =false, check_square9 = false;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //hide the top part of the app (blue part)
        getSupportActionBar().hide();
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_game_play);

            //start button for the gameplay grid
            buttonColumn1_1 = (Button) findViewById(R.id.button7);

            buttonColumn1_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonColumn1_1.setBackgroundColor(integer_color_used);
                    buttonColumn1_1.setEnabled(false);
                    totChecked++;
                    square1[0] = false;
                    checkAllChecked(totChecked);
                    checkGetPoint();
                    //check if the player has already win one time boolean is set in checkGetPoint()
                    if (winplayer == false) {
                        setplayer = !setplayer;
                    }else{
                        winplayer = false;
                    }
                }
            });

            buttonColumn1_2 = (Button) findViewById(R.id.button8);
            buttonColumn1_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonColumn1_2.setBackgroundColor(integer_color_used);
                    buttonColumn1_2.setEnabled(false);
                    totChecked++;
                    square1[2] = false;
                    square2[0] = false;
                    checkAllChecked(totChecked);
                    checkGetPoint();
                    if (winplayer == false) {
                        setplayer = !setplayer;
                    }else{
                        winplayer = false;
                    }
                }
            });

            buttonColumn1_3 = (Button) findViewById(R.id.button13);
            buttonColumn1_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonColumn1_3.setBackgroundColor(integer_color_used);
                    buttonColumn1_3.setEnabled(false);
                    square2[2] = false;
                    square3[0] = false;
                    totChecked++;
                    checkAllChecked(totChecked);
                    checkGetPoint();

                    if (winplayer == false) {
                        setplayer = !setplayer;
                    }else{
                        winplayer = false;
                    }
                }
            });

            buttonColumn1_4 = (Button) findViewById(R.id.button151515);
            buttonColumn1_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonColumn1_4.setBackgroundColor(integer_color_used);
                    buttonColumn1_4.setEnabled(false);
                    square3[2] = false;
                    totChecked++;
                    checkAllChecked(totChecked);
                    checkGetPoint();
                    if (winplayer == false) {
                        setplayer = !setplayer;
                    }else{
                        winplayer = false;
                    }
                }
            });

            buttonColumn2_1 = (Button) findViewById(R.id.button15);
            buttonColumn2_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonColumn2_1.setBackgroundColor(integer_color_used);
                    buttonColumn2_1.setEnabled(false);
                    square4[0] = false;
                    totChecked++;
                    checkAllChecked(totChecked);
                    checkGetPoint();
                    if (winplayer == false) {
                        setplayer = !setplayer;
                    }else{
                        winplayer = false;
                    }
                }
            });

            buttonColumn2_2 = (Button) findViewById(R.id.button888);
            buttonColumn2_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonColumn2_2.setBackgroundColor(integer_color_used);
                    buttonColumn2_2.setEnabled(false);
                    square5[0] = false;
                    square4[2] = false;
                    totChecked++;
                    checkAllChecked(totChecked);
                    checkGetPoint();
                    if (winplayer == false) {
                        setplayer = !setplayer;
                    }else{
                        winplayer = false;
                    }
                }
            });

            buttonColumn2_3 = (Button) findViewById(R.id.button131313);
            buttonColumn2_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonColumn2_3.setBackgroundColor(integer_color_used);
                    buttonColumn2_3.setEnabled(false);
                    square6[0] = false;
                    square5[2] = false;
                    totChecked++;
                    checkAllChecked(totChecked);
                    checkGetPoint();
                    if (winplayer == false) {
                        setplayer = !setplayer;
                    }else{
                        winplayer = false;
                    }
                }
            });

            buttonColumn2_4 = (Button) findViewById(R.id.button1515);
            buttonColumn2_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonColumn2_4.setBackgroundColor(integer_color_used);
                    buttonColumn2_4.setEnabled(false);
                    square6[2] = false;
                    totChecked++;
                    checkAllChecked(totChecked);
                    checkGetPoint();
                    if (winplayer == false) {
                        setplayer = !setplayer;
                    }else{
                        winplayer = false;
                    }
                }
            });

            buttonColumn3_1 = (Button) findViewById(R.id.button777);
            buttonColumn3_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonColumn3_1.setBackgroundColor(integer_color_used);
                    buttonColumn3_1.setEnabled(false);
                    square7[0] = false;
                    totChecked++;
                    checkAllChecked(totChecked);
                    checkGetPoint();
                    if (winplayer == false) {
                        setplayer = !setplayer;
                    }else{
                        winplayer = false;
                    }
                }
            });

            buttonColumn3_2 = (Button) findViewById(R.id.button88);
            buttonColumn3_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonColumn3_2.setBackgroundColor(integer_color_used);
                    buttonColumn3_2.setEnabled(false);
                    square8[0] = false;
                    square7[2] = false;
                    totChecked++;
                    checkAllChecked(totChecked);
                    checkGetPoint();
                    if (winplayer == false) {
                        setplayer = !setplayer;
                    }else{
                        winplayer = false;
                    }
                }
            });

            buttonColumn3_3 = (Button) findViewById(R.id.button1313);
            buttonColumn3_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonColumn3_3.setBackgroundColor(integer_color_used);
                    buttonColumn3_3.setEnabled(false);
                    square9[0] = false;
                    square8[2] = false;
                    totChecked++;
                    checkAllChecked(totChecked);
                    checkGetPoint();
                    if (winplayer == false) {
                        setplayer = !setplayer;
                    }else{
                        winplayer = false;
                    }
                }
            });

            buttonColumn3_4 = (Button) findViewById(R.id.button2);
            buttonColumn3_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonColumn3_4.setBackgroundColor(integer_color_used);
                    buttonColumn3_4.setEnabled(false);
                    square9[2] = false;
                    totChecked++;
                    checkAllChecked(totChecked);
                    checkGetPoint();
                    if (winplayer == false) {
                        setplayer = !setplayer;
                    }else{
                        winplayer = false;
                    }
                }
            });

            buttonRow1_1 = (Button) findViewById(R.id.button3);
            buttonRow1_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonRow1_1.setBackgroundColor(integer_color_used);
                    buttonRow1_1.setEnabled(false);
                    square1[1] = false;
                    totChecked++;
                    checkAllChecked(totChecked);
                    checkGetPoint();
                    if (winplayer == false) {
                        setplayer = !setplayer;
                    }else{
                        winplayer = false;
                    }
                }
            });

            buttonRow1_2 = (Button) findViewById(R.id.button10);
            buttonRow1_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonRow1_2.setBackgroundColor(integer_color_used);
                    buttonRow1_2.setEnabled(false);
                    square2[1] = false;
                    totChecked++;
                    checkAllChecked(totChecked);
                    checkGetPoint();
                    if (winplayer == false) {
                        setplayer = !setplayer;
                    }else{
                        winplayer = false;
                    }
                }
            });

            buttonRow1_3 = (Button) findViewById(R.id.button12);
            buttonRow1_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonRow1_3.setBackgroundColor(integer_color_used);
                    buttonRow1_3.setEnabled(false);
                    square3[1] = false;
                    totChecked++;
                    checkAllChecked(totChecked);
                    checkGetPoint();
                    if (winplayer == false) {
                        setplayer = !setplayer;
                    }else{
                        winplayer = false;
                    }
                }
            });

            buttonRow2_1 = (Button) findViewById(R.id.button9);
            buttonRow2_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonRow2_1.setBackgroundColor(integer_color_used);
                    buttonRow2_1.setEnabled(false);
                    square1[3] = false;
                    square4[1] = false;
                    totChecked++;
                    checkAllChecked(totChecked);
                    checkGetPoint();
                    if (winplayer == false) {
                        setplayer = !setplayer;
                    }else{
                        winplayer = false;
                    }
                }
            });

            buttonRow2_2 = (Button) findViewById(R.id.button11);
            buttonRow2_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonRow2_2.setBackgroundColor(integer_color_used);
                    buttonRow2_2.setEnabled(false);
                    square2[3] = false;
                    square5[1] = false;
                    totChecked++;
                    checkAllChecked(totChecked);
                    checkGetPoint();
                    if (winplayer == false) {
                        setplayer = !setplayer;
                    }else{
                        winplayer = false;
                    }
                }
            });

            buttonRow2_3 = (Button) findViewById(R.id.button14);
            buttonRow2_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonRow2_3.setBackgroundColor(integer_color_used);
                    buttonRow2_3.setEnabled(false);
                    square6[1] = false;
                    square3[3] = false;
                    totChecked++;
                    checkAllChecked(totChecked);
                    checkGetPoint();
                    if (winplayer == false) {
                        setplayer = !setplayer;
                    }else{
                        winplayer = false;
                    }
                }
            });

            buttonRow3_1 = (Button) findViewById(R.id.button999);
            buttonRow3_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonRow3_1.setBackgroundColor(integer_color_used);
                    buttonRow3_1.setEnabled(false);
                    square7[1] = false;
                    square4[3] = false;
                    totChecked++;
                    checkAllChecked(totChecked);
                    checkGetPoint();
                    if (winplayer == false) {
                        setplayer = !setplayer;
                    }else{
                        winplayer = false;
                    }
                }
            });

            buttonRow3_2 = (Button) findViewById(R.id.button111111);
            buttonRow3_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonRow3_2.setBackgroundColor(integer_color_used);
                    buttonRow3_2.setEnabled(false);
                    square5[3] = false;
                    square8[1] = false;
                    totChecked++;
                    checkAllChecked(totChecked);
                    checkGetPoint();
                    if (winplayer == false) {
                        setplayer = !setplayer;
                    }else{
                        winplayer = false;
                    }
                }
            });

            buttonRow3_3 = (Button) findViewById(R.id.button141414);
            buttonRow3_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonRow3_3.setBackgroundColor(integer_color_used);
                    buttonRow3_3.setEnabled(false);
                    square6[3] = false;
                    square9[1] = false;
                    totChecked++;
                    checkAllChecked(totChecked);
                    checkGetPoint();
                    if (winplayer == false) {
                        setplayer = !setplayer;
                    }else{
                        winplayer = false;
                    }
                }
            });

            buttonRow4_1 = (Button) findViewById(R.id.button99);
            buttonRow4_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonRow4_1.setBackgroundColor(integer_color_used);
                    buttonRow4_1.setEnabled(false);
                    square7[3] = false;
                    totChecked++;
                    checkAllChecked(totChecked);
                    checkGetPoint();
                    if (winplayer == false) {
                        setplayer = !setplayer;
                    }else{
                        winplayer = false;
                    }
                }
            });

            buttonRow4_2 = (Button) findViewById(R.id.button1111);
            buttonRow4_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setPlayerButtonResponse();
                    buttonRow4_2.setBackgroundColor(integer_color_used);
                    buttonRow4_2.setEnabled(false);
                    square8[3] = false;
                    totChecked++;
                    checkAllChecked(totChecked);
                    checkGetPoint();
                    if (winplayer == false) {
                        setplayer = !setplayer;
                    }else{
                        winplayer = false;
                    }
                }
            });



            buttonRow4_3 = (Button) findViewById(R.id.button1414);
            buttonRow4_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    setPlayerButtonResponse();
                    buttonRow4_3.setBackgroundColor(integer_color_used);
                    buttonRow4_3.setEnabled(false);
                    square9[3] = false;
                    totChecked++;
                    checkAllChecked(totChecked);
                    checkGetPoint();
                    if (winplayer == false) {
                        setplayer = !setplayer;
                    }else{
                        winplayer = false;
                    }
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

        if (setplayer){
            integer_color_used = integer_color_player1;
        }
        else{
            integer_color_used = integer_color_player2;
        }
    }

    //check if all the button have filled color
    public void checkAllChecked(int number_checked){
        if(number_checked == 24){
            Context context = getApplicationContext();
            CharSequence text = "RESULT!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            openResultActivity();
        }

    }


    public void openResultActivity() {
        Intent intent = new Intent(this, ResultActivity.class);
        startActivity(intent);
    }

    public void checkGetPoint(){
        String message = "This is the player who got the square: ";
        int counter_1 = 0;
        int counter_2 = 0;

        point_of_player_1 = findViewById(R.id.first_player_point);
        point_of_player_2 = findViewById(R.id.second_player_point);

        if (setplayer == true) {
            counter_1 += 1;
            message += "player 1" + " " + counter_1;
        } else {
            counter_2 += 1;
            message += "player 2" + " " + counter_2;
        }

        int count_square1 = 0;
            if(check_square1 == false) {
                for (int i = 0; i < square1.length; i++) {
                    if (!square1[i]) {
                        count_square1++;
                        if (count_square1 == square1.length) {
                            Toast.makeText(GamePlay.this, message, Toast.LENGTH_SHORT).show();
                            winplayer = true;
                            check_square1 = true;
                        }
                    }

                }
            }

        int count_square2 = 0;
        if(check_square2 == false) {
            for (int i = 0; i < square2.length; i++) {
                if (!square2[i]) {
                    count_square2++;
                    if (count_square2 == square2.length) {
                        Toast.makeText(GamePlay.this, message, Toast.LENGTH_SHORT).show();
                        winplayer = true;
                        check_square2 = true;
                    }
                }

            }
        }

        int count_square3 = 0;
        if(check_square3 == false) {
            for (int i = 0; i < square3.length; i++) {
                if (!square3[i]) {
                    count_square3++;
                    if (count_square3 == square3.length) {
                        Toast.makeText(GamePlay.this, message, Toast.LENGTH_SHORT).show();
                        winplayer = true;
                        check_square1 = true;
                    }
                }

            }
        }

        int count_square4 = 0;
        if(check_square4 == false) {
            for (int i = 0; i < square4.length; i++) {
                if (!square4[i]) {
                    count_square4++;
                    if (count_square4 == square4.length) {
                        Toast.makeText(GamePlay.this, message, Toast.LENGTH_SHORT).show();
                        winplayer = true;
                        check_square4 = true;
                    }
                }

            }
        }

        int count_square5 = 0;
        if(check_square5 == false) {
            for (int i = 0; i < square5.length; i++) {
                if (!square5[i]) {
                    count_square5++;
                    if (count_square5 == square5.length) {
                        Toast.makeText(GamePlay.this, message, Toast.LENGTH_SHORT).show();
                        winplayer = true;
                        check_square5 = true;
                    }
                }

            }
        }

        int count_square6 = 0;
        if(check_square6 == false) {
            for (int i = 0; i < square6.length; i++) {
                if (!square6[i]) {
                    count_square6++;
                    if (count_square6 == square6.length) {
                        Toast.makeText(GamePlay.this, message, Toast.LENGTH_SHORT).show();
                        winplayer = true;
                        check_square6 = true;
                    }
                }

            }
        }

        int count_square7 = 0;
        if(check_square7 == false) {
            for (int i = 0; i < square7.length; i++) {
                if (!square7[i]) {
                    count_square7++;
                    if (count_square7 == square7.length) {
                        Toast.makeText(GamePlay.this, message, Toast.LENGTH_SHORT).show();
                        winplayer = true;
                        check_square7 = true;
                    }
                }

            }
        }

        int count_square8 = 0;
        if(check_square8 == false) {
            for (int i = 0; i < square8.length; i++) {
                if (!square8[i]) {
                    count_square8++;
                    if (count_square8 == square8.length) {
                        Toast.makeText(GamePlay.this, message, Toast.LENGTH_SHORT).show();
                        winplayer = true;
                        check_square8 = true;
                    }
                }

            }
        }

        int count_square9 = 0;
        if(check_square9 == false) {
            for (int i = 0; i < square9.length; i++) {
                if (!square9[i]) {
                    count_square9++;
                    if (count_square9 == square9.length) {
                        Toast.makeText(GamePlay.this, message, Toast.LENGTH_SHORT).show();
                        winplayer = true;
                        check_square9 = true;
                    }
                }

            }
        }

    }

}
