package com.nfl.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HeightActivity extends AppCompatActivity {

    Button height_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_height);

        height_btn = findViewById(R.id.height_next);

        height_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HeightActivity.this,GenderActivity.class);
                startActivity(intent);
            }
        });

    }
}