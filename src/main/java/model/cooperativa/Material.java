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
}
