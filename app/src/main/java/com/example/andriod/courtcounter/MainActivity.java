package com.example.andriod.courtcounter;

import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA =0;

    int scoreTeamB =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Increase the score for the Team A by 1 point.
     */
    public void addThreeForTeamA(View v){
    scoreTeamA=scoreTeamA+1;
        displayforTeamA(scoreTeamA);
    }

    /**
     * Increase the scoer for the Team A by 2 points.
     */
    public void addTwoForTeamA(View v){
        scoreTeamA=scoreTeamA+2;
        displayforTeamA(scoreTeamA);
    }

    /**
     * Increase the score for the Team A by 3 points.
     */
    public void addoneForTeamA(View v){
      scoreTeamA=scoreTeamA+3;
       displayforTeamA(scoreTeamA);
    }


    /**
     * Increase the score for the Team B by 1 point.
     */
    public void addThreeForTeamB(View v){
        scoreTeamB=scoreTeamB+1;
        displayforTeamB(scoreTeamB);
    }

    /**
     * Increase the scoer for the Team B by 2 points.
     */
    public void addTwoForTeamB(View v){
        scoreTeamB=scoreTeamB+2;
        displayforTeamB(scoreTeamB);
    }

    /**
     * Increase the score for the Team B by 3 points.
     */
    public void addoneForTeamB(View v){
        scoreTeamB=scoreTeamB+3;
        displayforTeamB(scoreTeamB);
    }

    public void resetscore(View v){
       scoreTeamA=0;
        scoreTeamB=0;
        displayforTeamA(scoreTeamA);
        displayforTeamB(scoreTeamB);

    }


    /**
     * display the given score for the Team A.
     */
    public void displayforTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * display the given score for the Team B.
     */
    public void displayforTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}