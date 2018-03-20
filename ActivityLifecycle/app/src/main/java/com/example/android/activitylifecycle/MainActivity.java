package com.example.android.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private String TAG = "MyActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"OnCreate is called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"OnStart is called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"OnResume is called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause is called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy is called");

    }
}
