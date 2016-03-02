/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultorio;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import telas.principal;

/**
 *
 * @author leandro
 */
public class Consultorio {

    public static Connection conexao = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        principal telaPrincipal = new principal();
        telaPrincipal.setVisible(true);
        if (abrirConexao()){
            System.out.println("Conectou");
        }else{
            System.out.println("Deu merda");
        } 
    }
    
    public static boolean abrirConexao(){
           try {
            String dbdriver = "org.postgresql.Driver";
            String dburl = "jdbc:postgresql://localhost:5432/Consultorio";
            String dbuser = "postgres";
            String dbsenha = "postgres";

            // Carrega Driver do Banco de Dados
            Class.forName(dbdriver);

            if (dbuser.length() != 0) // conexão COM usuário e senha
            {
                conexao = DriverManager.getConnection(dburl, dbuser, dbsenha);
            } else // conexão SEM usuário e senha
            {
                conexao = DriverManager.getConnection(dburl);
            }

            return true;

        } catch (Exception e) {
            System.err.println("Erro ao tentar conectar: " + e);
            return false;
        }
    
}
}
