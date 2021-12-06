package com.example.golfstrim;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button go, take, comeback;
    private EditText textToSend;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFields();

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, GoActivity.class);
                startActivity(i);
            }
        });

        take.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent meshok = new Intent(MainActivity.this, TakeActivity.class);
                meshok.putExtra("txt", textToSend.getText().toString());
                startActivity(meshok);
            }
        });

        comeback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ComebackActivity.class);
                startActivityForResult(i, 1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        System.out.println(requestCode + " - " + resultCode);
        tv.setText(data.getStringExtra("cbTxt"));
    }

    private void initFields() {
        go = findViewById(R.id.go);
        take = findViewById(R.id.take);
        comeback = findViewById(R.id.comeback);
        textToSend = findViewById(R.id.textToSend);
        tv = findViewById(R.id.tv);
    }
}

// joke