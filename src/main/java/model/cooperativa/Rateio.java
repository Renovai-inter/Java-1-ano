package model.cooperativa;

public class Rateio {

    private int codigoRateio;
    private double valorTotalRateio;
    private String observacao;
    private int cooperadosTotal;
    private String data;
    private double sobra;
    private int periodo;

    public Rateio(int codigoRateio, double valorTotalRateio, String observacao, int cooperadosTotal, String data, double sobra, int periodo){
        this.codigoRateio = codigoRateio;
        this.valorTotalRateio = valorTotalRateio;
        this.observacao = observacao;
        this.cooperadosTotal = cooperadosTotal;
        this.data = data;
        this.sobra = sobra;
        this.periodo = periodo;
    }

    public int getCodigoRateio() {
        return codigoRateio;
    }

    public void setCodigoRateio(int codigoRateio) {
        this.codigoRateio = codigoRateio;
    }

    public double getValorTotalRateio() {
        return valorTotalRateio;
    }

    public void setValorTotalRateio(double valorTotalRateio) {
        this.valorTotalRateio = valorTotalRateio;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public int getCooperadosTotal() {
        return cooperadosTotal;
    }

    public void setCooperadosTotal(int cooperadosTotal) {
        this.cooperadosTotal = cooperadosTotal;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getSobra() {
        return sobra;
    }

    public void setSobra(double sobra) {
        this.sobra = sobra;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
}
