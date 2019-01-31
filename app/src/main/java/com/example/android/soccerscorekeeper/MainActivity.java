package com.example.android.soccerscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int goalA = 0;
    int shotOffGoalA = 0;
    int shotOnGoalA = 0;
    int freekickA = 0;
    int cornerA = 0;
    int foulA = 0;

    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * TEAM A GOAL, increase by 1
     */
    public void addGoalA(View v) {

        goalA += 1;
        displayForTeamA(goalA, "goal");

    }

    /**
     * TEAM A Shot OFF Goal, increase by 1
     */
    public void addShotOffGoalA(View v) {

        shotOffGoalA += 1;
        displayForTeamA(shotOffGoalA, "shot_off_goal");

    }

    /**
     * TEAM A Shot ON Goal, increase by 1
     */
    public void addShotOnGoalA(View v) {

        shotOnGoalA += 1;
        displayForTeamA(shotOnGoalA, "shot_on_goal");

    }

    /**
     * TEAM A Freekick, increase by 1
     */
    public void addFreekickA(View v) {

        freekickA += 1;
        displayForTeamA(freekickA, "freekick");

    }

    /**
     * TEAM A Corner, increase by 1
     */
    public void addCornerA(View v) {

        cornerA += 1;
        displayForTeamA(cornerA, "corner");

    }

    /**
     * TEAM A Foul, increase by 1
     */
    public void addFoulA(View v) {

        foulA += 1;
        displayForTeamA(foulA, "foul");

    }

    /**
     * Displays the given GOAL for Team A.
     */
    public void displayForTeamA(int score, String name) {


        if (name == "goal") {
            TextView scoreView = (TextView) findViewById(R.id.team_a_goal);
            scoreView.setText(String.valueOf(score));
        } else if (name == "shot_off_goal") {
            TextView scoreView = (TextView) findViewById(R.id.shot_off_goal_a);
            scoreView.setText(String.valueOf(score));
        } else if (name == "shot_on_goal") {
            TextView scoreView = (TextView) findViewById(R.id.shot_on_goal_a);
            scoreView.setText(String.valueOf(score));
        } else if (name == "freekick") {
            TextView scoreView = (TextView) findViewById(R.id.freekick_a);
            scoreView.setText(String.valueOf(score));
        } else if (name == "corner") {
            TextView scoreView = (TextView) findViewById(R.id.corner_a);
            scoreView.setText(String.valueOf(score));
        } else if (name == "foul") {
            TextView scoreView = (TextView) findViewById(R.id.foul_a);
            scoreView.setText(String.valueOf(score));
        }


    }



    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * reset both team A & B score to zerp.
     */
    public void reset(View v) {
        int goalA = 0;
        int shotOffGoalA = 0;
        int shotOnGoalA = 0;
        int freekickA = 0;
        int cornerA = 0;
        int foulA = 0;

        displayForTeamA(goalA, "goal");
        displayForTeamA(shotOffGoalA, "shot_off_goal");
        displayForTeamA(shotOnGoalA, "shot_on_goal");
        displayForTeamA(freekickA, "freekick");
        displayForTeamA(cornerA, "corner");
        displayForTeamA(foulA, "foul");

    }
}
