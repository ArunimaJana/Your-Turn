package com.example.yourturn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Data extends AppCompatActivity {
    String customername,customercontact;

    Button btndone;
    EditText edtnname,edtncontact;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        btndone=findViewById(R.id.btndone);
        edtncontact=findViewById(R.id.edtcontact);
        edtnname=findViewById(R.id.edtname);



        btndone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customername = edtnname.getText().toString();
                customercontact = edtncontact.getText().toString();
                Intent intent = new Intent(Data.this,Customers.class);
                intent.putExtra("customername",customername);
                intent.putExtra("customercontact",customercontact);

                startActivity(intent);

            }
        });
    }
}