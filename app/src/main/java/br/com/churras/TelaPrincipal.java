package br.com.churras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class TelaPrincipal extends AppCompatActivity {

    private ImageView BotaoUsuario;
    private Button buttonMC;
    private Button buttonAV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        getSupportActionBar().hide();
        IniciarComponentes();

        BotaoUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TelaPrincipal.this,TelaUsuario.class);
                startActivity(intent);
            }
        });

        buttonAV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TelaPrincipal.this,TelaAvaliacao.class);
                startActivity(intent);
            }
        });

        buttonMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TelaPrincipal.this,TelaPagamento.class);
                startActivity(intent);
            }
        });
    }

    private void IniciarComponentes(){
        BotaoUsuario = findViewById(R.id.BotaoUsuario);
        buttonAV = findViewById(R.id.buttonAV);
        buttonMC = findViewById(R.id.buttonMC);

    }

}