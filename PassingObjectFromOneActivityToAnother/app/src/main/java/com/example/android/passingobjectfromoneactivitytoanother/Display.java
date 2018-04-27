package com.example.android.passingobjectfromoneactivitytoanother;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Display extends AppCompatActivity {
    Intent i;
    TextView txtDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        txtDisplay=(TextView)findViewById(R.id.txtDisplay);

        i=getIntent();
        Student s=(Student)i.getSerializableExtra("student");
        txtDisplay.setText(s.toString());
    }
}
