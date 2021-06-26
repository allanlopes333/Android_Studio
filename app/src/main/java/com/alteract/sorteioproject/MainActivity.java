package com.alteract.sorteioproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//Ação para um botão
    public void sortearNumero(View view){

        TextView texto = findViewById(R.id.textoResultado);
        int numero = new Random().nextInt(11); //gerar número aleatorio
        texto.setText("Número: " + numero);

    }

}