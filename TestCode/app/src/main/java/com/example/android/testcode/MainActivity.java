package com.example.android.testcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText1;
    final int Op_Add =1;
    final int Op_Sub =2;
    final int Op_Mul =3;
    final int Op_Div =4;
    Integer op;
    Float A,B;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 =(EditText)findViewById(R.id.editText1);
    }
    public void click(View v)
    {
        switch(v.getId())
        {
            case R.id.btnC:editText1.setText("");
                break;
            case R.id.btn1:appendDisplay("1");
                break;
            case R.id.btn2:appendDisplay("2");
                break;
            case R.id.btn3:appendDisplay("3");
                break;
            case R.id.btn4:appendDisplay("4");
                break;
            case R.id.btn5:appendDisplay("5");
                break;
            case R.id.btn6:appendDisplay("6");
                break;
            case R.id.btn7:appendDisplay("7");
                break;
            case R.id.btn8:appendDisplay("8");
                break;
            case R.id.btn9:appendDisplay("9");
                break;
            case R.id.btn0:appendDisplay("0");
                break;
            case R.id.btnDot:appendDisplay(".");
                break;
            case R.id.btnAdd:
                A = Float.parseFloat(editText1.getText().toString());
                editText1.setText("");
                op=Op_Add;
                break;
            case R.id.btnSub:
                A = Float.parseFloat(editText1.getText().toString());
                editText1.setText("");
                op=Op_Sub;
                break;
            case R.id.btnMultiply:
                A = Float.parseFloat(editText1.getText().toString());
                editText1.setText("");
                op=Op_Mul;
                break;
            case R.id.btnDiv:
                A = Float.parseFloat(editText1.getText().toString());
                editText1.setText("");
                op=Op_Div;
                break;
            case R.id.btnEqual:
                B = Float.parseFloat(editText1.getText().toString());
                Float C=(float)0;
                if(op==Op_Add)
                {
                    C=(float)(A+B);
                }
                else if(op==Op_Sub)
                {
                    C=(float)(A-B);
                }
                else if(op==Op_Mul)
                {
                    C=(float)(A*B);
                }
                else if(op==Op_Div)
                {
                    C=(float)(A/B);
                }
                editText1.setText(C.toString());
        }
    }
    private void appendDisplay(String str)
    {
        String tmp;
        tmp = editText1.getText().toString();
        tmp += str;
        editText1.setText(tmp);
    }


//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//        if (id == R.id.action_settings) {
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }

}
