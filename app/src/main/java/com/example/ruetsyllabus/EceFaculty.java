package com.example.ruetsyllabus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EceFaculty extends AppCompatActivity {

    private Button cse,eee,ete,ece;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ece_faculty);
        getSupportActionBar().hide();

        cse = findViewById(R.id.cse);
        eee = findViewById(R.id.eee);
        ete = findViewById(R.id.ete);
        ece = findViewById(R.id.ece);

        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EceFaculty.this, csedept.class);
                startActivity(intent);
            }
        });

        eee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EceFaculty.this, eeedept.class);
                startActivity(intent);
            }
        });

        ete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EceFaculty.this, etedept.class);
                startActivity(intent);
            }
        });

        ece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EceFaculty.this, ecedept.class);
                startActivity(intent);
            }
        });
    }
}