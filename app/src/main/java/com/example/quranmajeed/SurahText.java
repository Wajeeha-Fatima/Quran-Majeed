package com.example.quranmajeed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SurahText extends AppCompatActivity {

    public String[] QuranArabicText = {
            "بِسۡمِ اللّٰہِ الرَّحۡمٰنِ الرَّحِیۡمِ",
            "اَلۡحَمۡدُ لِلّٰہِ رَبِّ الۡعٰلَمِیۡنَ ۙ﴿۱﴾",
            "الرَّحۡمٰنِ الرَّحِیۡمِ ۙ﴿۲﴾",
            "مٰلِکِ یَوۡمِ الدِّیۡنِ ؕ﴿۳﴾",
            "اِیَّاکَ نَعۡبُدُ وَ اِیَّاکَ نَسۡتَعِیۡنُ ؕ﴿۴﴾",
            "اِہۡدِ نَا الصِّرَاطَ الۡمُسۡتَقِیۡمَ ۙ﴿۵﴾",
            "صِرَاطَ الَّذِیۡنَ اَنۡعَمۡتَ عَلَیۡہِمۡ ۙ۬ غَیۡرِ الۡمَغۡضُوۡبِ عَلَیۡہِمۡ وَ لَا الضَّآلِّیۡنَ ٪﴿۷﴾",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_surah);

        LinearLayout linearLayout = new LinearLayout(this);
        setContentView(linearLayout);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        TextView textView = new TextView(this);
        for( int i = 0; i < QuranArabicText.length; i++ )
        {
            textView.append("\n"+String.valueOf(QuranArabicText[i]));
        }
        linearLayout.addView(textView);
    }
}