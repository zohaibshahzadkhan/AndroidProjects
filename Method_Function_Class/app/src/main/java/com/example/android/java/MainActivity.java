package com.example.android.java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int numberOfCoffees = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void  increment(View view){

        numberOfCoffees+=1;
        display(numberOfCoffees);
    }
    public void  decrement(View view){
        numberOfCoffees-=1;
        display(numberOfCoffees);
    }
    public void  submitOrder(View view){
        CheckBox whippedCreamCheckBox = (CheckBox) findViewById(R.id.topping_CheckBox);
        String priceMessage=
                "Total Price: $"+ CalculatePrice(numberOfCoffees,whippedCreamCheckBox.isChecked()) + "\nTopping of whipped cream: " +whippedCreamCheckBox.isChecked()+
                "\nThank you!";
        displayPrice(numberOfCoffees*5);
        displayMessage(priceMessage);
    }
    private void display(int number){
        TextView quantityTextView= (TextView)findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    private void displayPrice(int number){
        TextView priceTextView=(TextView)findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    private  void  displayMessage(String message){
        TextView summary=(TextView)findViewById(R.id.summary_text_view);
        summary.setVisibility(View.VISIBLE);
        TextView summaryDescription=(TextView)findViewById(R.id.summaryDescription_text_view);
        summaryDescription.setVisibility(View.VISIBLE);
        summaryDescription.setText(message);
    }
    private int CalculatePrice(int quantity, boolean toppingState){
        if (toppingState==true){
            return quantity*10;
        }
        else {
            return quantity * 5;
        }
    }
}
