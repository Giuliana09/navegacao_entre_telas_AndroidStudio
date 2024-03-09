package com.example.tela01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class Tela04 extends AppCompatActivity {
    ConstraintLayout layout;
    String[] cores;
    String outraCor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela04);

        layout = findViewById(R.id.backgroundT4);
        cores = new String[]{"#FF7DC9EC", "#FFE87676", "#FF8EEC92"};
    }

    public void voltarTL3(View view) {
        Intent in = new Intent(Tela04.this, Tela03.class);
        startActivity(in);
    }

    public void mudarCor(View view){
        String cor = (String) view.getTag();
        layout.setBackgroundColor(Color.parseColor(cor));
    }

    public void mudarAleatorio(View view){
        String novaCor;
        do{
            int n = new Random().nextInt(3);
            novaCor = cores[n];
        }while (novaCor.equals(outraCor) || novaCor.equals(layout.getBackground()));

        outraCor = novaCor;
        layout.setBackgroundColor(Color.parseColor(novaCor));
    }

}