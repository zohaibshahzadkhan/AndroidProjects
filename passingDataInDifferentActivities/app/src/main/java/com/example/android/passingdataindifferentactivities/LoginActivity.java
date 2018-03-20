package com.example.android.passingdataindifferentactivities;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    public  String username;
    public  String password;

    public EditText usernameEditText;
    public EditText passwordEditText;
    public Button   login_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameEditText=(EditText)findViewById(R.id.user);
        passwordEditText=(EditText)findViewById(R.id.pass);
        login_btn=(Button)findViewById(R.id.button1);
        login_btn.setEnabled(false);
        passwordEditText.setEnabled(false);

        usernameEditText.addTextChangedListener(usernameWatcher);
        passwordEditText.addTextChangedListener(passwordWatcher);
    }

    private final TextWatcher usernameWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            passwordEditText.setEnabled(true);
        }

        @Override
        public void afterTextChanged(Editable editable) {
            if(editable.length()==0){
                passwordEditText.setEnabled(false);
            }
            else{
                username=(usernameEditText.getText().toString());
            }
        }
    };


    private final TextWatcher passwordWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }
        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            login_btn.setEnabled(true);
        }

        @Override
        public void afterTextChanged(Editable editable) {
            if(editable.length()==0){
                login_btn.setEnabled(false);
            }
            else {
                login_btn.setEnabled(true);
                password=(passwordEditText.getText().toString());
            }
        }
    };

    public  void login(View view){
        Intent myIntent = new Intent(this,SummaryActivity.class);
        myIntent.putExtra("username",username);
        myIntent.putExtra("password",password);
        startActivity(myIntent);
//
//        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.vogella.com"));
//        startActivity(i);
    }

}
