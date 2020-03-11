package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {
//задаём переменные
    EditText etNum1;
    EditText etNum2;

    Button Add;
    Button Sub;
    Button Mult;
    Button Div;

    TextView tResult;


    @Override
    public void onCreate(Bundle value) { //
        super.onCreate(value);
        setContentView(R.layout.activity_main);//устанавливаем содержимое из файла activity_main
//находим элементы класса и присваиваем их к нашим переменным
        etNum1 = (EditText) findViewById(R.id.etNum_1);
        etNum2 = (EditText) findViewById(R.id.etNum_2);

        Add = (Button) findViewById(R.id.Add);
        Sub = (Button) findViewById(R.id.Sub);
        Mult = (Button) findViewById(R.id.Mult);
        Div = (Button) findViewById(R.id.Div);

        tResult = (TextView) findViewById(R.id.tResult);
        //обработчик событий
        Add.setOnClickListener(this);
        Sub.setOnClickListener(this);
        Mult.setOnClickListener(this);
        Div.setOnClickListener(this);

    }

    @Override
    public void onClick(View сhoice) {

        float num1 = 0;
        float num2 = 0;
        float result = 0;

//задаём возврат десятичных чисел
        num1 = Float.parseFloat(etNum1.getText().toString());
        num2 = Float.parseFloat(etNum2.getText().toString());

        switch (сhoice.getId()) {
            case R.id.Add:
                result = num1 + num2; //операция сложения
                break;
            case R.id.Sub:
                result = num1 - num2;//операция вычетания
                break;
            case R.id.Mult:
                result = num1 * num2;//операция умножения
                break;
            case R.id.Div:
               
                    result = num1 / num2;//операция деления
                
                break;
            default:
                break;
        }


        tResult.setText(""+result);//  строка вывода результата
    }

}




