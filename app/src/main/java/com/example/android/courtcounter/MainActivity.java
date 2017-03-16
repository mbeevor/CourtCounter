package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static com.example.android.courtcounter.R.id.team_a_score;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     *  This method is called when the +3 button is clicked.
     */
    public void threepoints(View view) {
        score = score + 3;
        displayForTeamA (score);
    }

    /**
     *  This method is called when the +2 button is clicked.
     */
    public void twopoints(View view) {
        score = score + 2;
        displayForTeamA (score);
    }

    /**
     *  This method is called when the +1 button is clicked.
     */
    public void onepoint(View view) {
        score = score + 1;
        displayForTeamA (score);
    }


}
