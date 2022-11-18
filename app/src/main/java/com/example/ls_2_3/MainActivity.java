package com.example.ls_2_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    private ArrayList cauntryList =new ArrayList<>();
    private RecyclerView rvCountry;
    private GamesAdapter adapter =new GamesAdapter(cauntryList);
    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvCountry = findViewById(R.id.bbb);
        loaData();
        rvCountry.setAdapter(adapter);

    }

    private void loaData() {
        cauntryList.add("Fortnite");
        cauntryList.add("PUBG");
        cauntryList.add("Minecraft");
        cauntryList.add("Among Us");
        cauntryList.add("Fortnite");
        cauntryList.add("RuneScape");
        cauntryList.add("FIFA 17");
        cauntryList.add("Grand Theft Auto V");
        cauntryList.add("Candy Crush Saga");
        cauntryList.add("World of Tanks");
        cauntryList.add("Tetris");
        cauntryList.add("The Legend of Mir 3");
        cauntryList.add("Games");
    }
}