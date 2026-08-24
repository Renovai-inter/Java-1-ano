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

    public double getValorTotalProposto() {
        return valorTotalProposto;
    }

    public void setValorTotalProposto(double valorTotalProposto) {
        this.valorTotalProposto = valorTotalProposto;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getDataNegociacao() {
        return dataNegociacao;
    }

    public void setDataNegociacao(String dataNegociacao) {
        this.dataNegociacao = dataNegociacao;
    }



}
