/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import apoio.ConexaoBD;
import entidades.AgendaEnt;
import interfaces.IDAO;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Leandro
 */
public class AgendaDAO implements IDAO {

    @Override
    public String salvar(Object o) {
                AgendaEnt agendaEnt = (AgendaEnt) o;
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "INSERT INTO agendaEnt VALUES"
                    + "(DEFAULT, "
                    + "'" + agendaEnt.getDataAtendimento() + "',"
                    + "'" + agendaEnt.getValor() + "',"
                    + "'" + agendaEnt.getPessoaId()+ "',"
                    + "'" + agendaEnt.getMedicoId()  + "') RETURNING id_agendaEnt";
            System.out.println("sql: " + sql);

            ResultSet rs = st.executeQuery(sql);
            int id = 0;
            if (rs.next()) {
                id = rs.getInt("id_agendaEnt");
            }
            return String.valueOf(id);
        } catch (Exception e) {
            System.out.println("Erro salvar Pessoa = " + e);
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
