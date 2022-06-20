package com.nfl.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nfl.fitnessapp.adapters.WeightAdapter;

public class WeightActivity extends AppCompatActivity {

    Button weight_btn;
    RecyclerView weightRV;

    WeightAdapter weightAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

        weightAdapter = new WeightAdapter(this);

        weight_btn = findViewById(R.id.weight_next);
        weightRV = findViewById(R.id.WeightRV);

        weight_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(WeightActivity.this,HeightActivity.class);
                startActivity(intent);

            }
        });

    }
}