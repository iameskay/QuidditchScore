package com.example.android.quidditchscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int gryffindorScore = 0;
    int slytherinScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayGryffindor(gryffindorScore);
        displaySlytherin(slytherinScore);
    }

    public void displayGryffindor(int score) {
        TextView scoreView = (TextView) findViewById(R.id.gryffindor_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displaySlytherin(int score) {
        TextView scoreView = (TextView) findViewById(R.id.slytherin_score);
        scoreView.setText(String.valueOf(score));
    }

    public void quaffleGryffindor(View view) {
        gryffindorScore = gryffindorScore + 10;
        displayGryffindor(gryffindorScore);
    }

    public void quaffleSlytherin(View view) {
        slytherinScore = slytherinScore + 10;
        displaySlytherin(slytherinScore);
    }

    public void snitchGryffindor(View view) {
        gryffindorScore = gryffindorScore + 30;
        displayGryffindor(gryffindorScore);
    }

    public void snitchSlytherin(View view) {
        slytherinScore = slytherinScore + 30;
        displaySlytherin(slytherinScore);
    }

    public void reset(View view) {
        slytherinScore = 0;
        gryffindorScore = 0;
        displaySlytherin(slytherinScore);
        displayGryffindor(gryffindorScore);
    }
}
