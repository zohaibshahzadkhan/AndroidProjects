package com.example.android.broadcastsms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Build;
import android.provider.Telephony;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Zohaib on 4/20/2018.
 */

public class MyBroadCastReciever extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            MyBroadCastReciever smsReceiver= new MyBroadCastReciever();
            IntentFilter intentFilter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
            intentFilter.addAction(Telephony.Sms.Intents.DATA_SMS_RECEIVED_ACTION);
            context.registerReceiver(smsReceiver, intentFilter);
        }
        Toast.makeText(context,"BroadCast Reciver Triggered",Toast.LENGTH_LONG).show();
//        Log.w("myApp", "no network");
}
}
