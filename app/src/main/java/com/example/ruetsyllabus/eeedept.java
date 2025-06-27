package com.example.ruetsyllabus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class eeedept extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eeedept);
        getSupportActionBar().hide();

        listView = findViewById(R.id.listview);
        String[] semesters = getResources().getStringArray(R.array.semesters);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(eeedept.this, R.layout.listview_adapter, R.id.textviewId, semesters);
        listView.setAdapter(adapter);

    }
}