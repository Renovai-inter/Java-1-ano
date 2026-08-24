package dao.cooperativa;

import util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CooperativaDAO {

    Conexao conexao = new Conexao();

    public CooperativaDAO() {
    }

    // CREATE



    // READ


    // UPDATE

//    Nome da cooperativa; editarNome()
//    CNPJ; editarCNPJ();
//    Nome do responsável; editarResponsavel()
//    E-mail; editarEmail()
//    Telefone; editarTelefone()
//    Endereço; editarEndereco()
//    Data de fundação (opcional). editarDataFundacao

    public String editarNome(String nome, ) {
        Connection conn = conexao.conectar();

        String sql = """
                
                """

        try {
            PreparedStatement comando = conn.prepareStatement(sql);
        }
    }


    // DELETE


}
