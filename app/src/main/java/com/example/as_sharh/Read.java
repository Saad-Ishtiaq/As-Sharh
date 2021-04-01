package com.example.as_sharh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Read extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);

    }

    public void Bismillah(View view) {

        MediaPlayer mp;
        mp= MediaPlayer.create(this,R.raw.bismillah);
        mp.start();
    }

    public void Ayah1(View view)
    {
        MediaPlayer mp1;
        mp1= MediaPlayer.create(this,R.raw.ayah1);
        mp1.start();
    }

    public void Intent(View view) {
        Intent intent = new Intent(Read.this,SecondPage.class);
        startActivity(intent);
    }
}