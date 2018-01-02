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
        displayMechaForTeamA(scoreMechaTeamA);
        displayMechaForTeamB(scoreMechaTeamB);
    }

    private int scoreMechaTeamA = 0;
    private int scoreManoTeamA = 0;
    private int scoreMechaTeamB = 0;
    private int scoreManoTeamB = 0;
    private int maxScore = 27;

    /**
     * Increase score for Team A by 9 points.
     */
    public void threeMechasTeamA(View v) {
        if (scoreMechaTeamA < maxScore) {
            scoreMechaTeamA += 3;
            displayMechaForTeamA(scoreMechaTeamA);
            manoClear();
        }
    }

    /**
     * Increase score for Team A by 6 points.
     */
    public void twoMechasTeamA(View v) {
        if (scoreMechaTeamA < maxScore) {
            scoreMechaTeamA += 2;
            displayMechaForTeamA(scoreMechaTeamA);
            manoClear();
        }
    }

    /**
     * Increase score for Team A by 3 point.
     */
    public void mechaTeamA(View v) {
        if (scoreMechaTeamA < maxScore) {
            scoreMechaTeamA += 1;
            displayMechaForTeamA(scoreMechaTeamA);
            manoClear();
        }

    }

    /**
     * Increase score for Team A by 1 point.
     */
    public void manoTeamA(View v) {
        scoreManoTeamA += 1;
        if (scoreMechaTeamA < maxScore) {
            if (scoreManoTeamA < 3) {
                displayManoForTeamA(scoreManoTeamA);
            } else {
                manoClear();
                scoreMechaTeamA += 1;
                displayMechaForTeamA(scoreMechaTeamA);
            }
        }
    }

    /**
     * Decrease Mecha score for Team A by 1 point.
     */
    public void adjusmentMeTeamA(View v) {
        if (scoreMechaTeamA > 0) {
            scoreMechaTeamA -= 1;
            displayMechaForTeamA(scoreMechaTeamA);
        }
    }

    /**
     * Decrease Mano score for Team A by 1 point.
     */
    public void adjusmentMaTeamA(View v) {
        if (scoreManoTeamA > 0) {
            scoreManoTeamA -= 1;
            displayManoForTeamA(scoreManoTeamA);
        }
    }

    // TEAM B
    /*
    * Increase score for Team B by 9 points.
    */
    public void threeMechasTeamB(View v) {
        if (scoreMechaTeamB < maxScore) {
            scoreMechaTeamB += 3;
            displayMechaForTeamB(scoreMechaTeamB);
            manoClear();
        }
    }

    /*
    * Increase score for Team B by 6 points.
    */

    public void twoMechasTeamB(View v) {
        if (scoreMechaTeamB < maxScore) {
            scoreMechaTeamB += 2;
            displayMechaForTeamB(scoreMechaTeamB);
            manoClear();
        }
    }

    /*
    * Increase score for Team B by 3 points.
    */
    public void mechaTeamB(View v) {
        if (scoreMechaTeamB < maxScore) {
            scoreMechaTeamB += 1;
            displayMechaForTeamB(scoreMechaTeamB);
            manoClear();
        }
    }

    /**
     * Increase score for Team B by 1 point.
     */
    public void manoTeamB(View v) {
        scoreManoTeamB += 1;

        if (scoreMechaTeamB < maxScore) {
            if (scoreManoTeamB < 3) {
                displayManoForTeamB(scoreManoTeamB);
            } else {
                manoClear();
                scoreMechaTeamB += 1;
                displayMechaForTeamB(scoreMechaTeamB);
            }
        }
    }

    /**
     * Decrease score for Mechas Team B by 1 point.
     */
    public void adjusmentMeTeamB(View v) {
        if (scoreMechaTeamB > 0) {
            scoreMechaTeamB -= 1;
            displayMechaForTeamB(scoreMechaTeamB);
        }
    }

    /**
     * Decrease score for Manos Team B by 1 point.
     */
    public void adjusmentMaTeamB(View v) {
        if (scoreManoTeamB > 0) {
            scoreManoTeamB -= 1;
            displayManoForTeamB(scoreManoTeamB);
        }
    }

    /*
    * Clear manos counter from both teams.
    * */
    public void manoClear() {
        scoreManoTeamA = 0;
        scoreManoTeamB = 0;
        TextView scoreViewA = (TextView) findViewById(R.id.team_a_scoreMa);
        TextView scoreViewB = (TextView) findViewById(R.id.team_b_scoreMa);
        scoreViewA.setText(String.valueOf(scoreManoTeamA));
        scoreViewB.setText(String.valueOf(scoreManoTeamB));
    }

    /*
    * Reset counters for both teams, score color, and reset button message.
    * */
    public void reset(View v) {
        scoreMechaTeamA = 0;
        scoreMechaTeamB = 0;
        scoreManoTeamA = 0;
        scoreManoTeamB = 0;
        displayMechaForTeamA(scoreMechaTeamA);
        displayMechaForTeamB(scoreMechaTeamB);
        displayManoForTeamA(scoreManoTeamA);
        displayManoForTeamB(scoreManoTeamB);
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