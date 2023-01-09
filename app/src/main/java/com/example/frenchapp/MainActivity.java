package com.example.frenchapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleColorButtonClick(View view) {
        Button clickedButton = (Button) view;

        MediaPlayer md = MediaPlayer.create(
                this,
                getResources().getIdentifier(
                       clickedButton.getTag().toString(),
                       "raw",
                        getPackageName()
                )
        );
        md.start();
    }
}