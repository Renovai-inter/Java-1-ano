package model.cooperativa;

public class Cooperativa {

    private String cnpj;
    private int codigo;
    private String telefone;
    private String email;
    private String logo;
    private String dataCadastro;
    private String rua;
    private String cep;

    public Cooperativa(String cnpj, int codigo, String telefone, String email, String logo, String dataCadastro, String rua, String cep){
     this.cnpj = cnpj;
     this.codigo = codigo;
     this.telefone = telefone;
     this.email = email;
     this.logo = logo;
     this.dataCadastro = dataCadastro;
     this.rua = rua;
     this.cep = cep;
    }
}
