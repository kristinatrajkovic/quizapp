package com.example.projectquiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.awt.font.TextAttribute;

public class KvizRezultat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kviz_rezultat);

        final AppCompatButton startNewBtn = findViewById(R.id.zapocniNoviKvizBtn);
        final TextView tacanOdgovor = findViewById(R.id.TacanOdgovor);
        final TextView netacanOdgovor = findViewById(R.id.NetacanOdgovor);

        final int getCorrectAnswers = getIntent().getIntExtra("correct", 0);
        final int getIncorrectAnswers = getIntent().getIntExtra("incorrect", 0);

        tacanOdgovor.setText(String.valueOf(getCorrectAnswers));
        netacanOdgovor.setText(String.valueOf(getIncorrectAnswers));

        startNewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KvizRezultat.this, MainActivity.class));
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(KvizRezultat.this, MainActivity.class));
        finish();
    }
}