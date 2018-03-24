package com.example.hansaanuradhawickramanayake.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    public void buttonTapped(View view) {

        EditText moneyEditText = findViewById(R.id.moneyEditText);

        Log.i("info", "Button tapped");
        String moneyString = moneyEditText.getText().toString();

        double pounds = Double.valueOf(moneyString).doubleValue();


        double dollars = pounds * 1.3;

        moneyString = String.format("%.2f", dollars);

        Toast.makeText(this, "£" +pounds + " equals $" +moneyString, Toast.LENGTH_LONG).show();



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Currency Converter");
    }
}
