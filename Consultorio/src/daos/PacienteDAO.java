/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entidades.Paciente;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author lacosta
 */
public class PacienteDAO {

    public String salvar(Paciente paciente) {
        try {
            Statement st = consultorio.Consultorio.conexao.createStatement();

            String sql = "INSERT INTO categoria VALUES"
                    + "(DEFAULT, "
                    + "'" + paciente.getNome() + "'"
                    + "'" + paciente.getDataNasc() + "'"
                    + "'" + paciente.getSexo() + "'"
                    + "'" + paciente.getRg() + "'"
                    + "'" + paciente.getCPF() + "'"
                    + "'" + paciente.getSUS() + "'"
                    + "'" + paciente.getNomeMae() + "'"
                    + "'" + paciente.getNomePai() + "')";

            System.out.println("sql: " + sql);

            int resultado = st.executeUpdate(sql);
            return null;
        } catch (Exception e) {
            System.out.println("Erro salvar categoria = " + e);
            return e.toString();
        }
    }

    public String alterar(Paciente paciente) {
        return null;
    }

    public String excluir(int id) {
        return null;
    }

    public Paciente consultar(int cpf) {
        return null;
    }

    public ArrayList<Paciente> consultar(String nome) {
        return null;
    }
}
