package model.cooperativa;

public class Material {

    private int codigo;
    private String categoria;
    private String nome; // ceofiw9dhj9wi
    private double quantidadeSolicitada;
    private double valorPorKg;

    public Material(int codigo, String categoria, String nome,double quantidadeSolicitada, double valorPorKg){
        this.codigo = codigo;
        this.categoria = categoria;
        this.nome = nome;
        this.quantidadeSolicitada = quantidadeSolicitada;
        this.valorPorKg = valorPorKg;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQuantidadeSolicitada() {
        return quantidadeSolicitada;
    }

    public void setQuantidadeSolicitada(double quantidadeSolicitada) {
        this.quantidadeSolicitada = quantidadeSolicitada;
    }

    public double getValorPorKg() {
        return valorPorKg;
    }

    public void setValorPorKg(double valorPorKg) {
        this.valorPorKg = valorPorKg;



    }
}
