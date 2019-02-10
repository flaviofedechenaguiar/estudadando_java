// DAL -> Data Access Layer ou Modulo de Conexao
package br.com.infox.dal;

import java.sql.*;


public class ModuloConexao {

// Metodo responsavel por estabelecer a conexao com o banco de dados
    public static Connection conector() {
        java.sql.Connection conexao = null;

// a linha abaixo chama o driver
        String driver = "com.mysql.cj.jdbc.Driver";

// Armazenando informacoes referentes ao banco
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "";

// Estabelecendo a conexao com o banco de dados
        try {

            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;

        } catch (Exception e) {
            // a linha abaixo serve de apoio para esclarecer o erro
            //System.out.println(e);
            return null;

        }

    }
};
