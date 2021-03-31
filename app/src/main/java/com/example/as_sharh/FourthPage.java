package com.example.as_sharh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class FourthPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_page);
    }

    public void Intent(View view) {
        Intent intent = new Intent(FourthPage.this,FifthPage.class);
        startActivity(intent);
    }

    public void Ayah6(View view) {
        MediaPlayer mp;
        mp= MediaPlayer.create(this,R.raw.ayah6);
        mp.start();
    }

    public void Ayah7(View view) {
        MediaPlayer mp;
        mp= MediaPlayer.create(this,R.raw.ayah7);
        mp.start();
    }
}