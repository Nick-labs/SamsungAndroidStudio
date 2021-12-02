package com.example.golfstrim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class TakeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take);
        Intent meshokPoluchen = getIntent();
        String s = meshokPoluchen.getStringExtra("txt");
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}