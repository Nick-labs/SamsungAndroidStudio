package com.example.golfstrim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private TextView textViewRes;
    private EditText editText;
    private EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textViewRes = findViewById(R.id.textViewRes);
        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
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

    public void clickButton(View view) {
        double a, b, res;
        String s1 = editText.getText().toString();
        String s2 = editText2.getText().toString();

        a = Double.parseDouble(s1);
        b = Double.parseDouble(s2);

        res = a + b;

        textViewRes.setText(Double.toString(res));
    }
}
