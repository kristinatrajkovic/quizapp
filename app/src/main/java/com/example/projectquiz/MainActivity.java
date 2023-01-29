package com.example.projectquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String selectedTopicName = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout java = findViewById(R.id.javaLayout);
        final LinearLayout php = findViewById(R.id.phpLayout);
        final LinearLayout html = findViewById(R.id.htmlLayout);
        final LinearLayout android = findViewById(R.id.androidLayout);

        final Button startBtn = findViewById(R.id.startQuizBtn);


        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "java";

                java.setBackgroundResource(R.drawable.file);

                php.setBackgroundResource(R.drawable.white);
                html.setBackgroundResource(R.drawable.white);
                android.setBackgroundResource(R.drawable.white);



            }
        });

        php.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "php";

                php.setBackgroundResource(R.drawable.file);

                java.setBackgroundResource(R.drawable.white);
                html.setBackgroundResource(R.drawable.white);
                android.setBackgroundResource(R.drawable.white);

            }
        });

        html.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "html";

                html.setBackgroundResource(R.drawable.file);

                php.setBackgroundResource(R.drawable.white);
                java.setBackgroundResource(R.drawable.white);
                android.setBackgroundResource(R.drawable.white);
            }
        });

        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "android";

                android.setBackgroundResource(R.drawable.file);

                php.setBackgroundResource(R.drawable.white);
                java.setBackgroundResource(R.drawable.white);
                java.setBackgroundResource(R.drawable.white);
            }
        });

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(selectedTopicName.isEmpty()){
                    Toast.makeText(MainActivity.this, "Molimo Vas izaberite temu", Toast.LENGTH_SHORT).show();
                }
                else{

                    Intent intent = new Intent(MainActivity.this, KvizActivity.class);
                    intent.putExtra("selectedTopic", selectedTopicName);
                    startActivity(intent);

                }
            }
        });

    }
}


