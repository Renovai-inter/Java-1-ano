package model.cooperativa;

public class Coleta {

    private int codigo;
    private String observacoes;
    private double pesoTotal;
    private String status;
    private String horaTermino;
    private String horaInicio;
    private String data;
    private String tipoColeta;

    public Coleta(int codigo,String observacoes, double pesoTotal, String status,  String horaTermino, String horaInicio, String data,String tipoColeta ){
        this.codigo = codigo;
        this.observacoes = observacoes;
        this.pesoTotal = pesoTotal;
        this.status = status;
        this.horaTermino = horaTermino;
        this.horaInicio = horaInicio;
        this.data = data;
        this.tipoColeta = tipoColeta;
    }
}
