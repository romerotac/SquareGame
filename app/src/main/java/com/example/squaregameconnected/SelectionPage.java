package com.example.squaregameconnected;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.content.Intent;

public class SelectionPage extends AppCompatActivity {
    private Button button_gameplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_page);

        Spinner gridSpinner = (Spinner) findViewById(R.id.spinner);

        button_gameplay = (Button)findViewById(R.id.button_game);

        //connecting the button with id button_game to open the activty GamePlay
        button_gameplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGamePlay();
            }
        });

        // referencing from the array string called grid (found in stings.xml)the list of names that should be used in the spinner
        ArrayAdapter < String > myAdapter = new ArrayAdapter<String>(SelectionPage.this,
                        android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.grid));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gridSpinner.setAdapter(myAdapter);
    }

    public void openGamePlay(){
        Intent intent_game = new Intent (this,GamePlay.class);
            startActivity(intent_game);
        }
}
