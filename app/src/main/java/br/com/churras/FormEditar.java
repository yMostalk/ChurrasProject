package br.com.churras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FormEditar extends AppCompatActivity {

    private TextView title_cadastrese;
    private EditText edit_nome;
    private EditText edit_idade;
    private EditText edit_endereco;
    private EditText edit_telefone;
    private EditText edit_cpf;
    private EditText edit_senha;
    private Button ButtonEditar;

    public FormEditar() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_editar);
    }
}