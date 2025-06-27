package com.example.ruetsyllabus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MeFaculty extends AppCompatActivity {

    private Button me, ipe, gce, mte, mse, cfpe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me_faculty);
        getSupportActionBar().hide();

        me = findViewById(R.id.me);
        ipe= findViewById(R.id.ipe);
        gce = findViewById(R.id.gce);
        mte = findViewById(R.id.mte);
        mse = findViewById(R.id.mse);
        cfpe = findViewById(R.id.cfpe);

        me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MeFaculty.this, medept.class);
                startActivity(intent);
            }
        });

        ipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MeFaculty.this, ipedept.class);
                startActivity(intent);
            }
        });

        gce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MeFaculty.this, gcedept.class);
                startActivity(intent);
            }
        });

        mse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MeFaculty.this, msedept.class);
                startActivity(intent);
            }
        });

        mte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MeFaculty.this, mtedept.class);
                startActivity(intent);
            }
        });

        cfpe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MeFaculty.this, cfpedept.class);
                startActivity(intent);
            }
        });
    }
}