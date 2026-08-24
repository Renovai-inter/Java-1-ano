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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
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

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
