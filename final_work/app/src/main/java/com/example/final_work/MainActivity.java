package com.example.final_work;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button camera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
Button button =findViewById(R.id.buttonns);
Button qr = findViewById(R.id.QR);
Button phone = findViewById(R.id.phone);
final Button n9ay7 = findViewById(R.id.n9ay7);
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i =new Intent(MainActivity.this,midicine.class);
        startActivity(i);
    }
});

qr.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
try {
    Intent intent =new Intent();
    intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
    startActivity(intent);
}
catch (Exception e)
{
    e.printStackTrace();
}
    }
});
phone.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
Intent b = new Intent(MainActivity.this,phone.class);
startActivity(b);
    }
});
n9ay7.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
Intent a = new Intent(MainActivity.this,n9ay7.class);
startActivity(a);
    }
});
    }
}