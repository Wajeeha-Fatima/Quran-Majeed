package com.example.quranmajeed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuScreen extends AppCompatActivity {

    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_menu);

        btn1 = findViewById(R.id.indexBtn);
        btn2 = findViewById(R.id.searchBtn);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openSurahList();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInputScreen();
            }
        });
    }

    private void openSurahList() {
        Intent intent = new Intent(this, SurahList.class);
        startActivity(intent);
    }
    private void openInputScreen() {
        Intent intent = new Intent(this, SurahList.class);
        startActivity(intent);
    }
}