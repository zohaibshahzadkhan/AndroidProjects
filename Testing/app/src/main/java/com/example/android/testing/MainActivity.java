package com.example.android.testing;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//--------------------------------------------------
//        Button b = (Button) findViewById(R.id.button1);
//
//        b.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast T=  Toast.makeText(view.getContext(),"Simple Message To Print",Toast.LENGTH_LONG);
//                T.show();
//            }
//        });
// --------------------------------------------------


    }

//    public void displayMessage(View view){
//        Toast T=  Toast.makeText(this,"Simple Message BSe 8B",Toast.LENGTH_LONG);
//        T.setGravity(5,200,500);
//        T.show();
//
//    }


//_______________________________________________________________________


//3.	Create an application which takes a string message from user and create a toast of it on pressing button

//    public  void displayMessage(View view){
//        EditText textControl=(EditText) findViewById(R.id.input);
//        Toast t=Toast.makeText(this,textControl.getText(),Toast.LENGTH_LONG);
//        t.show();
//    }
//_______________________________________________________________________

public  void calculate(View view){
    EditText value1=(EditText) findViewById(R.id.input1);
    EditText value2=(EditText) findViewById(R.id.input2);
    EditText output=(EditText) findViewById(R.id.output);
    int result = Integer.parseInt(value1.getText().toString())+Integer.parseInt(value2.getText().toString());
    output.setText(String.valueOf(result));
}


//    ==========================================
//  public void findButton(View view){
//      switch (view.getId()){
//
//              case R.id.button1:
//                  Toast t=Toast.makeText(this,"Button 1",Toast.LENGTH_SHORT);
//                  t.show();
//                  break;
//              case R.id.button2:
//                  Toast t1=Toast.makeText(this,"Button 2",Toast.LENGTH_SHORT);
//                  t1.show();
//                  break;
//                case R.id.button3:
//                Toast t2=Toast.makeText(this,"Button 3",Toast.LENGTH_SHORT);
//                t2.show();
//                break;
//              default:
//                  throw new RuntimeException("Unknow button ID");
//
//      }
//  }

}
