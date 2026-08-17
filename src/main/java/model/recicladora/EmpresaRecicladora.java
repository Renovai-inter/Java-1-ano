package model.recicladora;

public class EmpresaRecicladora {

    private String cnpj;
    private String telefone;
    private String nomeFantasia;
    private String email;
    private String logo;
    private String dataCadastro;
    private String responsavel;
    private int numero;
    private String rua;
    private String estado;
    private String cep;
    private String cidade;

    public EmpresaRecicladora(String cnpj, String telefone, String nomeFantasia, String email, String logo, String dataCadastro, String responsavel, int numero, String rua, String estado, String cep, String cidade){
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.nomeFantasia = nomeFantasia;
        this.email = email;
        this.logo = logo;
        this.dataCadastro = dataCadastro;
        this.responsavel = responsavel;
        this.numero = numero;
        this.rua = rua;
        this.estado = estado;
        this.cep = cep;
        this.cidade = cidade;
    }
}
