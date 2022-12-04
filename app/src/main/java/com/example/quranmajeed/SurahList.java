package com.example.quranmajeed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SurahList extends AppCompatActivity {

    QDH qdh;
    ListView myListview;
    ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_surah);

        qdh = new QDH();
        myListview = findViewById(R.id.myListView);
        arrayList = new ArrayList<String>();

        for(int i=0; i<qdh.englishSurahNames.length; i++) {
            int j = i + 1;
            arrayList.add(j + ".  " + String.valueOf(qdh.englishSurahNames[i]) + "\n" + String.valueOf(qdh.urduSurahNames[i]));
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);
        myListview.setAdapter(arrayAdapter);

        myListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               String text = "Item" + position + " " + ((TextView) view).getText().toString();
                Toast.makeText(SurahList.this, text, Toast.LENGTH_SHORT).show();
            }
        });
    }
}