package com.example.golfstrim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class TestActivity extends AppCompatActivity {
    private RadioButton radioButtonYes;
    private RadioButton radioButtonNo;
    private TextView textViewStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        radioButtonYes = findViewById(R.id.radioButtonYes);
        radioButtonNo = findViewById(R.id.radioButtonNo);
        textViewStudent = findViewById(R.id.textViewStudent);

        radioButtonYes.setOnClickListener(radioButtonClickListener);
        radioButtonNo.setOnClickListener(radioButtonClickListener);

        Intent meshokPoluchen = getIntent();
        Student student = (Student) meshokPoluchen.getParcelableExtra("student");
        textViewStudent.setText("Студент: " + student.getFio() + " " + student.getGrade() + "" + student.getLetter());
    }

    View.OnClickListener radioButtonClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            RadioButton rb = (RadioButton) v;
            switch (rb.getId()) {
                case R.id.radioButtonYes:
                    Toast.makeText(getBaseContext(), "Правильно", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.radioButtonNo:
                    Toast.makeText(getBaseContext(), "Неправильно", Toast.LENGTH_SHORT).show();
                    break;
                default:
                    break;
            }
        }
    };


}