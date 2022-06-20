package com.nfl.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GenderActivity extends AppCompatActivity implements View.OnClickListener {

    Button malebtn, femalebtn, otherbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);

        malebtn = findViewById(R.id.malebtn);
        femalebtn = findViewById(R.id.femalebtn);
        otherbtn = findViewById(R.id.otherbtn);

        malebtn.setOnClickListener(this);
        femalebtn.setOnClickListener(this);
        otherbtn.setOnClickListener(this);

    }

    private void funIntent(){
        Intent intent = new Intent(GenderActivity.this,UserInfoActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.malebtn:

            case R.id.femalebtn:

            case R.id.otherbtn:
                funIntent();
                break;
        }
    }
}