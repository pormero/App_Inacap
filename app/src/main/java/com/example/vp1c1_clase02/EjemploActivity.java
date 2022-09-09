package com.example.vp1c1_clase02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class EjemploActivity extends AppCompatActivity {
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo);

        tvResultado = findViewById(R.id.tvResultado);

        Bundle bundle = getIntent().getExtras();

        String dato = bundle.getString("miDato");

        tvResultado.setText(dato);

    }

    public void salir(View v){
        finish();
    }
}