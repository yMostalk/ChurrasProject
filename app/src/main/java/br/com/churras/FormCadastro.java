package br.com.churras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FormCadastro extends AppCompatActivity {

    private Button ButtonCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro);

        getSupportActionBar().hide();
        IniciarComponentes();

        ButtonCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FormCadastro.this,TelaPrincipal.class);
                startActivity(intent);
            }
        });
    }

    private void IniciarComponentes(){

        ButtonCadastrar = findViewById(R.id.ButtonCadastrar);
    }
}

