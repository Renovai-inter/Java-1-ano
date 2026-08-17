package model.cooperativa;

public class Negociacao {

    private int codigo;
    private String status;
    private double valorTotalProposto;
    private String observacoes;
    private String dataNegociacao;

    public Negociacao(int codigo, String status, double valorTotalProposto, String observacoes, String dataNegociacao){
        this.codigo = codigo;
        this.status = status;
        this.valorTotalProposto = valorTotalProposto;
        this.observacoes = observacoes;
        this.dataNegociacao = dataNegociacao;
    }
}
