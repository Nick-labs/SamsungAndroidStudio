package com.example.golfstrim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private TextView textViewResNum;
    private TextView textViewResDenom;
    private EditText editNum1;
    private EditText editDenom1;
    private EditText editNum2;
    private EditText editDenom2;
    private Button button;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResNum = findViewById(R.id.textViewResNum);
        textViewResDenom = findViewById(R.id.textViewResDenom);
        editNum1 = findViewById(R.id.editNum1);
        editDenom1 = findViewById(R.id.editDenom1);
        editNum2 = findViewById(R.id.editNum2);
        editDenom2 = findViewById(R.id.editDenom2);

//        button = findViewById(R.id.button);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Started", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Resumed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Paused", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(this, "destroyed", Toast.LENGTH_SHORT).show();
    }


    public void clickButton(View v) throws Exception {
        int num1 = Integer.parseInt(editNum1.getText().toString());
        int denom1 = Integer.parseInt(editDenom1.getText().toString());
        int num2 = Integer.parseInt(editNum2.getText().toString());
        int denom2 = Integer.parseInt(editDenom2.getText().toString());

        Fraction frac1 = new Fraction(num1, denom1);
        Fraction frac2 = new Fraction(num2, denom2);

        Fraction frac3 = frac1.add(frac2);
        textViewResNum.setText(Integer.toString(frac3.getNumerator()));
        textViewResDenom.setText(Integer.toString(frac3.getDenominator()));
    }
}
