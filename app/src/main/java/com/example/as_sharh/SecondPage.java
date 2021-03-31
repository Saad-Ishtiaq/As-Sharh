package com.example.as_sharh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class SecondPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);


    }


    public void Ayah2(View view) {
        MediaPlayer mp;
        mp= MediaPlayer.create(this,R.raw.ayah2);
        mp.start();
    }

    public void Ayah3(View view) {
        MediaPlayer mp;
        mp= MediaPlayer.create(this,R.raw.ayah3);
        mp.start();
    }

    public void Intent(View view) {
//        Intent intent = new Intent(Read.this,SecondPage.class);
//        startActivity(intent);
    }
}