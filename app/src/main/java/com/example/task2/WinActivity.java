package com.example.task2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class WinActivity extends AppCompatActivity {

    Button button; // Объявление поля button типа Button

    @Override //
    protected void onCreate(Bundle savedInstanceState) { // Метод при создании Activity
        super.onCreate(savedInstanceState); // Вызов метода onCreate родительского класса
        setContentView(R.layout.activity_win); // Установка макета layout для Activity из файла activity_win.xml

        button = findViewById(R.id.button2); // Получение ссылки на Button и сохранение в переменную button

        button.setOnClickListener(new View.OnClickListener() { // Установка слушателя на нажатие кнопки
            @Override
            public void onClick(View view) { // Метод, вызываемый при нажатии на кнопку
                startActivity(new Intent(WinActivity.this, MainActivity.class)); // Запуск MainActivity
                finish(); // Закрытие WinActivity
            }
        });
    }
}