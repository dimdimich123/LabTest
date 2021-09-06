package ru.chepurkoempty.lab1tests;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    /**
     * max (Максимум) - возвращает максимальное значение из переданных параметров
     * @param x - целочисленоя переменная
     * @param y - целочисленоя переменная
     */
    public int max(int x, int y) {
        return x < y ? y : x;
    }

    /**
     * min (Минимум) - возвращает минимальное значение из переданных параметров
     * @param x - целочисленоя переменная
     * @param y - целочисленоя переменная
     */
    public int min(int x, int y){
        return x < y ? x : y;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }
}