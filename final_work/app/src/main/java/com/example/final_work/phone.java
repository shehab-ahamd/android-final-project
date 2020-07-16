package com.example.final_work;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class phone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);
        Button doc = findViewById(R.id.gotodoctor);
        Button ph = findViewById(R.id.gotopharmacist);

        doc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d = new Intent(phone.this,doctor.class);
                startActivity(d);
            }
        });
        ph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(phone.this,pharmacist.class);
                startActivity(p);
            }
        });
    }
}