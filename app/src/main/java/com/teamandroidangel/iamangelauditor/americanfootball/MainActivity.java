package com.teamandroidangel.iamangelauditor.americanfootball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreForTeamA = 0;
    int scoreForTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plusSixForTeamA(View view){
        scoreForTeamA = scoreForTeamA + 6;
        displayScoreForTeamA(scoreForTeamA);
    }

    public void plusThreeForTeamA(View view) {
        scoreForTeamA = scoreForTeamA + 3;
        displayScoreForTeamA(scoreForTeamA);
    }
    public void plusTwoForTeamA(View view) {
        scoreForTeamA = scoreForTeamA + 2;
        displayScoreForTeamA(scoreForTeamA);
    }
    public void plusOneForTeamA(View view) {
        scoreForTeamA = scoreForTeamA + 1;
        displayScoreForTeamA(scoreForTeamA);
    }

    public void plusSixForTeamB(View view) {
        scoreForTeamB = scoreForTeamB + 6;
        displayScoreForTeamB(scoreForTeamB);
    }

    public void plusThreeForTeamB(View view) {
        scoreForTeamB = scoreForTeamB + 3;
        displayScoreForTeamB(scoreForTeamB);
    }

    public void plusTwoForTeamB(View view) {
        scoreForTeamB = scoreForTeamB + 2;
        displayScoreForTeamB(scoreForTeamB);
    }

    public void plusOneForTeamB(View view) {
        scoreForTeamB = scoreForTeamB + 1;
        displayScoreForTeamB(scoreForTeamB);
    }

    public void resetScore(View view){
        scoreForTeamA = 0;
        scoreForTeamB = 0;
        displayScoreForTeamA(scoreForTeamA);
        displayScoreForTeamB(scoreForTeamB);
    }

    public void displayScoreForTeamA(int score) {
        TextView scoreTextView = (TextView)findViewById(R.id.teamAScore);
        scoreTextView.setText(String.valueOf(score));
    }

    public void displayScoreForTeamB(int score){
        TextView scoreTextView = (TextView)findViewById(R.id.teamBScore);
        scoreTextView.setText(String.valueOf(score));
    }
}
