package com.example.ruetsyllabus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class csedept extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csedept);
        getSupportActionBar().hide();

        listView = findViewById(R.id.listview);
        String [] semesters = getResources().getStringArray(R.array.semesters);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(csedept.this, R.layout.listview_adapter, R.id.textviewId, semesters);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position == 0){
                    Intent intent = new Intent(csedept.this, cse11.class);
                    startActivity(intent);
                }
                else if(position == 1){
                    Intent intent = new Intent(csedept.this, cse12.class);
                    startActivity(intent);
                }
                else if(position == 2){
                    Intent intent = new Intent(csedept.this, cse21.class);
                    startActivity(intent);
                }
                else if(position == 3){
                    Intent intent = new Intent(csedept.this, cse22.class);
                    startActivity(intent);
                }
                else if(position == 4){
                    Intent intent = new Intent(csedept.this, cse31.class);
                    startActivity(intent);
                }
                else if(position == 5){
                    Intent intent = new Intent(csedept.this, cse32.class);
                    startActivity(intent);
                }
                else if(position == 6){
                    Intent intent = new Intent(csedept.this, cse41.class);
                    startActivity(intent);
                }
                else if(position == 7){
                    Intent intent = new Intent(csedept.this, cse42.class);
                    startActivity(intent);
                }

            }
        });
    }
}