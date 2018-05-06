package com.example.android.abnd_project2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int pointsPlayerA = 0;
    int pointsPlayerB = 0;
    int acesPlayerA = 0;
    int acesPlayerB = 0;
    int faultsPlayerA = 0;
    int faultsPlayerB = 0;
    TextView faultViewA;
    TextView pointsViewA;
    TextView acesViewA;
    TextView faultViewB;
    TextView pointsViewB;
    TextView acesViewB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        faultViewA = (TextView) findViewById(R.id.player_a_faults);
        pointsViewA = (TextView) findViewById(R.id.player_a_points);
        acesViewA = (TextView) findViewById(R.id.player_a_aces);
        faultViewB = (TextView) findViewById(R.id.player_b_faults);
        pointsViewB = (TextView) findViewById(R.id.player_b_points);
        acesViewB = (TextView) findViewById(R.id.player_b_aces);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        if (savedInstanceState != null) {
            // Save our values
            savedInstanceState.putInt("pointsPlayerA", pointsPlayerA);
            savedInstanceState.putInt("pointsPlayerB", pointsPlayerB);
            savedInstanceState.putInt("acesPlayerA", acesPlayerA);
            savedInstanceState.putInt("acesPlayerB", acesPlayerB);
            savedInstanceState.putInt("faultsPlayerA", faultsPlayerA);
            savedInstanceState.putInt("faultsPlayerB", faultsPlayerB);
        }

    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        if (savedInstanceState != null) {
            pointsPlayerA = savedInstanceState.getInt("pointsPlayerA");
            pointsPlayerB = savedInstanceState.getInt("pointsPlayerB");
            acesPlayerA = savedInstanceState.getInt("acesPlayerA");
            acesPlayerB = savedInstanceState.getInt("acesPlayerB");
            faultsPlayerA = savedInstanceState.getInt("faultsPlayerA");
            faultsPlayerB = savedInstanceState.getInt("faultsPlayerB");
            displayPointsForPlayerA(pointsPlayerA);
            displayAcesForPlayerA(acesPlayerA);
            displayFaultsForPlayerA(faultsPlayerA);
            displayPointsForPlayerB(pointsPlayerB);
            displayAcesForPlayerB(acesPlayerB);
            displayFaultsForPlayerB(faultsPlayerB);
        }
    }

    /**
     * Add a point for Player A.
     */
    public void addPointForPlayerA(View v) {

        pointsPlayerA = pointsPlayerA + 1;
        displayPointsForPlayerA(pointsPlayerA);
    }

    /**
     * Add to the number of Aces for Player A.
     */
    public void addAceForPlayerA(View v) {

        acesPlayerA = acesPlayerA + 1;
        displayAcesForPlayerA(acesPlayerA);
    }

    /**
     * Add to the number of Faults for Player A.
     */
    public void addFaultForPlayerA(View v) {

        faultsPlayerA = faultsPlayerA + 1;
        displayFaultsForPlayerA(faultsPlayerA);
    }

    /**
     * Add a point for Player B.
     */
    public void addPointForPlayerB(View v) {

        pointsPlayerB = pointsPlayerB + 1;
        displayPointsForPlayerB(pointsPlayerB);
    }

    /**
     * Add to the number of Aces for Player B.
     */
    public void addAceForPlayerB(View v) {

        acesPlayerB = acesPlayerB + 1;
        displayAcesForPlayerB(acesPlayerB);
    }

    /**
     * Add to the number of Faults for Player B.
     */
    public void addFaultForPlayerB(View v) {

        faultsPlayerB = faultsPlayerB + 1;
        displayFaultsForPlayerB(faultsPlayerB);
    }

    /**
     * Resets the pointes, aces, and faults
     */
    public void resetAll(View v) {

        pointsPlayerA = 0;
        acesPlayerA = 0;
        faultsPlayerA = 0;
        pointsPlayerB = 0;
        acesPlayerB = 0;
        faultsPlayerB = 0;
        displayPointsForPlayerA(pointsPlayerA);
        displayAcesForPlayerA(acesPlayerA);
        displayFaultsForPlayerA(faultsPlayerA);
        displayPointsForPlayerB(pointsPlayerB);
        displayAcesForPlayerB(acesPlayerB);
        displayFaultsForPlayerB(faultsPlayerB);
    }

    /**
     * Displays the number of set points for Player A.
     */
    public void displayPointsForPlayerA(int points) {
        pointsViewA.setText(String.valueOf(points));
    }

    /**
     * Displays the number of aces for Player A.
     */
    public void displayAcesForPlayerA(int aces) {
        acesViewA.setText(String.valueOf(aces));
    }

    /**
     * Displays the number of faults for Player A.
     */
    public void displayFaultsForPlayerA(int faults) {
        faultViewA.setText(String.valueOf(faults));
    }

    /**
     * Displays the number of set points for Player A.
     */
    public void displayPointsForPlayerB(int points) {
        pointsViewB.setText(String.valueOf(points));
    }

    /**
     * Displays the number of aces for Player A.
     */
    public void displayAcesForPlayerB(int aces) {

        acesViewB.setText(String.valueOf(aces));
    }

    /**
     * Displays the number of faults for Player A.
     */
    public void displayFaultsForPlayerB(int faults) {
        faultViewB.setText(String.valueOf(faults));
    }

}
