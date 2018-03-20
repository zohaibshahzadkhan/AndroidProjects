package com.example.android.coolcal;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView resultView;
    public enum Operation  {
            ADD,SUBTRACT,MULTIPLY,DIVIDE,EQUAL
    }

    String runningNumber = "";
    String leftValue="";
    String rightValue="";
    Operation currentOperation;
    int result=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn0= (Button)findViewById(R.id.button0);
        Button btn1= (Button)findViewById(R.id.button1);
        Button btn2= (Button)findViewById(R.id.button2);
        Button btn3= (Button)findViewById(R.id.button3);
        Button btn4= (Button)findViewById(R.id.button4);
        Button btn5= (Button)findViewById(R.id.button5);
        Button btn6= (Button)findViewById(R.id.button6);
        Button btn7= (Button)findViewById(R.id.button7);
        Button btn8= (Button)findViewById(R.id.button8);
        Button btn9= (Button)findViewById(R.id.button9);

        ImageButton plus=(ImageButton)findViewById(R.id.imageButton_Plus);
        ImageButton minus=(ImageButton)findViewById(R.id.imageButton_minus);
        ImageButton multiply=(ImageButton)findViewById(R.id.imageButton_multiply);
        ImageButton divide=(ImageButton)findViewById(R.id.imageButton_divide);
        ImageButton btnequal = (ImageButton)findViewById(R.id.imageButton_equal);

        Button btnClear = (Button)findViewById(R.id.button_clear);

        resultView=(TextView)findViewById(R.id.textView);
        resultView.setText("");

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberPressed(0);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberPressed(1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberPressed(2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberPressed(3);
            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberPressed(4);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberPressed(5);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberPressed(6);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberPressed(7);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberPressed(8);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberPressed(9);
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processOperation(Operation.ADD);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processOperation(Operation.SUBTRACT);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processOperation(Operation.MULTIPLY);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processOperation(Operation.DIVIDE);
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                leftValue="";
                rightValue="";
                result=0;
                runningNumber="";
                currentOperation=null;
                resultView.setText("0");
            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processOperation(Operation.EQUAL);
            }
        });
    }

    public void numberPressed(int number){
        runningNumber+=String.valueOf(number);
        resultView.setText(runningNumber);
    }

    public void processOperation(Operation operation){
        if(currentOperation != null){
            if(runningNumber!=null){
                rightValue=runningNumber;
                runningNumber="";

                switch (currentOperation){
                    case ADD:
                        result= Integer.parseInt(leftValue)+Integer.parseInt(rightValue);
                        break;
                    case SUBTRACT:
                        result= Integer.parseInt(leftValue)-Integer.parseInt(rightValue);
                        break;
                    case MULTIPLY:
                        result= Integer.parseInt(leftValue)*Integer.parseInt(rightValue);
                        break;
                    case DIVIDE:
                        result= Integer.parseInt(leftValue)/Integer.parseInt(rightValue);
                        break;
                }
                leftValue = String.valueOf(result);
                resultView.setText(leftValue);
            }
        }
        else {
            leftValue =runningNumber;
            runningNumber="";
        }
        currentOperation=operation;

    }
}
