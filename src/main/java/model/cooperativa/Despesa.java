package model.cooperativa;

public class Despesa {

    private int codigoDespesa;
    private String descricao;
    private String data;
    private String observacoes;
    private double valor;
    private String categoria;

    public Despesa(int codigoDespesa, String descricao, String data, String observacoes, double valor, String categoria){
        this.codigoDespesa = codigoDespesa;
        this.descricao = descricao;
        this.data = data;
        this.observacoes = observacoes;
        this.valor = valor;
        this.categoria = categoria;
    }
}
