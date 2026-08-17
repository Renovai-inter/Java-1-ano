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
}
