package com.example.android.services;
import  android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by Zohaib on 4/13/2018.
 */

public class MyService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Toast.makeText(getApplicationContext(), "onBind", Toast.LENGTH_SHORT).show();
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(getApplicationContext(), "onCreate:Service created", Toast.LENGTH_SHORT).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(getApplicationContext(), " StartCommand:Service started ", Toast.LENGTH_SHORT).show();
//        stopSelf();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Toast.makeText(getApplicationContext(), "onDestroy : Service Stopped", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
}










//        int input1;
//        int input2;
//        input1=intent.getIntExtra("input1",-1);
//        input2=intent.getIntExtra("input2",-1);
//        int result= input1+input2;
//        Toast.makeText(getApplicationContext(), "  "+ result, Toast.LENGTH_SHORT).show();