package com.example.madlibs2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondScreen extends AppCompatActivity {


    private TextView tvMadlib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        tvMadlib = findViewById(R.id.tv_madlib);

      Intent intent = new Intent();
      String display = getIntent().getStringExtra("data");
      tvMadlib.setText(display);

    }
}