/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import apoio.ConexaoBD;
import entidades.Endereco;
import interfaces.IDAO;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author lacosta
 */
public class EnderecoDao implements IDAO {

    @Override
    public String salvar(Object o) {
        Endereco endereco = (Endereco) o;
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "INSERT INTO endereco VALUES"
                    + "(DEFAULT, "
                    + "'" + endereco.getLogradouro() + "',"
                    + "'" + endereco.getNumero() + "',"
                    + "'" + endereco.getComplemento() + "',"
                    + "'" + endereco.getBairro() + "',"
                    + "'" + endereco.getCEP() + "',"
                    + "'" + endereco.getCidade_Id() + "') RETURNING id_endereco";

            System.out.println("sql: " + sql);

            ResultSet rs = st.executeQuery(sql);
            int id = 0;
            if (rs.next()) {
                id = rs.getInt("id_endereco");
            }
            return String.valueOf(id);
        } catch (Exception e) {
            System.out.println("Erro salvar Endereco = " + e);
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

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT * FROM endereco WHERE "
                    + "id_endereco = " + id + "";

           // System.out.println("sql: " + sql);

            ResultSet resultado = st.executeQuery(sql);

            if (resultado.next()) {
                Endereco tmpEndereco = new Endereco();
                tmpEndereco.setBairro(resultado.getString("bairro"));
                tmpEndereco.setCEP(resultado.getString("cep"));
                tmpEndereco.setComplemento(resultado.getString("complemento"));
                tmpEndereco.setLogradouro(resultado.getString("logradouro"));
                tmpEndereco.setNumero(resultado.getString("numero"));
                tmpEndereco.setCidade_Id(resultado.getInt("cidade_id"));
                return tmpEndereco;
            } else {
                return null;
            }
        } catch (Exception e) {
            System.out.println("Erro consultar pessoa = " + e);
            return e.toString();
        }

    }
}
