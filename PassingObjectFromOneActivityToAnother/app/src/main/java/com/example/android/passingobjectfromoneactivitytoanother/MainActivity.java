package com.example.android.passingobjectfromoneactivitytoanother;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i=new Intent(getApplicationContext(), Display.class);
    }

    public void onBtnClicked(View v) {
        Student std=new Student();
        std.setName("Hammad");
        std.setRegNo(28292);
        i.putExtra("student", std);
        startActivity(i);
    }
}
