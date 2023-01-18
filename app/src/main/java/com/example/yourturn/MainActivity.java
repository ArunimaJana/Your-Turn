package com.example.yourturn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnsp,btnsu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsu=findViewById(R.id.btnsu);
        btnsp=findViewById(R.id.btnsp);

        btnsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Opening...", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,Customers.class);
                startActivity(intent);

            }

        });
        btnsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Under Development...", Toast.LENGTH_SHORT).show();

            }
        });
    }
}