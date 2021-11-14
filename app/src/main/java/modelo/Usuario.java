package modelo;

public class Usuario {


    private long id;
    private String Nome;
    private String Idade;
    private String Endereco;
    private String telefone;
    private String cpf;
    private String senha;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getIdade() {
        return Idade;
    }

    public void setIdade(String idade) {
        Idade = idade;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Usuario(long id, String nome, String idade, String endereco, String telefone, String cpf, String senha) {
        this.id = id;
        Nome = nome;
        Idade = idade;
        Endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.senha = senha;
    }

    public Usuario(String nome, String idade, String endereco, String telefone, String cpf, String senha) {
    }


}
