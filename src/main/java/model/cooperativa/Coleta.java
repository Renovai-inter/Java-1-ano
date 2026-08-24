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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getHoraTermino() {
        return horaTermino;
    }

    public void setHoraTermino(String horaTermino) {
        this.horaTermino = horaTermino;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTipoColeta() {
        return tipoColeta;
    }

    public void setTipoColeta(String tipoColeta) {
        this.tipoColeta = tipoColeta;
    }




}
