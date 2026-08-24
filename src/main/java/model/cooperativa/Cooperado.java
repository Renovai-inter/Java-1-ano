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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNomeDoUsuario() {
        return nomeDoUsuario;
    }

    public void setNomeDoUsuario(String nomeDoUsuario) {
        this.nomeDoUsuario = nomeDoUsuario;
    }

    public String getPrimeiroStatus() {
        return primeiroStatus;
    }

    public void setPrimeiroStatus(String primeiroStatus) {
        this.primeiroStatus = primeiroStatus;
    }



}
