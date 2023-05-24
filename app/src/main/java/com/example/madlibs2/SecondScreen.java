package com.example.madlibs2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondScreen extends AppCompatActivity {


    private TextView madlib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

      Intent intent = new Intent();
      String display = getIntent().getStringExtra("data");
      madlib.setText(display);
      startActivity(intent);
    }
}