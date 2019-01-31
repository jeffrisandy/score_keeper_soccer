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

    int goalB = 0;
    int shotOffGoalB = 0;
    int shotOnGoalB = 0;
    int freekickB = 0;
    int cornerB = 0;
    int foulB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    /*********
     * TEAM A
     *********
     */

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



    /*********
     * TEAM B
     *********
     */

    /**
     * TEAM B GOAL, increase by 1
     */
    public void addGoalB(View v) {

        goalB += 1;
        displayForTeamB(goalB, "goal");

    }

    /**
     * TEAM B Shot OFF Goal, increase by 1
     */
    public void addShotOffGoalB(View v) {

        shotOffGoalB += 1;
        displayForTeamB(shotOffGoalB, "shot_off_goal");

    }

    /**
     * TEAM B Shot ON Goal, increase by 1
     */
    public void addShotOnGoalB(View v) {

        shotOnGoalB += 1;
        displayForTeamB(shotOnGoalB, "shot_on_goal");

    }

    /**
     * TEAM B Freekick, increase by 1
     */
    public void addFreekickB(View v) {

        freekickB += 1;
        displayForTeamB(freekickB, "freekick");

    }

    /**
     * TEAM B Corner, increase by 1
     */
    public void addCornerB(View v) {

        cornerB += 1;
        displayForTeamB(cornerB, "corner");

    }

    /**
     * TEAM B Foul, increase by 1
     */
    public void addFoulB(View v) {

        foulB += 1;
        displayForTeamB(foulB, "foul");

    }

    /**
     * Displays the given GOAL for Team B.
     */
    public void displayForTeamB(int score, String name) {


        if (name == "goal") {
            TextView scoreView = (TextView) findViewById(R.id.team_b_goal);
            scoreView.setText(String.valueOf(score));
        } else if (name == "shot_off_goal") {
            TextView scoreView = (TextView) findViewById(R.id.shot_off_goal_b);
            scoreView.setText(String.valueOf(score));
        } else if (name == "shot_on_goal") {
            TextView scoreView = (TextView) findViewById(R.id.shot_on_goal_b);
            scoreView.setText(String.valueOf(score));
        } else if (name == "freekick") {
            TextView scoreView = (TextView) findViewById(R.id.freekick_b);
            scoreView.setText(String.valueOf(score));
        } else if (name == "corner") {
            TextView scoreView = (TextView) findViewById(R.id.corner_b);
            scoreView.setText(String.valueOf(score));
        } else if (name == "foul") {
            TextView scoreView = (TextView) findViewById(R.id.foul_b);
            scoreView.setText(String.valueOf(score));
        }


    }




    /**
     * reset both team A & B score to zerp.
     */
    public void reset(View v) {
        goalA = 0;
        shotOffGoalA = 0;
        shotOnGoalA = 0;
        freekickA = 0;
        cornerA = 0;
        foulA = 0;

        goalB = 0;
        shotOffGoalB = 0;
        shotOnGoalB = 0;
        freekickB = 0;
        cornerB = 0;
        foulB = 0;

        displayForTeamA(goalA, "goal");
        displayForTeamA(shotOffGoalA, "shot_off_goal");
        displayForTeamA(shotOnGoalA, "shot_on_goal");
        displayForTeamA(freekickA, "freekick");
        displayForTeamA(cornerA, "corner");
        displayForTeamA(foulA, "foul");

        displayForTeamB(goalB, "goal");
        displayForTeamB(shotOffGoalB, "shot_off_goal");
        displayForTeamB(shotOnGoalB, "shot_on_goal");
        displayForTeamB(freekickB, "freekick");
        displayForTeamB(cornerB, "corner");
        displayForTeamB(foulB, "foul");


    }
}
