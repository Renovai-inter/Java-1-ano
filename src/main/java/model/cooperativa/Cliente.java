package model.cooperativa;

public class Cliente {

        private int codigoComprador;
        private String nome;
        private String observacoes;
        private String email;
        private String cidade;
        private String telefone;

        public Cliente(int codigoComprador, String nome, String observacoes, String email, String cidade, String whatsapp, String telefone){
            this.codigoComprador = codigoComprador;
            this.nome = nome;
            this.observacoes = observacoes;
            this.email = email;
            this.cidade = cidade;
            this.telefone = telefone;
        }

    public int getCodigoComprador() {
        return codigoComprador;
    }

    public void setCodigoComprador(int codigoComprador) {
        this.codigoComprador = codigoComprador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }




}
