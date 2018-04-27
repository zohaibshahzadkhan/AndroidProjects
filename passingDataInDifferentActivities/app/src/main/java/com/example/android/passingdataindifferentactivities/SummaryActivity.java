package com.example.android.passingdataindifferentactivities;

import android.content.Intent;
import android.content.SearchRecentSuggestionsProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SummaryActivity extends AppCompatActivity {
    String name;
    String password;
    TextView mytextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        mytextView=(TextView)findViewById(R.id.summaryText);

        Intent intent =getIntent();
        name = intent.getStringExtra("username");
        password = intent.getStringExtra("password");
        Log.i("username",name);
        Log.i("password",password);
        if(name.equals("Zohaib") && password.equals("pakistan"))
        {
            mytextView.setText("Login successful !");

        }
        else
        {
            mytextView.setText("Invalid User Name or Password");
        }

    }

}
