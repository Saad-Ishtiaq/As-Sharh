package com.example.as_sharh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class ThirdPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_page);
    }



    public void Ayah4(View view) {
        MediaPlayer mp;
        mp= MediaPlayer.create(this,R.raw.ayah4);
        mp.start();
    }

    public void Ayah5(View view) {
        MediaPlayer mp;
        mp= MediaPlayer.create(this,R.raw.ayah5);
        mp.start();
    }



    public void Intent(View view) {
        Intent intent = new Intent(ThirdPage.this,FourthPage.class);
        startActivity(intent);

    }
}