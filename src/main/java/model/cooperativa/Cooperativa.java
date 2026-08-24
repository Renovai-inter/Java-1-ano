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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
