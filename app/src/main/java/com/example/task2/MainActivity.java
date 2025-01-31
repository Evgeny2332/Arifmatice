package com.example.task2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editText; // Объявление переменной editText типа EditText
    Button button; // Объявление переменной button типа Button

    Switch mySwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // Вызов метода onCreate родительского класса
        setContentView(R.layout.activity_main); // Установка макета layout для Activity из файла activity_main.xml

        editText = findViewById(R.id.editTextText2); // Получение ссылки на EditText по его ID из макета и сохранение в переменную editText
        button = findViewById(R.id.button); // Получение ссылки на Button и сохранение в переменную button
        mySwitch = findViewById(R.id.mySwitch);

        button.setOnClickListener(new View.OnClickListener() { // Установка слушателя на нажатие кнопки
            @Override
            public void onClick(View view) { // Метод, вызываемый при нажатии на кнопку
                String edit = editText.getText().toString(); // Получение текста из EditText и преобразование его в строку
                if (edit.isEmpty()){ // Проверка, является ли строка edit пустой
                    Toast.makeText(MainActivity.this, "Поле пустое", Toast.LENGTH_SHORT).show(); // Отображение всплывающего сообщения, если поле пустое
                } else { // Если поле не пустое
                    if (Integer.parseInt(edit) == 4) { // Преобразование строки в целое число и сравнение с числом 4
                        startActivity(new Intent(MainActivity.this, WinActivity.class)); // Запуск WinActivity
                        finish(); // Закрытие MainActivity
                    } else { // Если число не равно 4
                        startActivity(new Intent(MainActivity.this, LoseActivity.class)); // Запуск LoseActivity
                        finish(); // Закрытие MainActivity
                    }
                }
            }
        });
        mySwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    mySwitch.setText("Вкл");
                }
                else{
                    mySwitch.setText("Выкл");
                }
            }
        });


    }

}