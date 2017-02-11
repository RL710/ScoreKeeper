package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int teamAScore = 0;
    private int teamAFouls = 0;
    private int teamBScore = 0;
    private int teamBFouls = 0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonARow1(View view) {
        teamAScore += 1;
        displayAScore();
    }
    private void displayAScore(){
        TextView textView = (TextView) findViewById(R.id.textViewCountARow1);
        textView.setText("" + teamAScore);
    }
    public void buttonARow2(View view) {
        teamAFouls += 1;
        displayAFouls();
    }
    private void displayAFouls(){
        TextView textView = (TextView) findViewById(R.id.textViewCountARow2);
        textView.setText("" + teamAFouls);
    }
    public void buttonBRow1(View view) {
        teamBScore += 1;
        displayBScore();
    }

    private void displayBScore(){
        TextView textView = (TextView) findViewById(R.id.textViewCountBRow1);
        textView.setText("" + teamBScore);
    }
    public void buttonBRow2(View view) {
        teamBFouls+= 1;
        displayBFouls();
    }
    private void displayBFouls(){
        TextView textView = (TextView) findViewById(R.id.textViewCountBRow2);
        textView.setText("" + teamBFouls);
    }
    public void buttonReset(View view){
        teamAScore = 0;
        displayAScore();
        teamAFouls = 0;
        displayAFouls();
        teamBScore = 0;
        displayBScore();
        teamBFouls = 0;
        displayBFouls();
    }


}
