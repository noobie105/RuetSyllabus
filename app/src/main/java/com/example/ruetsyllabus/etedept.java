package com.example.ruetsyllabus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class etedept extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etedept);
        getSupportActionBar().hide();

        listView = findViewById(R.id.listview);
        String[] semesters = getResources().getStringArray(R.array.semesters);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(etedept.this, R.layout.listview_adapter, R.id.textviewId, semesters);
        listView.setAdapter(adapter);
    }
}