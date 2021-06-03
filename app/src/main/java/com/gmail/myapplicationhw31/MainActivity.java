package com.gmail.myapplicationhw31;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private TextView enterText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    private void initViews() {
        initTextViews();
        initButtons();
    }

    private void initTextViews() {
        enterText = findViewById(R.id.count_text);
    }

    private void initButtons() {
        Button btn0 = findViewById(R.id.key_0);
        Button btn1 = findViewById(R.id.key_1);
        Button btn2 = findViewById(R.id.key_2);
        Button btn3 = findViewById(R.id.key_3);
        Button btn4 = findViewById(R.id.key_4);
        Button btn5 = findViewById(R.id.key_5);
        Button btn6 = findViewById(R.id.key_6);
        Button btn7 = findViewById(R.id.key_7);
        Button btn8 = findViewById(R.id.key_8);
        Button btn9 = findViewById(R.id.key_9);
        Button btnDot = findViewById(R.id.key_dot);
        Button btnPlus = findViewById(R.id.key_plus);
        Button btnMinus = findViewById(R.id.key_minus);
        Button btnDv = findViewById(R.id.key_divided);
        Button btnX = findViewById(R.id.key_X);
        Button btnEq = findViewById(R.id.key_equals);

    }

    public void clickBtn (Button btn) {btn.setOnClickListener(this);}

    @Override
    public void onClick(View v) {
        if (view.getId() == R.id.key_0){
            addEnterText('0');
        }
        if (view.getId() == R.id.key_1){
            addEnterText('1');
        }
        if (view.getId() == R.id.key_2){
            addEnterText('2');
        }
        if (view.getId() == R.id.key_3){
            addEnterText('3');
        }
        if (view.getId() == R.id.key_4){
            addEnterText('4');
        }
        if (view.getId() == R.id.key_5){
            addEnterText('5');
        }
        if (view.getId() == R.id.key_6){
            addEnterText('6');
        }
        if (view.getId() == R.id.key_7){
            addEnterText('7');
        }
        if (view.getId() == R.id.key_8){
            addEnterText('8');
        }
        if (view.getId() == R.id.key_9){
            addEnterText('9');
        }

    }
}