package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score_a = 0;
    int score_b = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    void threePts(View view){
        score_a = score_a + 3;
        display(score_a);

    }
    void twoPts(View view){
        score_a = score_a + 2;
        display(score_a);

    }
    void freeThrow(View view){
        score_a = score_a + 1;
        display(score_a);

    }
    void threePtsB(View view){
        score_b = score_b + 3;
        displayB(score_b);

    }
    void twoPtsB(View view){
        score_b = score_b + 2;
        displayB(score_b);

    }
    void freeThrowB(View view){
        score_b = score_b + 1;
        displayB(score_b);

    }
    void resetScore(View view){
        score_a = 0;
        score_b = 0;
        display(score_a);
        displayB(score_b);
    }
    void display(int number){
        TextView teamascore = (TextView) findViewById(R.id.team_a_score);
        teamascore.setText(String.valueOf(number));
    }
    void displayB(int number){
        TextView teambscore = (TextView) findViewById(R.id.team_b_score);
        teambscore.setText(String.valueOf(number));
    }
}
