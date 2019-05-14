package com.example.android.boundservicetogettime;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MyService extends Service {
    private final IBinder bindingObject = new MyLocalBinder();

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return bindingObject;
    }
    public  String getCurrentTime(){
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
        return (df.format(new Date()));

    }

    public  class MyLocalBinder extends Binder {
       public MyService getService(){
            return MyService.this;
        }
    }
}
