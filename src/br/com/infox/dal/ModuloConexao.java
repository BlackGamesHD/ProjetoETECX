/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.dal;

import java.sql.*;

/**
 *
 * @author TheBl
 */
public class ModuloConexao {

    // Método que vai estabelecer a conexão com o banco de dados
    public static Connection conector() {
        java.sql.Connection conexao = null;
        // A linha abaixo chama o driver que foi importado para o projeto java
        String driver = "com.mysql.cj.jdbc.Driver";
        // Informações referentes ao banco de dados
        String url = "jdbc:mysql://localhost/dbinfox?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String password = "";
        // Estabelecendo a conexão
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (SQLException ex) {
            System.err.println("Erro ao estabelecer a conexão"+ex.getMessage());
            return null;
        } catch (Exception ex) {
            System.err.println("Erro Geral"+ex.getMessage());
            return null;
        }

    }
}
