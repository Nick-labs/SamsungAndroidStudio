package com.example.golfstrim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView hitv;
//    private EditText editText1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println(getResources().getString(R.string.app_name));
        System.out.println("XMLGROUP1");
        hitv = this.findViewById(R.id.hitv);
        hitv.setBackgroundColor(getResources().getColor(R.color.yandexcolor));
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

    public void click1(View view) {
        System.out.println("click1");
        Toast.makeText(this, "Ну так пусть сбудутся все его мечты",
                Toast.LENGTH_SHORT).show();
    }
}
