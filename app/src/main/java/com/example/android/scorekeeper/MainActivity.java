package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Team t1 = new Team();
    Team t2 = new Team();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonARow1(View view) {
        t1.plusScore();
        displayAScore();
    }

    private void displayAScore() {
        TextView textView = (TextView) findViewById(R.id.textViewCountARow1);
        textView.setText(Integer.toString(t1.getScore()));
    }

    public void buttonARow2(View view) {
        t1.plusFouls();
        displayAFouls();
    }

    private void displayAFouls() {
        TextView textView = (TextView) findViewById(R.id.textViewCountARow2);
        textView.setText(Integer.toString(t1.getFouls()));
    }

    public void buttonBRow1(View view) {
        t2.plusScore();
        displayBScore();
    }

    private void displayBScore() {
        TextView textView = (TextView) findViewById(R.id.textViewCountBRow1);
        textView.setText(Integer.toString(t2.getScore()));
    }

    public void buttonBRow2(View view) {
        t2.plusFouls();
        displayBFouls();
    }

    private void displayBFouls() {
        TextView textView = (TextView) findViewById(R.id.textViewCountBRow2);
        textView.setText(Integer.toString(t2.getFouls()));
    }

    public void buttonReset(View view) {
        t1.reset();
        t2.reset();
        displayAScore();
        displayAFouls();
        displayBScore();
        displayBFouls();
    }

    public void buttonSave(View view) {

        Match match = new Match(t1, t2);

    }


}
