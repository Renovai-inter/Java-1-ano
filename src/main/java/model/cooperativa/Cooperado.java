package model.cooperativa;

public class Cooperado {

    private int codigo;
    private String email;
    private String status;
    private String senha;
    private String cargo;
    private String nomeDoUsuario;
    private String primeiroStatus;

    public Cooperado(int codigo, String email, String status, String senha, String cargo, String nomeDoUsuario, String primeiroStatus){
        this.codigo = codigo;
        this.email = email;
        this.status = status;
        this.senha = senha;
        this.cargo = cargo;
        this.nomeDoUsuario = nomeDoUsuario;
        this.primeiroStatus = primeiroStatus;
    }

}
