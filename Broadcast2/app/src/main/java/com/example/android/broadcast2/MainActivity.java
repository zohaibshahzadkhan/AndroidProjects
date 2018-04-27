package com.example.android.broadcast2;

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
    public void onBtnSend(View v) {
//        Intent intent = new Intent();
//        intent.putExtra("info", "Hello world from BRTest02");
//        intent.setAction("CUSTOM_BROADCAST");
//        sendBroadcast(intent);


        Intent intent = new Intent();
        try {
            int res= 3/0;
        }
        catch (Exception e){
        intent.putExtra("info",e.getMessage());
        intent.setAction("DEBUG_INFO");
        sendBroadcast(intent);
    }
}
}

