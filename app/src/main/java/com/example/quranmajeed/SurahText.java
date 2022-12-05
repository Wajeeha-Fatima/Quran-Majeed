package com.example.quranmajeed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SurahText extends AppCompatActivity {
    QDH qdh;
    TextView surahText;
    QuranArabicText quranArabicText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.surah_text);

        surahText = findViewById(R.id.textView);

        qdh = new QDH();
        quranArabicText = new QuranArabicText();
        String[] quranText = quranArabicText.QuranArabicText;
        int number = getIntent().getIntExtra("Number", 0);
//        surahText.setText(Integer.toString(number));
//        Toast.makeText(this, "number is " +number+1, Toast.LENGTH_SHORT).show();
    }
}