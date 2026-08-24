package model.cooperativa;

public class Venda {

    private int codigoVenda;
    private String origemVenda;
    private String statusVenda;
    private String dataVenda;
    private double valorVenda;
    private int idCooperativa;
    private int idComprador;

    public Venda(int codigoVenda, String origemVenda, String statusVenda, String dataVenda, double valorVenda, int idCooperativa, int idComprador){
        this.codigoVenda = codigoVenda;
        this.origemVenda = origemVenda;
        this.statusVenda = statusVenda;
        this.dataVenda = dataVenda;
        this.valorVenda = valorVenda;
        this.idCooperativa = idCooperativa;
        this.idComprador = idComprador;
    }

    public int getCodigoVenda() {
        return codigoVenda;
    }

    public void setCodigoVenda(int codigoVenda) {
        this.codigoVenda = codigoVenda;
    }

    public String getOrigemVenda() {
        return origemVenda;
    }

    public void setOrigemVenda(String origemVenda) {
        this.origemVenda = origemVenda;
    }

    public String getStatusVenda() {
        return statusVenda;
    }

    public void setStatusVenda(String statusVenda) {
        this.statusVenda = statusVenda;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public int getIdCooperativa() {
        return idCooperativa;
    }

    public void setIdCooperativa(int idCooperativa) {
        this.idCooperativa = idCooperativa;
    }

    public int getIdComprador() {
        return idComprador;
    }

    public void setIdComprador(int idComprador) {
        this.idComprador = idComprador;
    }
}