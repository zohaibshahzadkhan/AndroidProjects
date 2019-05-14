package com.example.android.broadcastreciever;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msg=(EditText) findViewById(R.id.debugMessage);
        BroadcastReceiver br=new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                String s=intent.getStringExtra("info");
                Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
            }
        };
        IntentFilter filter =new IntentFilter("DEBUG_INFO");
        registerReceiver(br,filter);

    }

    public void onBtnSend(View v) {
        Intent intent = new Intent();
        intent.putExtra("info", msg.getText().toString());
        intent.setAction("DEBUG_INFO");
        sendBroadcast(intent);
    }
}
