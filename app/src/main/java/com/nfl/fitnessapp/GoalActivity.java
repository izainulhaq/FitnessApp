package com.nfl.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GoalActivity extends AppCompatActivity implements View.OnClickListener {

    Button weightLoss, buildMuscle,maintain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal);

        weightLoss = findViewById(R.id.weightloss);
        buildMuscle = findViewById(R.id.buildmuscle);
        maintain = findViewById(R.id.maintain);

        weightLoss.setOnClickListener(this);
        buildMuscle.setOnClickListener(this);
        maintain.setOnClickListener(this);

    }

    private void funIntent(){
        Intent it = new Intent(GoalActivity.this,WeightActivity.class);
        startActivity(it);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.weightloss:
                funIntent();
                break;

            case R.id.buildmuscle:
                funIntent();
                break;

            case R.id.maintain:
                funIntent();
        }

    }

}