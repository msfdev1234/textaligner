package com.example.textaligner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.textaligner.Adapters.SentenceAdapter;
import com.example.textaligner.LayoutManager.CustomLayoutManager;
import com.google.android.flexbox.FlexDirection;
import com.google.android.flexbox.FlexWrap;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.flexbox.JustifyContent;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> list=new ArrayList<String>();
        //Adding elements in the List
        list.add("بِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيم \u06DD ِ");
        list.add("الحَمدُ لِلَّهِ رَبِّ العالَمينَ \u06DD ");
        list.add("الرَّحمٰنِ الرَّحيم \u06DD ِ");
        list.add("مالِكِ يَومِ الدّين \u06DD ِ");
        list.add("إِيَّاكَ نَعْبُدُ وَإِيَّاكَ نَسْتَعِينُ \u06DD ِ");
        list.add("اهْدِنَا الصِّرَاطَ الْمُسْتَقِيمَُ \u06DD ِ");
        list.add("صِراطَ الَّذينَ أَنعَمتَ عَلَيهِم غَيرِ المَغضوبِ عَلَيهِم وَلَا الضّالّي ِ\u06DD ");

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//
        FlexboxLayoutManager layoutManager1 = new FlexboxLayoutManager(this);
        layoutManager1.setFlexDirection(FlexDirection.COLUMN);
        layoutManager1.setJustifyContent(JustifyContent.FLEX_START);
        layoutManager1.setFlexDirection(FlexDirection.ROW_REVERSE);
        layoutManager1.setFlexWrap(FlexWrap.WRAP);

        recyclerView.setLayoutManager(layoutManager1);
        SentenceAdapter adapter = new SentenceAdapter(list);
        recyclerView.setAdapter(adapter);


//        CustomLayoutManager customLayoutManager = new CustomLayoutManager(this);
//
//        recyclerView.setLayoutManager(customLayoutManager);
//        recyclerView.setAdapter(new SentenceAdapter(list));

    }
}