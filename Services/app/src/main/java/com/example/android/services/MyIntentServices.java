package com.example.android.services;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Zohaib on 4/13/2018.
 */

public class MyIntentServices extends IntentService {

    public MyIntentServices(){
        super("WorkerThread");
    }

    @Override
    public void onCreate() {
        Toast.makeText(getApplicationContext(), "onCreate:Service created", Toast.LENGTH_SHORT).show();
        super.onCreate();
    }

    @Override
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        Toast.makeText(getApplicationContext(), " StartCommand:Service started ", Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Toast.makeText(getApplicationContext(), "onDestroy : Service Stopped", Toast.LENGTH_SHORT).show();
        super.onDestroy();

    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("Service Test", "from handle Intet");
    }

}
