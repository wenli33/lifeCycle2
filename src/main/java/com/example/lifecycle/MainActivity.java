package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/*
 * LiefCycle
 *
 * Version info       1.00 6.30.2022
 *
 * Copyright notice   WEN-LI CHENG
 */


public class MainActivity extends AppCompatActivity {

    private Button buttonActivity2;

    private static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate MainActivity", Toast.LENGTH_SHORT).show();
        Log.d(TAG , "onCreate MainActivity");
        //buttonActivity2 = (Button)findViewById(R.id.buttonActivity2);
        //buttonActivity2.setOnClickListener(gotoActivity2);
    }

    @Override
    protected void onStart() {
        Toast.makeText(this, "onStart MainActivity", Toast.LENGTH_SHORT).show();
        Log.d(TAG , "onStart MainActivity");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Toast.makeText(this, "onRestart MainActivity", Toast.LENGTH_SHORT).show();
        Log.d(TAG , "onRestart MainActivity");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Toast.makeText(this, "onResume MainActivity", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onResume MainActivity");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Toast.makeText(this, "onPause MainActivity", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onPause MainActivity");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Toast.makeText(this, "onStop MainActivity", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStop MainActivity");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Toast.makeText(this, "onDestroy MainActivity", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onDestroy MainActivity");
        super.onDestroy();
    }

    public void gotoActivity2(View view) {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);

    }
}
