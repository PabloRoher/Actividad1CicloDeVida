package com.example.aplicacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("onCreate", "Pablo Rodriguez Hernandez");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("onStart", "Pablo Rodriguez Hernandez");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("onResume", "Pablo Rodriguez Hernandez");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("onPause", "Pablo Rodriguez Hernandez");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("onStop", "Pablo Rodriguez Hernandez");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("onDestroy", "Pablo Rodriguez Hernandez");
    }

}