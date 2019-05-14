package com.example.android.toastandlog;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyApplicationTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        Button btn = (Button) findViewById(R.id.mybutton);
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"setOnClickListener", Toast.LENGTH_SHORT).show();
//            }
//        });
//
        Log.i(TAG,"Informational log");
    }

//    public void displayToast(View v){
//        Toast.makeText(getApplicationContext()," I am Short Toast", Toast.LENGTH_SHORT).show();
//        Toast.makeText(getApplicationContext()," I am Long Toast", Toast.LENGTH_LONG).show();
//    }
}
