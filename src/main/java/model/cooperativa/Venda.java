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
}