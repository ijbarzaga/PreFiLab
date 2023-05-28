package com.example.swapperandchekker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Objects;

public class Checker extends AppCompatActivity {

    TextView checkTheMessage;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checker);

        checkTheMessage = findViewById(R.id.check);

        String first_content = getIntent().getStringExtra("firstCont");
        String second_content = getIntent().getStringExtra("secondCont");

        if (first_content.equals(second_content) ){
            checkTheMessage.setText("SAME!");
        }

        else {
            checkTheMessage.setText("NOT THE SAME!");
        }

    }

}