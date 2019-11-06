package com.example.infs3634assignment.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.infs3634assignment.R;

public class MainActivity extends AppCompatActivity {

    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void changeView(View view) {
        Intent intent = new Intent(MainActivity.this, IntroActivity.class);
        startActivity(intent);
    }
}