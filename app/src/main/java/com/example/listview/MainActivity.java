package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        setTitle("LISTVIEW");
        arrayList.add("C++");
        arrayList.add("C");
        arrayList.add("JAVA");
        arrayList.add("C#");
        arrayList.add("PYTHON");
        arrayList.add("JAVASCRIPT");
        arrayList.add("HTML");
        arrayList.add("CSS");
        arrayList.add("KOTLIN");
        arrayList.add("C");
        arrayList.add("C#");
        arrayList.add("PYTHON");
        arrayList.add("JAVASCRIPT");
        arrayList.add("HTML");
        arrayList.add("CSS");
        arrayList.add("KOTLIN");
        arrayList.add("C");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                    Toast.makeText(getApplicationContext(), "Item at 0 clicked", Toast.LENGTH_SHORT).show();
                } else if (position == 1) {
                    Toast.makeText(getApplicationContext(), "Item at 1 Clicked", Toast.LENGTH_SHORT).show();
                } else if (position == 2) {
                    Toast.makeText(getApplicationContext(), "Item at 2Clicked", Toast.LENGTH_SHORT).show();
                } else if (position == 3) {
                    Toast.makeText(getApplicationContext(), "Item at 3 Clicked", Toast.LENGTH_SHORT).show();
                } else if (position == 5) {
                    Toast.makeText(getApplicationContext(), "Item at 5 Clicked", Toast.LENGTH_SHORT).show();
                } else if (position == 6) {
                    Toast.makeText(getApplicationContext(), "Item at 6 Clicked", Toast.LENGTH_SHORT).show();
                } else if (position == 7) {
                    Toast.makeText(getApplicationContext(), "Item at 7 Clicked", Toast.LENGTH_SHORT).show();
                } else if (position == 8) {
                    Toast.makeText(getApplicationContext(), "Item at 8 Clicked", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}