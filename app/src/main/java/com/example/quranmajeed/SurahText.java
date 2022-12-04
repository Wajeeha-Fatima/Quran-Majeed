package com.example.quranmajeed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SurahText extends AppCompatActivity {
    public QuranArabicText quranArabicText;
    public QDH qdh;
    public String[] getData;
    ListView myListview;
    ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_surah);

        quranArabicText = new QuranArabicText();
        myListview = findViewById(R.id.myListView);
        arrayList = new ArrayList<String>();
        qdh = new QDH();
//        getData = quranArabicText.GetData();

        Intent intent = getIntent();
        String num = intent.getStringExtra("Index");


//        receiver_msg.setText(num);
//        receiver_msg.setText(quranArabicText.GetData(1,3));


//        LinearLayout linearLayout = new LinearLayout(this);
//        setContentView(linearLayout);
//        linearLayout.setOrientation(LinearLayout.VERTICAL);
//        TextView textView = new TextView(this);
//        for( int i = 0; i < QuranArabicText.length; i++ )
//        {
//            textView.append("\n"+String.valueOf(QuranArabicText[i]));
//        }
//        linearLayout.addView(textView);
    }
}