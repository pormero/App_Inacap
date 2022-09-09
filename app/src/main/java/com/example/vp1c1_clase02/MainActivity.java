package com.example.vp1c1_clase02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etValor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etValor = findViewById(R.id.etValor);

    }

    public void enviar(View v){


        Intent i = new Intent(this, EjemploActivity.class);

        i.putExtra("miDato", etValor.getText().toString());

        startActivity(i);

    }
}