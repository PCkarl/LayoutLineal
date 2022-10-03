package com.example.layoutlineal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 =(EditText) findViewById(R.id.txtNumero1);
        num2 =(EditText) findViewById(R.id.txtNumero2);
        result = (TextView) findViewById(R.id.txtResultado);
            }
            public void sumar(View view)
            {   double n1,n2,suma;
                n1 = Double.parseDouble(num1.getText().toString());
                n2 = Double.parseDouble(num2.getText().toString());
                suma= n1+n2;
                result.setText(""+suma);
            }
    public void restar(View view)
    {   double n1,n2,resta;
        n1 = Double.parseDouble(num1.getText().toString());
        n2 = Double.parseDouble(num2.getText().toString());
        resta= n1-n2;
        result.setText(""+resta);
    }
    public void multiplicar(View view)
    {   double n1,n2,mult;
        n1 = Double.parseDouble(num1.getText().toString());
        n2 = Double.parseDouble(num2.getText().toString());
        mult= n1*n2;
        result.setText(""+mult);
    }
    public void dividir(View view)
    {   double n1,n2,div;
        n1 = Double.parseDouble(num1.getText().toString());
        n2 = Double.parseDouble(num2.getText().toString());
        div= n1/n2;
        result.setText(""+div);
    }

}