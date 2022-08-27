package com.example.yellowbook.launcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class splashscreen extends AppCompatActivity {
    private static int splash_timer=2000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
    }
}