package com.example.final_work;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class doctor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor);
        final TextView tv1 = (TextView) findViewById(R.id.textView38);
        final TextView tv2 = (TextView) findViewById(R.id.textView39);
        final TextView tv3 = (TextView) findViewById(R.id.textView40);


        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phones = "67754444";
                Intent call =new Intent(Intent.ACTION_DIAL);
                call.setData(Uri.parse("tel:"+Integer.parseInt(phones)));
                startActivity(call);
            }
        });


        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phones = "55165616";
                Intent call =new Intent(Intent.ACTION_DIAL);
                call.setData(Uri.parse("tel:"+Integer.parseInt(phones)));
                startActivity(call);
            }
        });


        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phones = "67046663";
                Intent call =new Intent(Intent.ACTION_DIAL);
                call.setData(Uri.parse("tel:"+Integer.parseInt(phones)));
                startActivity(call);
            }
        });

    }
}