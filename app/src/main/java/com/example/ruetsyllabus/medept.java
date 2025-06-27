package com.example.ruetsyllabus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class medept extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medept);
        getSupportActionBar().hide();

        listView = findViewById(R.id.listview);
        String [] semesters = getResources().getStringArray(R.array.semesters);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(medept.this, R.layout.listview_adapter, R.id.textviewId, semesters);
        listView.setAdapter(adapter);
    }
}