package com.example.madlibs2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    private TextView title;
    private EditText noun;
    private EditText verb;
    private EditText adverb;
    private EditText adjective;
    private EditText food;
    private EditText animal;
    private EditText country;
    private EditText brand;
    private EditText money;
    private EditText noun2;
    private Button go;

    ArrayList<String> story = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = findViewById(R.id.tv_title);
        noun = findViewById(R.id.et_noun);
        verb = findViewById(R.id.et_adverb);
        adverb = findViewById(R.id.et_adverb);
        adjective = findViewById(R.id.et_adjective);
        food = findViewById(R.id.et_food);
        animal = findViewById(R.id.et_animal);
        country = findViewById(R.id.et_country);
        brand = findViewById(R.id.et_brand);
        money = findViewById(R.id.et_money);
        noun2 = findViewById(R.id.et_nountwo);

        go = findViewById(R.id.btn_generate);


        Intent intent = new Intent(this, SecondScreen.class);

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String madlib = " a " + noun.getText() + "appeared outta nowhwere and started " + "eating " + food.getText() + "." ;
                madlib += "\n";
                madlib += "\n";
                madlib += "\n";
                madlib += "\n";

                intent.putExtra("data", madlib);

            }
        });



    }
}