/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import apoio.ConexaoBD;
import entidades.Receituario;
import interfaces.IDAO;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Leandro
 */
public class ReceituarioDAO implements IDAO{

    @Override
    public String salvar(Object o) {
      
         Receituario receita = (Receituario) o;
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "INSERT INTO receituario VALUES"
                    + "(DEFAULT, "
                    + "'" + receita.getTipoMedicamento() + "',"
                    + "'" + receita.getNome() + "',"
                    + "'" + receita.getPrincipioAtivo() + "',"
                    + "'" + receita.getLaboratorio() + "',"
                    + "'" + receita.getConcentracao() + "',"
                    + "'" + receita.getApresentacao()+ "',"
                    + "'" + receita.getViaAdm() + "',"
                    + "'" + receita.getPossologia() + "',"
                    + "'" + receita.getAtendimentoMedId()+ "') RETURNING id_receituario";
            System.out.println("sql: " + sql);

            ResultSet rs = st.executeQuery(sql);
            int id = 0;
            if (rs.next()) {
                id = rs.getInt("id_receituario");
            }
            return String.valueOf(id);
        } catch (Exception e) {
            System.out.println("Erro salvar receituario = " + e);
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
