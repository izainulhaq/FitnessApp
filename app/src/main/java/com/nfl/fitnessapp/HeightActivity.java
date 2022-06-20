package com.nfl.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nfl.fitnessapp.adapters.HeightAdapter;

public class HeightActivity extends AppCompatActivity {

    Button height_btn;
    RecyclerView heightRV;
    HeightAdapter heightAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_height);

        heightAdapter = new HeightAdapter(this);

        heightRV = findViewById(R.id.HeightRV);
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