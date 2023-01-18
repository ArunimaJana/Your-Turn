package com.example.yourturn;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Customers extends AppCompatActivity {
    String customername,customercontact;
    Button btnadd;
    ImageButton imgbtn;
    ListView list;
    TextView tvname,tvcontact;




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customers);



        btnadd=findViewById(R.id.btnadd);
        list=findViewById(R.id.list);
        imgbtn=findViewById(R.id.imgbtn);
        tvcontact=findViewById(R.id.tvcontact);
        tvname=findViewById(R.id.tvname);
        Intent intent=getIntent();
        customercontact=intent.getStringExtra("customercontact");
        customername=intent.getStringExtra("customername");

        tvname.setText(" "+customername);
        tvcontact.setText(" "+customercontact);






        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Customers.this,Data.class);
                startActivity(intent1);


            }
        });
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Customers.this, "Calling...", Toast.LENGTH_SHORT).show();
            }
        });
    }
}