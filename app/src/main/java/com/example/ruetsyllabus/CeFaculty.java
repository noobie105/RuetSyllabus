package com.example.ruetsyllabus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CeFaculty extends AppCompatActivity {

    private Button ce,urp,arch,becm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ce_faculty);
        getSupportActionBar().hide();

        ce = findViewById(R.id.ce);
        urp = findViewById(R.id.urp);
        arch = findViewById(R.id.arch);
        becm = findViewById(R.id.becm);

        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CeFaculty.this, cedept.class);
                startActivity(intent);
            }
        });

        urp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CeFaculty.this, urpdept.class);
                startActivity(intent);
            }
        });

        arch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CeFaculty.this, archdept.class);
                startActivity(intent);
            }
        });

        becm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CeFaculty.this, becmdept.class);
                startActivity(intent);
            }
        });
    }
}