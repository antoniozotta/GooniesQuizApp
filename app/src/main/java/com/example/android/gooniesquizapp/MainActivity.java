package com.example.android.gooniesquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //set score to 0
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Calculate score
     * Add 1 point to score for every correct answer
     **/
    public int determineScore() {

        RadioButton question1answer3 = (RadioButton) findViewById(R.id.question1answer3);
        boolean checkedquestion1answer3 = question1answer3.isChecked();
        if (checkedquestion1answer3) {
            score = score + 1;
        }

        CheckBox question2answer1 = (CheckBox) findViewById(R.id.question2answer1);
        boolean checkedquestion2answer1 = question2answer1.isChecked();
        CheckBox question2answer2 = (CheckBox) findViewById(R.id.question2answer2);
        boolean checkedquestion2answer2 = question2answer2.isChecked();
        if (checkedquestion2answer1 && checkedquestion2answer2) {
            score = score + 1;
        }

        RadioButton question3answer2 = (RadioButton) findViewById(R.id.question3answer2);
        boolean checkedquestion3answer2 = question3answer2.isChecked();
        if (checkedquestion3answer2) {
            score = score + 1;
        }

        EditText name_field = (EditText) findViewById(R.id.name_field);
        String Mouth = name_field.getText().toString();
        if (Mouth.equals("Mouth") ||
                Mouth.equals("mouth")) {
            score = score + 1;
        }

        RadioButton question5answer1 = (RadioButton) findViewById(R.id.question5answer1);
        boolean checkedquestion5answer1 = question5answer1.isChecked();
        if (checkedquestion5answer1) {
            score = score + 1;
        }

        RadioButton question6answer1 = (RadioButton) findViewById(R.id.question6answer1);
        boolean checkedquestion6answer1 = question6answer1.isChecked();
        if (checkedquestion6answer1) {
            score = score + 1;
        }
        return score;
    }
    //Display toast on button click
    public void showScore(View view) {
        score = determineScore();
        if (score == 6) {
            Toast.makeText(MainActivity.this, "Hey you guys!! \nYou got " + score + " answers out of 6!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "You got " + score + " answers out of 6. \nCall yourself a Goonie? \nYou better try again!", Toast.LENGTH_SHORT).show();
        }
        score = 0;
    }
}