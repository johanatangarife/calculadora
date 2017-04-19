package com.example.usuario.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ingresar = (Button) findViewById(R.id.btningresar);
        ingresar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent siguiente = new Intent(this, calculadoravista.class);
        startActivity(siguiente);

    }
}
