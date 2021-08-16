package com.pankajkcodes.calculatorbypankajkcodes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1, e2;
    TextView t1;
    double num1, num2;
    String inp1, inp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // a public method to get the input numbers
    public boolean getNumbers() {
        // defining the edit text 1 to e1 & e2 & textView
        e1 = findViewById(R.id.editTextNumber1);
        e2 = findViewById(R.id.editTextNumber2);
        t1 = findViewById(R.id.result);

        // taking input from text box 1 & box 2
        inp1 = e1.getText().toString();
        inp2 = e2.getText().toString();

        // condition to check if box is not empty
        if (inp1.equals("") && inp2.equals("")) {
            String Warning = "Please Enter a number";
            t1.setText(Warning);
            return false;
        } else {
            num1 = Integer.parseInt(e1.getText().toString());
            num2 = Integer.parseInt(e2.getText().toString());

        }
        return true;
    }

    public void doClear(View view) {
        try {
            t1.setText("");
            e1.setText("");
            e2.setText("");
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "Already Empty !", Toast.LENGTH_SHORT).show();
        }

    }

    public void doDiv(View view) {
        if (getNumbers()) {
            double div = num1/(num2*1.0);
            t1.setText(Double.toString(div));

        }
    }

    public void doMulti(View view) {
        if (getNumbers()) {
            double multi = num1*num2;
            t1.setText(Double.toString(multi));

        }
    }

    public void doMin(View view) {
        if (getNumbers()) {
            double min = num1-num2;
            t1.setText(Integer.toString((int) min));
        }
    }

    public void doPlus(View view) {
        if (getNumbers()) {
            double sum = num1+num2;
            t1.setText(Integer.toString((int) sum));

        }
    }
}

