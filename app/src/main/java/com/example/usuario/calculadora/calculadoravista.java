package com.example.usuario.calculadora;

import android.content.IntentSender;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class calculadoravista extends AppCompatActivity implements View.OnClickListener {

    EditText txt1, txt2;
    RadioButton sumar, restar, multiplicar, dividir;
    TextView resultado;
    Button calcular;
    RadioGroup grupo;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadoravista);

        txt1 = (EditText) findViewById(R.id.num1);
        txt2 = (EditText) findViewById(R.id.num2);
        grupo= (RadioGroup) findViewById(R.id.operaciones);
        sumar = (RadioButton) findViewById(R.id.suma);
        restar = (RadioButton) findViewById(R.id.resta);
        multiplicar = (RadioButton) findViewById(R.id.multiplicacion);
        dividir = (RadioButton) findViewById(R.id.division);
        resultado = (TextView) findViewById(R.id.resul);
        calcular = (Button) findViewById(R.id.btncalcular);
        calcular.setOnClickListener((View.OnClickListener) this);

        grupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (checkedId== R.id.suma){
                    String valor1 = txt1.getText().toString();
                    String valor2 = txt2.getText().toString();
                    int n1 = Integer.parseInt(valor1);
                    int n2 = Integer.parseInt(valor2);
                    int suma = n1+n2;
                    result = String.valueOf(suma);
                    resultado.setText(result);
                }
                else if (checkedId== R.id.resta) {
                    String valor1 = txt1.getText().toString();
                    String valor2 = txt2.getText().toString();
                    int n1 = Integer.parseInt(valor1);
                    int n2 = Integer.parseInt(valor2);
                    int resta = n1 - n2;
                    result = String.valueOf(resta);
                    resultado.setText(result);
                }
                    else if (checkedId== R.id.multiplicacion) {
                    String valor1 = txt1.getText().toString();
                    String valor2 = txt2.getText().toString();
                    int n1 = Integer.parseInt(valor1);
                    int n2 = Integer.parseInt(valor2);
                    int multiplicacion = n1 * n2;
                    result = String.valueOf(multiplicacion);
                    resultado.setText(result);
                }
                    else if (checkedId== R.id.division){
                    String valor1 = txt1.getText().toString();
                    String valor2 = txt2.getText().toString();
                    int n1 = Integer.parseInt(valor1);
                    int n2 = Integer.parseInt(valor2);
                    int division = n1/n2;
                    result = String.valueOf(division);
                    resultado.setText(result);


                }
            }
        });

    }

        @Override
        public void onClick (View v){

        }
    }
