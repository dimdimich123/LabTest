package ru.chepurkoempty.lab1tests;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public int max(int x, int y){
        return x < y ? y : x;
    }

    public int min(int x, int y){
        return x < y ? x : y;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }
}