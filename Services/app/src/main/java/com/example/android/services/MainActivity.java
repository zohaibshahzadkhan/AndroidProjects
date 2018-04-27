package com.example.android.services;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void startMethod(View v){
        Intent i =new Intent(this,MyService.class);
        startService(i);
    };
    public void stopMethod(View v){
        Intent i =new Intent(this,MyService.class);
        stopService(i);
    };
}













//    Intent i =new Intent(this,MyService.class);
//        i.putExtra("input1",10);
//        i.putExtra("input2",5);