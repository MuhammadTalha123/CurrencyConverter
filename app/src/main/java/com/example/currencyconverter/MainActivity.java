package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view) {

        Log.i("info", "Button pressed");

        EditText editText = (EditText) findViewById(R.id.editText);

        String amountInDolloars = editText.getText().toString();

        double amountInDollarsDouble = Double.parseDouble(amountInDolloars);

        double amountInPkrDouble = amountInDollarsDouble * 160;

        String amountInPkrString = String.format("%.2f", amountInPkrDouble);

        Toast.makeText(this, "$" + amountInDolloars + " is pkr" + amountInPkrString, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
