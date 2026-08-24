package model.cooperativa;

public class Endereco {

    private String tipoLocal;
    private String cep;
    private String nomeResponsavel;
    private String nomeLocal;
    private String observacoes;
    private int numero;
    private String estado;
    private String rua;
    private String cidade;

    public Endereco(String tipoLocal, String cep, String nomeResponsavel, String nomeLocal, String observacoes, int numero, String estado, String rua, String cidade){
        this.tipoLocal =tipoLocal;
        this.cep = cep;
        this.nomeResponsavel = nomeResponsavel;
        this.nomeLocal = nomeLocal;
        this.observacoes = observacoes;
        this.numero = numero;
        this.estado = estado;
        this.rua = rua;
        this.cidade = cidade;
    }

    public String getTipoLocal() {
        return tipoLocal;
    }

    public void setTipoLocal(String tipoLocal) {
        this.tipoLocal = tipoLocal;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getNomeLocal() {
        return nomeLocal;
    }

    public void setNomeLocal(String nomeLocal) {
        this.nomeLocal = nomeLocal;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;

    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }



}
