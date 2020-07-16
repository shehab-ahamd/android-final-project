package com.example.final_work;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class pharmacist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharmacist);
        TextView t1 = findViewById(R.id.abd);
        TextView t2 = findViewById(R.id.msh);
        TextView t3 = findViewById(R.id.sla);
        TextView t4 = findViewById(R.id.sam);
        TextView t5 = findViewById(R.id.aze);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phones = "97811833";
                Intent call =new Intent(Intent.ACTION_DIAL);
                call.setData(Uri.parse("tel:"+Integer.parseInt(phones)));
                startActivity(call);
            }
        });

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phones = "50999692";
                Intent call =new Intent(Intent.ACTION_DIAL);
                call.setData(Uri.parse("tel:"+Integer.parseInt(phones)));
                startActivity(call);
            }
        });

        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phones = "67050610";
                Intent call =new Intent(Intent.ACTION_DIAL);
                call.setData(Uri.parse("tel:"+Integer.parseInt(phones)));
                startActivity(call);
            }
        });


        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phones = "99103504";
                Intent call =new Intent(Intent.ACTION_DIAL);
                call.setData(Uri.parse("tel:"+Integer.parseInt(phones)));
                startActivity(call);
            }
        });

        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phones = "50252205";
                Intent call =new Intent(Intent.ACTION_DIAL);
                call.setData(Uri.parse("tel:"+Integer.parseInt(phones)));
                startActivity(call);
            }
        });
    }
}