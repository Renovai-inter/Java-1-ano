package model.cooperativa;

public class Despesa {

    private int codigoDespesa;
    private String descricao;
    private String data;
    private String observacoes;
    private double valor;
    private String categoria;

    public Despesa(int codigoDespesa, String descricao, String data, String observacoes, double valor, String categoria){
        this.codigoDespesa = codigoDespesa;
        this.descricao = descricao;
        this.data = data;
        this.observacoes = observacoes;
        this.valor = valor;
        this.categoria = categoria;
    }

    public int getCodigoDespesa() {
        return codigoDespesa;
    }

    public void setCodigoDespesa(int codigoDespesa) {
        this.codigoDespesa = codigoDespesa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }




}
