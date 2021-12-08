package com.example.golfstrim;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private EditText editSurname, editName, editPatron, editGrade, editLetter;
    private Button buttonBegin;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFields();

        buttonBegin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent meshok = new Intent(MainActivity.this, TestActivity.class);
                Student student = new Student(
                        editSurname.getText().toString(),
                        editName.getText().toString(),
                        editPatron.getText().toString(),
                        editGrade.getText().toString(),
                        editLetter.getText().toString());
                meshok.putExtra("student", (Parcelable) student);
                startActivity(meshok);
            }
        });
    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        System.out.println(requestCode + " - " + resultCode);
//        textView.setText(data.getStringExtra("cbTxt"));
//    }

    private void initFields() {
        textView = findViewById(R.id.textView);
        editSurname = findViewById(R.id.editSurname);
        editName = findViewById(R.id.editName);
        editPatron = findViewById(R.id.editPatron);
        editGrade = findViewById(R.id.editGrade);
        editLetter = findViewById(R.id.editLetter);
        buttonBegin = findViewById(R.id.buttonBegin);
    }
}
