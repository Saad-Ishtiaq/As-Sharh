package com.example.as_sharh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class FifthPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_page);
    }

    public void Home(View view) {
        Intent intent= new Intent(FifthPage.this,MainActivity.class);
        startActivity(intent);
    }

    public void Ayah8(View view) {
        MediaPlayer mp;
        mp= MediaPlayer.create(this,R.raw.ayah8);
        mp.start();
    }
}