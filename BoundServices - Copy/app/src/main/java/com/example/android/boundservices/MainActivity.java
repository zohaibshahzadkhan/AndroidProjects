package com.example.android.boundservices;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    MyService mservice;
//    EditText txt;
//    boolean status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
//            txt=(EditText) findViewById(R.id.editText);
        }

//
//        public  void bindMethod(View v){
//            Intent i=new Intent(this,MyService.class);
//            bindService(i,sc, Context.BIND_AUTO_CREATE);
//            status=true;
//            Toast.makeText(getBaseContext(),"Service binded successfully",Toast.LENGTH_LONG).show();
//        }
//
//        public  void unbindMethod(View v){
//            if(status=true){
//                unbindService(sc);
//                Toast.makeText(getBaseContext(),"Service un-binded successfully ",Toast.LENGTH_LONG).show();
//                status=false;
//            }
//
//            else{
//                Toast.makeText(getBaseContext(),"Service is already un-binded ",Toast.LENGTH_LONG).show();
//            }
//        }
//        public  void factorialMethod(View v){
//            if(status){
//                int num = Integer.parseInt(txt.getText().toString());
//                int result=
//            }
//        }
//
//        private ServiceConnection sc= new ServiceConnection() {
//            @Override
//            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
//                MyService.LocalBinder binder= (MyService.LocalBinder) iBinder;
//                mservice=binder.getService();
//                status=true;
//
//            }
//
//            @Override
//            public void onServiceDisconnected(ComponentName componentName) {
//
//            }
//        }
}
