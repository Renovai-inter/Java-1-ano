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
}
