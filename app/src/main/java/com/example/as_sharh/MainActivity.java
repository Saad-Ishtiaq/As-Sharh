package com.example.as_sharh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Intent(View view) {
        Intent intent1= new Intent(MainActivity.this,Read.class);
        startActivity(intent1);

    }

    public void TalawatPage(View view) {
        Intent intent2= new Intent(MainActivity.this,Talawat.class);
        startActivity(intent2);
    }


}