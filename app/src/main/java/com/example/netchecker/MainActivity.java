package com.example.netchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.networkchecker.NetworkCheck;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NetworkCheck.checkNet(MainActivity.this);
    }
}