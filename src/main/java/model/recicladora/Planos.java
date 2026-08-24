package model.recicladora;

public class Planos {

    private int codigo;
    private String status;
    private double valor;
    private int duracao;
    private String descricao;
    private String nome;

    public Planos(int codigo, String status, double valor, int duracao, String descricao, String nome){
        this.codigo = codigo;
        this.status = status;
        this.valor = valor;
        this.duracao = duracao;
        this.descricao = descricao;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
