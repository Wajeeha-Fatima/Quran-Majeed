package com.example.quranmajeed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuScreen extends AppCompatActivity {
    Button btn, btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_manu);

        btn = findViewById(R.id.button);
        btn1 = findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSurahList();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGitHub("https://github.com/Wajeeha-Fatima/Quran-Majeed.git");
            }
        });
    }
    private void openSurahList() {
        Intent intent = new Intent(this, SurahList.class);
        startActivity(intent);
    }
    public void openGitHub(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }
}