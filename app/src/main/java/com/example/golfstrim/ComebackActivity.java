package com.example.golfstrim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ComebackActivity extends AppCompatActivity {
    private EditText comebackText;
    private Button comebackButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comeback);
        comebackButton = findViewById(R.id.comebackButton);
        comebackText = findViewById(R.id.comebackText);
        comebackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent comebackIntent = new Intent();
                comebackIntent.putExtra("cbTxt", comebackText.getText().toString());
                setResult(1, comebackIntent);
                finish();
            }
        });
    }
}