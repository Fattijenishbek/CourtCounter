package com.example.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA=0;
    int scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void score3a(View view){
        scoreA+=3;
        displayForTeamA(scoreA);
    }
    public void score2a(View view){
        scoreA+=2;
        displayForTeamA(scoreA);
    }
    public void freeThrowa(View view){
        scoreA+=1;
        displayForTeamA(scoreA);
    }

    public void reset(View view){
        displayForTeamA(0);
        displayForTeamB(0);
        scoreA=0;
        scoreB=0;
    }

    public void score3b(View view){
        scoreB+=3;
        displayForTeamB(scoreB);
    }
    public void score2b(View view){
        scoreB+=2;
        displayForTeamB(scoreB);
    }
    public void freeThrowb(View view){
        scoreB+=1;
        displayForTeamB(scoreB);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}