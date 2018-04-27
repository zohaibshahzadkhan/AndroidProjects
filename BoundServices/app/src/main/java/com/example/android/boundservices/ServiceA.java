package com.example.android.boundservices;

import java.util.Random;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.widget.Toast;

public class ServiceA extends Service {

	private IBinder binder = new LocalBinder();
	private Random random = new Random();

	public class LocalBinder extends Binder {
		ServiceA getServiceA() {
			return ServiceA.this;
		}
	}

	@Override
	public void onCreate() {
		super.onCreate();
		Toast.makeText(getApplicationContext(), "ServiceA.onCreate() ...", Toast.LENGTH_SHORT).show();
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		Toast.makeText(getApplicationContext(), "ServiceA.onDestroy() ...", Toast.LENGTH_SHORT).show();		
	}
	
	@Override
	public IBinder onBind(Intent intent) {
		Toast.makeText(getApplicationContext(), "ServiceA.onBind() ...", Toast.LENGTH_SHORT).show();
		return binder;
	}
	
	@Override
	public boolean onUnbind(Intent intent) {
		Toast.makeText(getApplicationContext(), "ServiceA.onUnbind() ...", Toast.LENGTH_SHORT).show();	
		return super.onUnbind(intent);
	}
	
	@Override
	public void onRebind(Intent intent) {		
		super.onRebind(intent);
		Toast.makeText(getApplicationContext(), "ServiceA.onRebind() ...", Toast.LENGTH_SHORT).show();
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		Toast.makeText(getApplicationContext(), "ServiceA.onStartCommand() ...", Toast.LENGTH_SHORT).show();
		return super.onStartCommand(intent, flags, startId);		
	}
	
	/** method for clients */
	public Integer getRandomNumber() {
		return random.nextInt(100);
	}
}
