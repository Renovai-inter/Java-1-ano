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
    }
