/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entidades.Paciente;
import interfaces.IDAO;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author lacosta
 */
public class PacienteDAO implements IDAO {

    @Override
    public String salvar(Object o) {
        Paciente paciente = (Paciente) o;
        try {
            //Statement st = consultorio.Consultorio.conexao.createStatement();

            String sql = "INSERT INTO categoria VALUES"
                    + "(DEFAULT, "
                    + "'" + paciente.getNome() + "'"
                    + "'" + paciente.getDataNasc() + "'"
                    + "'" + paciente.getSexo() + "'"
                    + "'" + paciente.getRg() + "'"
                    + "'" + paciente.getCPF() + "'"
                    + "'" + paciente.getSUS() + "'"
                    + "'" + paciente.getNomeMae() + "'"
                    + "'" + paciente.getFone()+ "'"
                    + "'" + paciente.getFone2()+ "'"
                    + "'" + paciente.getEnderecoId() + "');";
            System.out.println("sql: " + sql);

//            int resultado = st.executeUpdate(sql);
            return null;
        } catch (Exception e) {
            System.out.println("Erro salvar Paciente = " + e);
            return e.toString();
        }

    }

    @Override
    public String atualizar(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String excluir(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Object> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Object> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object consultarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
