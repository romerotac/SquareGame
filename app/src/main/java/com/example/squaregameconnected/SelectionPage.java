package com.example.squaregameconnected;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.content.Intent;
import android.widget.Toast;

public class SelectionPage extends AppCompatActivity {
    private Button button_gameplay;
    ImageView question_mark_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_selection_page);

//        Spinner gridSpinner = (Spinner) findViewById(R.id.spinner);
        final Spinner colorPlayer1Spinner = (Spinner) findViewById(R.id.spinner2);
        final Spinner colorPlayer2Spinner = (Spinner) findViewById(R.id.spinner3);

        button_gameplay = (Button)findViewById(R.id.button_game);

        //connecting the button with id button_game to open the activty GamePlay
        button_gameplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //setting color variables to transfer to next page
                String colorp1 = colorPlayer1Spinner.getSelectedItem().toString();
                String colorp2 = colorPlayer2Spinner.getSelectedItem().toString();

                openGamePlay(colorp1, colorp2);
            }
        });

        // referencing from the array string called grid (found in stings.xml)the list of names that should be used in the spinner
        ArrayAdapter < String > myAdapter = new ArrayAdapter<String>(SelectionPage.this,
                        android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.grid));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        gridSpinner.setAdapter(myAdapter);

        // referencing player 1 and player2 colors
        ArrayAdapter < String > colorPlayer1Adapter = new ArrayAdapter<String>(SelectionPage.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.colors));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        colorPlayer1Spinner.setAdapter(colorPlayer1Adapter);

        ArrayAdapter < String > colorPlayer2Adapter = new ArrayAdapter<String>(SelectionPage.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.colors));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        colorPlayer2Spinner.setAdapter(colorPlayer2Adapter);


        // button question mark go to guide activity
        question_mark_btn = (ImageView) findViewById(R.id.question_mark_button);
        question_mark_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                openGuideActivity();
            }
        });
    }

    public void openGamePlay( String colorp1, String colorp2) {
        //pass to gameplay the two color variable
        Bundle BN = new Bundle();
        BN.putString("ColorPlayer1", colorp1);
        BN.putString("ColorPlayer2",colorp2);
        Intent intent_game = new Intent (this,GamePlay.class);
        intent_game.putExtras(BN);
        startActivity(intent_game);
    }

    public void openGuideActivity() {
        Intent intent = new Intent(this, GuideActivity.class);
        startActivity(intent);
    }
}

