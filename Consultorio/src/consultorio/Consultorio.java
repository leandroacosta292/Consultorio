/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultorio;

import apoio.ConexaoBD;
import javax.swing.JOptionPane;
import telas.principal;

/**
 *
 * @author leandro
 */
public class Consultorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        if (ConexaoBD.getInstance().getConnection() == null) {
            ConexaoBD.getInstance().getConnection();
            principal telaPrincipal = new principal();
            telaPrincipal.setVisible(true);
        } else {
            System.out.println("Deu merda");
        }
    }

}
