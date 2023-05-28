package com.example.swapperandchekker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button theSwapButton, theCheckButton;
    EditText theFirstContent, theSecondContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        theCheckButton = findViewById(R.id.checkinput);
        theCheckButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String theFirstText = theFirstContent.getText().toString();
                String theSecondText = theSecondContent.getText().toString();

                Intent intent = new Intent(MainActivity.this, Checker.class);
                intent.putExtra("firstCont", theFirstText);
                intent.putExtra("secondCont", theSecondText);

                startActivity(intent);
            }
        });

        theFirstContent =findViewById(R.id.FirstContent);
        theSecondContent = findViewById(R.id.SecondContent);
        theSwapButton =findViewById(R.id.swapinput);
        theSwapButton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                String getTheSecond = theFirstContent.getText().toString();
                theFirstContent.setText(theSecondContent.getText().toString());
                theSecondContent.setText(getTheSecond);
            }

        });

    }

}
