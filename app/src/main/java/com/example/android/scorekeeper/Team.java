package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by renelv on 22.02.17.
 */

public class Team extends AppCompatActivity {

    String name;

    private int score  = 0;
    private int fouls = 0;

    public Team(){}

    public Team(String name){
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public int getFouls() {
        return fouls;
    }
    public void plusScore(){
        score++;
    }
    public void plusFouls(){
        fouls++;
    }

    public void reset(){
        score = 0;
        fouls = 0;
    }
}
