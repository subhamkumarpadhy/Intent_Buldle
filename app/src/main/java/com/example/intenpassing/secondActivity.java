package com.example.intenpassing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Objects;

public class secondActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Toolbar toolbar = findViewById(R.id.toolbar);
        Intent getAct = getIntent();
        String title = getAct.getStringExtra("title");
        String studentName = getAct.getStringExtra("StudentName");
        int rollNo = getAct.getIntExtra("RollNumber", 0);


        TextView txtStudent;
        txtStudent = findViewById(R.id.txtStudent);
        txtStudent.setText("RollNo: " + rollNo + "\n Name: " + studentName);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle(title);
    }
}