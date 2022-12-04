package com.example.quranmajeed;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    public String[] surahNames = {
            "Al-Fatihah",
            "Al-Baqara ",
            "Al-i'Imran ",
            "An-Nisaa ",
            "Al-Maidah ",
            "Al-An'am ",
            "Al-A'raf ",
            "Al-Anfal ",
            "At-Tauba ",
            "Yunus ",
            "Hud ",
            "Yusuf ",
            "Ar-Ra'd ",
            "Ibrahim ",
            "Al-Hijr ",
            "An-Nahl ",
            "Al-Israa ",
            "Al-Kahf ",
            "Maryam ",
            "Ta-ha ",
            "Al-Anbiyaa ",
            "Al-Hajj ",
            "Al-Muminun ",
            "An-Nur ",
            "Al-Furqan ",
            "Ash-Shu'araa ",
            "An-Naml ",
            "Al-Qasas ",
            "Al-Ankabut ",
            "Ar-Rum ",
            "Luqman ",
            "As-Sajda ",
            "Al-Ahzab ",
            "Saba ",
            "Fatir ",
            "Ya-Sin ",
            "As-Saffat ",
            "Sad ",
            "Az-Zumar ",
            "Al-Mu'min ",
            "Ha-Mim ",
            "Ash-Shura ",
            "Az-Zukhruf ",
            "Ad-Dukhan ",
            "Al-Jathiya ",
            "Al-Ahqaf ",
            "Muhammad ",
            "Al-Fat-h ",
            "Al-Hujurat ",
            "Qaf ",
            "Az-Zariyat ",
            "At-Tur ",
            "An-Najm ",
            "Al-Qamar ",
            "Ar-Rahman ",
            "Al-Waqi'a ",
            "Al-Hadid ",
            "Al-Mujadila ",
            "Al-Hashr ",
            "Al-Mumtahana ",
            "As-Saff ",
            "Al-Jumu'a ",
            "Al-Munafiqun ",
            "At-Tagabun ",
            "At-Talaq ",
            "At-Tahrim ",
            "Al-Mulk ",
            "Al-Qalam ",
            "Al-Haqqa ",
            "Al-Ma'arij ",
            "Nuh ",
            "Al-Jinn ",
            "Al-Muzzammil ",
            "Al-Muddathth ",
            "Al-Qiyamat ",
            "Ad-Dahr ",
            "Al-Mursalat ",
            "An-Nabaa ",
            "An-Nazi'at ",
            "Abasa ",
            "At-Takwir ",
            "Al-Infitar ",
            "Al-Mutaffife ",
            "Al-Inshiqaq ",
            "Al-Buruj ",
            "At-Tariq ",
            "Al-A'la ",
            "Al-Gashiya ",
            "Al-Fajr ",
            "Al-Balad ",
            "Ash-Shams ",
            "Al-Lail ",
            "Adh-Dhuha ",
            "Al-Sharh ",
            "At-Tin ",
            "Al-Alaq ",
            "Al-Qadr ",
            "Al-Baiyina ",
            "Al-Zalzalah ",
            "Al-Adiyat ",
            "Al-Qari'a ",
            "At-Takathur ",
            "Al-Asr ",
            "Al-Humaza ",
            "Al-Fil ",
            "Quraish ",
            "Al-Ma'un ",
            "Al-Kauthar ",
            "Al-Kafirun ",
            "An-Nasr ",
            "Al-Lahab ",
            "Al-Ikhlas ",
            "Al-Falaq ",
            "Al-Nas "
    };

    public String[] urduNames = {
            "الفاتحۃ",
            "البقرۃ",
            "آل عمران",
            "النسآء",
            "المآئدۃ",
            "الانعام",
            "الاعراف",
            "الانفال",
            "التوبۃ",
            "یونس",
            "ھود",
            "یوسف",
            "الرعد",
            "ابراھیم",
            "الحجر",
            "النحل",
            "الاسراء",
            "الکہف",
            "مریم",
            "طٰہٰ",
            "الانبیآء",
            "الحج",
            "المؤمنون",
            "النور",
            "الفرقان",
            "الشعراء",
            "النمل",
            "القصص",
            "العنکبوت",
            "الروم",
            "لقمٰن",
            "السجدۃ",
            "الاحزاب",
            "سبا",
            "فاطر",
            "یٰسٓ",
            "الصّٰفّٰت",
            "صٓ",
            "الزمر",
            "الغافر",
            "فصلت",
            "الشُّورٰی",
            "الزُّخرُف",
            "الدُّخَان",
            "الجاثیہ",
            "الاحقاف",
            "محمد",
            "الفتح",
            "الحجرات",
            "قٓ",
            "الذّٰریٰت",
            "الطّور",
            "النجم",
            "القمر",
            "الرحمٰن",
            "الواقعۃ",
            " الحدید",
            "المجادلۃ",
            "الحشر",
            " الممتحنۃ",
            "الصّف",
            "الجُمعۃ",
            "المُنٰفِقُون",
            " التّغابن",
            "الطّلاق",
            "التحریم",
            "الملک",
            "القلم",
            " الحاقہ",
            "المعارج",
            "نُوح",
            "الجن",
            "المزّمّل",
            "المدّثّر",
            "القیٰمۃ",
            "الانسان",
            "المرسلٰت",
            "النَّبَاِ",
            "النّٰزِعٰتِ",
            "عَبَسَ",
            " التَّکوِیر",
            " الاِنفِطَار",
            "المُطَفِّفِین",
            "الاِنشِقَاق",
            "البُرُوج",
            "الطَّارق",
            "الاَعلیٰ",
            "الغَاشِیَۃ",
            "الفجر",
            "البلد",
            " الشَّمس",
            "الَّیل",
            "الضُّحٰی",
            "الم نشرح",
            "التّین",
            "العَلَق",
            " القدر",
            "البیّنۃ",
            "الزّلزال",
            "العٰدیٰت",
            " القارعۃ",
            "التّکاثُر",
            " العصر",
            "الھُمَزَۃ",
            "الفِیل",
            "قُرَیش",
            "المَاعُون",
            "الکوثر",
            "الکٰفرون",
            "النَّصَر",
            "اللَّھب",
            "الاخلاص",
            "الفَلَق",
            " النَّاس"
    };

    ListView listview;
    ArrayList<Integer> arrayList = new ArrayList<>();

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        LinearLayout linearLayout = new LinearLayout(this);
        setContentView(linearLayout);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        TextView textView = new TextView(this);
        for( int i = 0; i < 1; i++ )
        {
            int j = i + 1;
            textView.append("\n" + j + ". " +String.valueOf(surahNames[i]) +"\n" + String.valueOf(urduNames[i]) + "\n");
            linearLayout.addView(textView);
        }

//        ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.constraint);
//        int height = 70;
//
//        for(int i=0;i<surahNames.length;i++)
//        {
//            int j = i + 1;
//            TextView txt = new TextView(this);
//            txt.append("\n" + j + ". " +String.valueOf(surahNames[i]) +"\n" + String.valueOf(urduNames[i]) + "\n");
//            txt.getLayoutParams().height = height;
//            layout.addView(txt);
//        }

        listview = findViewById(R.id.listview);
        com.example.quranmajeed.ListAdapter listAdapter = new com.example.quranmajeed.ListAdapter(MainActivity3.this, arrayList);
        listview.setAdapter(listAdapter);

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

//        textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openActivity4();
////                Toast.makeText(MainActivity3.this, "Hello "+textView.getText(), Toast.LENGTH_SHORT).show();
//            }
//        });
    }
    private void openActivity4() {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
}