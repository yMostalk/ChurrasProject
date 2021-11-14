package Ferramentas;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import modelo.Usuario;

public class EventosDB extends SQLiteOpenHelper {

    private Context contexto;

    public EventosDB(Context cont){
        super(cont, "Usuario", null, 1);
        contexto = cont;
    }
    @Override
    //Cria tabela no banco de dados

    public void onCreate(SQLiteDatabase db) {
        final String criaTabela = "CREATE TABLE IF NOT EXISTS Usuario(id INTERGER PRIMARY KEY AUTOINCREMENT, Nome TEXT, Idade TEXT, Endereco TEXT, Telefone TEXT, Cpf TEXT, Senha TEXT)";
        db.execSQL(criaTabela);
    }
    public void cadastraUsuario(Usuario novoUsuario){
        try (SQLiteDatabase db = this.getWritableDatabase()){

            ContentValues valores = new ContentValues();
            //Armazenar valores nas respectivas variáveis

            valores.put("nome", novoUsuario.getNome());
            valores.put("idade", novoUsuario.getIdade());
            valores.put("endereco", novoUsuario.getEndereco());
            valores.put("telefone", novoUsuario.getTelefone());
            valores.put("cpf", novoUsuario.getCpf());
            valores.put("senha", novoUsuario.getSenha());

        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    public void editaUsuario(){

    }
    public void buscaUsuario(){

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
