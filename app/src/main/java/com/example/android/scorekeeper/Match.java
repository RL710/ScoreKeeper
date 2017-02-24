package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;

/**
 * Created by renelv on 22.02.17.
 */

public class Match extends AppCompatActivity {

    private int matchid;
    Team team1;
    Team team2;

    public Match(Team t1, Team t2) {
        matchid++;
        Log.v("matchid: ", Integer.toString(matchid));
        this.team1 = t1;
        this.team2 = t2;
    }


    public Team setTeam(int i) {
        Team team = null;
        if (i == 0) {
            EditText editText = (EditText) findViewById(R.id.editTextTeamA);
            team = new Team(editText.getText().toString());
        } else if (i == 1) {
            EditText editText = (EditText) findViewById(R.id.editTextTeamB);
            team = new Team(editText.getText().toString());
        }
        return team;
    }

}
