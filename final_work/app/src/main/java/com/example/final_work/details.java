package com.example.final_work;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        TextView tv1 = findViewById(R.id.textView5);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(details.this, siklo1.class);
                startActivity(a);
            }
        });

        TextView tv2 = findViewById(R.id.textView6);
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(details.this, sec_1.class);
                startActivity(a);
            }
        });

        TextView tv3 = findViewById(R.id.textView7);
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(details.this, the_1.class);
                startActivity(a);
            }
        });




















        Bundle b = getIntent().getExtras();
        mid m = (mid) b.getSerializable("mid");

        TextView name = findViewById(R.id.textView4);
        TextView d1 = findViewById(R.id.textView5);
        TextView d2 = findViewById(R.id.textView6);
     TextView d3 = findViewById(R.id.textView7);
     TextView d4 = findViewById(R.id.textView8);
     TextView d5 = findViewById(R.id.textView9);
     TextView d6 = findViewById(R.id.textView10);
     TextView d7 = findViewById(R.id.textView11);
     TextView d8 = findViewById(R.id.textView12);
     TextView d9 = findViewById(R.id.textView13);
     TextView d10 = findViewById(R.id.textView14);
     TextView d11 = findViewById(R.id.textView15);
     TextView d12 = findViewById(R.id.textView16);
     TextView d13 = findViewById(R.id.textView17);
     TextView d14 = findViewById(R.id.textView18);
     TextView d15 = findViewById(R.id.textView19);
     TextView d16 = findViewById(R.id.textView20);
     TextView d17 = findViewById(R.id.textView21);
     TextView d18 = findViewById(R.id.textView22);
     TextView d19 = findViewById(R.id.textView23);
     TextView d20 = findViewById(R.id.textView24);
     TextView d21 = findViewById(R.id.textView25);
     TextView d22 = findViewById(R.id.textView26);
     TextView d23 = findViewById(R.id.textView27);


        name.setText("الأدوية لمرض  "+m.getName());
        d1.setText(m.getD1());
        d2.setText(m.getD2());
        d3.setText(m.getD3());
        d4.setText(m.getD4());
        d5.setText(m.getD5());
        d6.setText(m.getD6());
        d7.setText(m.getD7());
        d8.setText(m.getD8());
        d9.setText(m.getD9());
        d10.setText(m.getD10());
        d11.setText(m.getD11());
        d12.setText(m.getD12());
        d13.setText(m.getD13());
        d14.setText(m.getD14());
        d15.setText(m.getD15());
        d16.setText(m.getD16());
        d17.setText(m.getD17());
        d18.setText(m.getD18());
        d19.setText(m.getD19());
        d20.setText(m.getD20());
        d21.setText(m.getD21());
        d22.setText(m.getD22());
        d23.setText(m.getD23());
    }
}