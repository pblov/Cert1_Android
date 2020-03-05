package com.example.cert1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}


// Intento


/*
public class MainActivity extends AppCompatActivity {

    Button sumar = (Button) findViewById(R.id.btnSuma);
    Button restar = (Button) findViewById(R.id.btnResta);
    Button mult = (Button) findViewById(R.id.btnMult);
    Button div = (Button) findViewById(R.id.btnDiv);
    Button limpiaNum = (Button) findViewById(R.id.btnLimpia);
    Button generaNum = (Button) findViewById(R.id.btnGeneraNum);
    TextView inputNumRandoms = (TextView) findViewById(R.id.inputGeneraNum);
    TextView inputResultado = (TextView) findViewById(R.id.inputResultado);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        inputNumRandoms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random = new Random();
                int num1 = random.nextInt(100);
                int num2 = random.nextInt(100);
                int resultado;
                switch (resultado){
                    case "sumar": resultado = num1 + num2;

                                  break;
                    case "restar": resultado = num1 - num2;
                        break;
                    case "mult": resultado = num1 * num2;
                        break;
                    case "div":
                        if(num2 != 0) resultado = num1 / num2;
                        break;
                    case "clear2:
                        //
                        break;
                    default:
                        inputNumRandoms.setText(' ' + '?' + ' ');
                        break;
                }
                inputNumRandoms.setText(resultado); // obtención
            }
        });

*/












