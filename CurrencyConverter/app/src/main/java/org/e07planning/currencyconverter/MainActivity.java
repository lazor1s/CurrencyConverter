package org.e07planning.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void onClick(View view){

        EditText currecy = (EditText) findViewById(R.id.editTextCurrency);
      double currencytoConvert = Double.parseDouble(currecy.getText().toString());

       double currencyConversion =  currencyConversion(Double.parseDouble(currecy.getText().toString()));





        Toast.makeText(this, "The value of £" + currencytoConvert +" is " + currencyConversion + " in Dollars", Toast.LENGTH_SHORT).show();

    }


    public double currencyConversion(double value){
        double total = 0;
        total = Math.round(value*1.3);

        return total;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}