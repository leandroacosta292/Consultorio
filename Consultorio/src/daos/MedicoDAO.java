/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import apoio.ConexaoBD;
import entidades.Endereco;
import entidades.Medico;
import interfaces.IDAO;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Leandro
 */
public class MedicoDAO implements IDAO {

    @Override
    public String salvar(Object o) {
        Medico medico = (Medico) o;
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "INSERT INTO medico VALUES"
                    + "('" + medico.getCrm() + "',"
                    + "'" + medico.getId_medico() + "') RETURNING id_medico";
            System.out.println("sql: " + sql);

            ResultSet rs = st.executeQuery(sql);
            int id = 0;
            if (rs.next()) {
                id = rs.getInt("id_medico");
            }
            return String.valueOf(id);
        } catch (Exception e) {
            System.out.println("Erro salvar Médico = " + e);
            return e.toString();
        }

    }

    @Override
    public String atualizar(Object o) {
        Medico medico = (Medico) o;
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "UPDATE medico SET "
                    + "crm = '" + medico.getCrm() + "' WHERE id_medico = " + medico.getId_medico();
            System.out.println("sql: " + sql);

            st.executeUpdate(sql);;
            return "";
        } catch (Exception e) {
            System.out.println("Erro Atualizar Médico = " + e);
            return e.toString();
        }

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

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT * FROM medico WHERE "
                    + "id_medico = " + id + "";

            // System.out.println("sql: " + sql);
            ResultSet resultado = st.executeQuery(sql);

            if (resultado.next()) {
                Medico tmpMedico = new Medico();
                tmpMedico.setCrm(resultado.getString("crm"));
                tmpMedico.setId_medico(resultado.getInt("id_medico"));
                return tmpMedico;
            } else {
                return null;
            }
        } catch (Exception e) {
            System.out.println("Erro consultar medico = " + e);
            return e.toString();
        }

    }

}
