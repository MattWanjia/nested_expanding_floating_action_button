package com.example.fabtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton main, behind, above, above1, above2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        above1 = findViewById(R.id.aboveFAB1);
        above1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "FAB 3", Toast.LENGTH_SHORT).show();
            }
        });

        above2 = findViewById(R.id.aboveFAB2);
        above2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "FAB 4", Toast.LENGTH_SHORT).show();
            }
        });

        main = findViewById(R.id.mainFAB);
        behind = findViewById(R.id.behindFAB);
        behind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "BEHIND FAB", Toast.LENGTH_SHORT).show();
            }
        });

        above = findViewById(R.id.aboveFAB);
        above.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "ABOVE FAB", Toast.LENGTH_SHORT).show();
            }
        });

        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main.setVisibility(View.INVISIBLE);
                behind.setVisibility(View.VISIBLE);
                above.setVisibility(View.VISIBLE);
                above1.setVisibility(View.VISIBLE);
                above2.setVisibility(View.VISIBLE);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        main.setVisibility(View.VISIBLE);
                        behind.setVisibility(View.INVISIBLE);
                        above.setVisibility(View.INVISIBLE);
                        above1.setVisibility(View.INVISIBLE);
                        above2.setVisibility(View.INVISIBLE);
                    }
                }, 5000);
            }
        });
    }
}