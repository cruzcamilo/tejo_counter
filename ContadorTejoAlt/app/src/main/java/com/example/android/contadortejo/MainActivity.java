package com.example.android.contadortejo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayMechaForTeamA(scoreMeTeamA);
        displayMechaForTeamB(scoreMeTeamB);
    }

    int scoreMeTeamA = 0;
    int scoreMaTeamA = 0;
    int scoreMeTeamB = 0;
    int scoreMaTeamB = 0;
    int maxScore = 27;

    /**
     * Increase score for Team A by 9 points.
     */
    public void threeMechasTeamA(View v) {
        if (scoreMeTeamA < maxScore) {
            scoreMeTeamA += 3;
            displayMechaForTeamA(scoreMeTeamA);
            manoClear();
        }
    }

    /**
     * Increase score for Team A by 6 points.
     */
    public void twoMechasTeamA(View v) {
        if (scoreMeTeamA < maxScore) {
            scoreMeTeamA += 2;
            displayMechaForTeamA(scoreMeTeamA);
            manoClear();
        }
    }

    /**
     * Increase score for Team A by 3 point.
     */
    public void mechaTeamA(View v) {
        if (scoreMeTeamA < maxScore) {
            scoreMeTeamA += 1;
            displayMechaForTeamA(scoreMeTeamA);
            manoClear();
        }

    }

    /**
     * Increase score for Team A by 1 point.
     */
    public void manoTeamA(View v) {
        scoreMaTeamA += 1;
        if (scoreMeTeamA < maxScore) {
            if (scoreMaTeamA < 3) {
                displayManoForTeamA(scoreMaTeamA);
            } else {
                manoClear();
                scoreMeTeamA += 1;
                displayMechaForTeamA(scoreMeTeamA);
            }
        }
    }

    /**
     * Decrease Mecha score for Team A by 1 point.
     */
    public void adjusmentMeTeamA(View v) {
        if (scoreMeTeamA > 0) {
            scoreMeTeamA -= 1;
            displayMechaForTeamA(scoreMeTeamA);
        }
    }

    /**
     * Decrease Mano score for Team A by 1 point.
     */
    public void adjusmentMaTeamA(View v) {
        if (scoreMaTeamA > 0) {
            scoreMaTeamA -= 1;
            displayManoForTeamA(scoreMaTeamA);
        }
    }

    // TEAM B
    /*
    * Increase score for Team B by 9 points.
    */
    public void threeMechasTeamB(View v) {
        if (scoreMeTeamB < maxScore) {
            scoreMeTeamB += 3;
            displayMechaForTeamB(scoreMeTeamB);
            manoClear();
        }
    }

    /*
    * Increase score for Team B by 6 points.
    */

    public void twoMechasTeamB(View v) {
        if (scoreMeTeamB < maxScore) {
            scoreMeTeamB += 2;
            displayMechaForTeamB(scoreMeTeamB);
            manoClear();
        }
    }

    /*
    * Increase score for Team B by 3 points.
    */
    public void mechaTeamB(View v) {
        if (scoreMeTeamB < maxScore) {
            scoreMeTeamB += 1;
            displayMechaForTeamB(scoreMeTeamB);
            manoClear();
        }
    }

    /**
     * Increase score for Team B by 1 point.
     */
    public void manoTeamB(View v) {
        scoreMaTeamB += 1;

        if (scoreMeTeamB < maxScore) {
            if (scoreMaTeamB < 3) {
                displayManoForTeamB(scoreMaTeamB);
            } else {
                manoClear();
                scoreMeTeamB += 1;
                displayMechaForTeamB(scoreMeTeamB);
            }
        }
    }

    /**
     * Decrease score for Mechas Team B by 1 point.
     */
    public void adjusmentMeTeamB(View v) {
        if (scoreMeTeamB > 0) {
            scoreMeTeamB -= 1;
            displayMechaForTeamB(scoreMeTeamB);
        }
    }

    /**
     * Decrease score for Manos Team B by 1 point.
     */
    public void adjusmentMaTeamB(View v) {
        if (scoreMaTeamB > 0) {
            scoreMaTeamB -= 1;
            displayManoForTeamB(scoreMaTeamB);
        }
    }

    /*
    * Clear manos's counter from both teams.
    * */
    public void manoClear() {
        scoreMaTeamA = 0;
        scoreMaTeamB = 0;
        TextView scoreViewA = (TextView) findViewById(R.id.team_a_scoreMa);
        TextView scoreViewB = (TextView) findViewById(R.id.team_b_scoreMa);
        scoreViewA.setText(String.valueOf(scoreMaTeamA));
        scoreViewB.setText(String.valueOf(scoreMaTeamB));
    }

    /*
    * Reset counters for both teams, score color, and restet button message.
    * */
    public void reset(View v) {
        scoreMeTeamA = 0;
        scoreMeTeamB = 0;
        scoreMaTeamA = 0;
        scoreMaTeamB = 0;
        displayMechaForTeamA(scoreMeTeamA);
        displayMechaForTeamB(scoreMeTeamB);
        displayManoForTeamA(scoreMaTeamA);
        displayManoForTeamB(scoreMaTeamB);
        TextView scoreMeViewA = (TextView) findViewById(R.id.team_a_scoreMe);
        TextView scoreMeViewB = (TextView) findViewById(R.id.team_b_scoreMe);
        TextView scoreMaViewA = (TextView) findViewById(R.id.team_a_scoreMa);
        TextView scoreMaViewB = (TextView) findViewById(R.id.team_b_scoreMa);
        scoreMeViewA.setTextColor(Color.parseColor("#000000"));
        scoreMeViewB.setTextColor(Color.parseColor("#000000"));
        scoreMaViewA.setTextColor(Color.parseColor("#000000"));
        scoreMaViewB.setTextColor(Color.parseColor("#000000"));
        Button reset = (Button) findViewById(R.id.resetButton);
        reset.setText(R.string.reset);
    }

    /**
     * Displays the given score for mechas Team A.
     */
    public void displayMechaForTeamA(int score) {
        TextView scoreMeViewA = (TextView) findViewById(R.id.team_a_scoreMe);
        TextView scoreMeViewB = (TextView) findViewById(R.id.team_b_scoreMe);
        TextView scoreMaViewA = (TextView) findViewById(R.id.team_a_scoreMa);
        TextView scoreMaViewB = (TextView) findViewById(R.id.team_b_scoreMa);
        if (score < maxScore) {
            scoreMeViewA.setText(String.valueOf(score));
        } else {
            scoreMeViewA.setText(String.valueOf(score));
            scoreMeViewA.setTextColor(Color.parseColor("#2196F3"));
            scoreMeViewB.setTextColor(Color.parseColor("#F44336"));
            scoreMaViewA.setTextColor(Color.parseColor("#2196F3"));
            scoreMaViewB.setTextColor(Color.parseColor("#F44336"));
            Button reset = (Button) findViewById(R.id.resetButton);
            reset.setText(R.string.newGame);
        }
    }

    /**
     * Displays the given score for mechas in Team B.
     */
    public void displayMechaForTeamB(int score) {
        TextView scoreMeViewA = (TextView) findViewById(R.id.team_a_scoreMe);
        TextView scoreMeViewB = (TextView) findViewById(R.id.team_b_scoreMe);
        TextView scoreMaViewA = (TextView) findViewById(R.id.team_a_scoreMa);
        TextView scoreMaViewB = (TextView) findViewById(R.id.team_b_scoreMa);
        if (score < maxScore) {
            scoreMeViewB.setText(String.valueOf(score));
        } else {
            scoreMeViewB.setText(String.valueOf(score));
            scoreMeViewB.setTextColor(Color.parseColor("#2196F3"));
            scoreMeViewA.setTextColor(Color.parseColor("#F44336"));
            scoreMaViewB.setTextColor(Color.parseColor("#2196F3"));
            scoreMaViewA.setTextColor(Color.parseColor("#F44336"));
            Button reset = (Button) findViewById(R.id.resetButton);
            reset.setText(R.string.newGame);
        }
    }

    /**
     * Displays the given score for manos in Team A
     */
    public void displayManoForTeamA(int score) {
        TextView scoreManoViewA = (TextView) findViewById(R.id.team_a_scoreMa);
        scoreManoViewA.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for manos in Team B
     */

    public void displayManoForTeamB(int score) {
        TextView scoreManoViewB = (TextView) findViewById(R.id.team_b_scoreMa);
        scoreManoViewB.setText(String.valueOf(score));
    }
}