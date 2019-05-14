package com.example.android.startedserviceexample;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class MyService extends Service {
    private MediaPlayer player;
    @Override
    public void onCreate() { // intial setup of your service
//        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "service Started ... ", Toast.LENGTH_LONG).show();
        player = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);
        player.setLooping(true);
        player.start();
        return START_STICKY ;
    }

    @Override
    public void onDestroy() {
        player.stop();
        Toast.makeText(this, "service Destroyed ... ", Toast.LENGTH_LONG).show();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
