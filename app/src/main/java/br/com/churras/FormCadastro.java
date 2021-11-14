package br.com.churras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.ParseException;

import Ferramentas.EventosDB;
import modelo.Usuario;

public class FormCadastro extends AppCompatActivity {

    private TextView title_cadastrese;
    private EditText edit_nome;
    private EditText edit_idade;
    private EditText edit_endereco;
    private EditText edit_telefone;
    private EditText edit_cpf;
    private EditText edit_senha;
    private Button ButtonCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro);

        title_cadastrese = (TextView) findViewById(R.id.title_cadastrese);
        edit_nome = (EditText) findViewById(R.id.edit_nome);
        edit_idade = (EditText) findViewById(R.id.edit_idade);
        edit_endereco = (EditText) findViewById(R.id.edit_endereco);
        edit_telefone = (EditText) findViewById(R.id.edit_telefone);
        edit_cpf = (EditText) findViewById(R.id.edit_cpf);
        edit_senha = (EditText) findViewById(R.id.edit_senha);
        ButtonCadastrar = (Button) findViewById(R.id.ButtonCadastrar);

        Intent intencao = getIntent();
        getSupportActionBar().hide();
        IniciarComponentes();

        ButtonCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Importar Cadastrar usuário

                try {
                    cadastrarNovoUsuario();
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void IniciarComponentes(){

        ButtonCadastrar = findViewById(R.id.ButtonCadastrar);
    }

    private void cadastrarNovoUsuario() throws ParseException {
        String nome = edit_nome.getText().toString();
        String idade = edit_idade.getText().toString();
        String endereco = edit_endereco.getText().toString();
        String telefone = edit_telefone.getText().toString();
        String cpf = edit_cpf.getText().toString();
        String senha= edit_senha.getText().toString();
        Usuario novoUsuario = new Usuario(nome, idade, endereco, telefone, cpf, senha);

        //Inserir esse usuario no banco de dados

        EventosDB bd = new EventosDB(FormCadastro.this);
        bd.cadastraUsuario(novoUsuario);
        Toast.makeText(FormCadastro.this, "Cadastro feito com sucesso", Toast.LENGTH_LONG).show();
        finish();

    }

}

