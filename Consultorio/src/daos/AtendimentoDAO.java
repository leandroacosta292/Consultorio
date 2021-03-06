/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import apoio.ConexaoBD;
import entidades.Atendimento;
import interfaces.IDAO;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Leandro
 */
public class AtendimentoDAO implements IDAO{

    @Override
    public String salvar(Object o) {
        Atendimento tmpAtendimento = (Atendimento) o;
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "INSERT INTO atendimento_medico VALUES ("
                    + "" + tmpAtendimento.getIdAtendimento() + ","
                    + "'" + tmpAtendimento.getAtendimento() + "',"
                    + "'" + tmpAtendimento.getConduta() + "',"
                    + "'" + tmpAtendimento.getMedicoId() + "',"
                    + "'" + tmpAtendimento.getPessoaId() + "',"
                    + "'" + tmpAtendimento.getDoencaId() + "') RETURNING id_atendimento_medico";
            System.out.println("sql: " + sql);

            ResultSet rs = st.executeQuery(sql);
            int id = 0;
            if (rs.next()) {
                id = rs.getInt("id_atendimento_medico");
            }
            return String.valueOf(id);
        } catch (Exception e) {
            System.out.println("Erro salvar atendimento = " + e);
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
