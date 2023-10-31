package com.example.intenpassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNext;

        btnNext = findViewById(R.id.btnNext);

        Intent iNext;
        iNext = new Intent(MainActivity.this,secondActivity.class);
        iNext.putExtra("title","Home");
        iNext.putExtra("StudentName","Subham");
        iNext.putExtra("RollNumber",336);

        btnNext.setOnClickListener(view -> startActivity(iNext));
    }
}