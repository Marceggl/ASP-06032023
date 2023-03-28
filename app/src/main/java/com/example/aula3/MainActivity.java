package com.example.aula3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE); // Tira o Titulo
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN); // Fala que o App vai rodar em tela cheia
        getSupportActionBar().hide(); //esconde a barra de ação

        // Apontar o arquivo xml que iniciar uma atividade "tela"
        setContentView(R.layout.activity_main);
    }
}