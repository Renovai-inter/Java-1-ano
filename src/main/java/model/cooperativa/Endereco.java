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
}
