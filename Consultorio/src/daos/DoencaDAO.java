/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import apoio.ConexaoBD;
import apoio.Uteis;
import entidades.Doenca;
import entidades.Pessoa;
import interfaces.IDAO;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Leandro
 */
public class DoencaDAO implements IDAO {

    Uteis uteis = new Uteis();

    @Override
    public String salvar(Object o) {
        Doenca doenca = (Doenca) o;
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "INSERT INTO doenca VALUES"
                    + "(DEFAULT, "
                    + "'" + doenca.getNome() + "',"
                    + "'" + doenca.getCid() + "') RETURNING id_doenca";
            System.out.println("sql: " + sql);

            ResultSet rs = st.executeQuery(sql);
            int id = 0;
            if (rs.next()) {
                id = rs.getInt("id_doenca");
            }
            return String.valueOf(id);
        } catch (Exception e) {
            System.out.println("Erro salvar Doença = " + e);
            return e.toString();
        }
    }

    @Override
    public String atualizar(Object o) {
        Doenca doenca = (Doenca) o;
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "UPDATE doenca SET "
                    + "nome = '" + doenca.getNome() + "', "
                    + "cid = '" + doenca.getCid() + "' WHERE id_doenca = " + doenca.getId();
            System.out.println("sql: " + sql);

            st.executeUpdate(sql);;
            return "";
        } catch (Exception e) {
            System.out.println("Erro Atualizar Doença = " + e);
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

            String sql = "SELECT * FROM doenca WHERE "
                    + "id_doenca = " + id + "";

            //  System.out.println("sql: " + sql);
            ResultSet resultado = st.executeQuery(sql);

            if (resultado.next()) {
                Doenca doenca = new Doenca();
                doenca.setId(resultado.getInt("id_doenca"));
                doenca.setNome(resultado.getString("nome"));
                doenca.setCid(resultado.getString("cid"));

                return doenca;
            } else {
                return null;
            }
        } catch (Exception e) {
            System.out.println("Erro consultar doença = " + e);
            return e.toString();
        }
    }

    public void popularTabela(JTable tabela) {
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[3];
        cabecalho[0] = "ID";
        cabecalho[1] = "Nome";
        cabecalho[2] = "CID";
        ResultSet resultadoQ;

        // cria matriz de acordo com nº de registros da tabela
        try {
            String sql = "SELECT count(*) FROM doenca;";
            System.out.println("sql1" + sql);
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][3];

        } catch (Exception e) {
            System.out.println("Erro ao consultar doenca: " + e);
        }

        int lin = 0;

        // efetua consulta na tabela
        try {
            String sql1 = "SELECT * FROM doenca ORDER BY 1;";
            System.out.println("sql1" + sql1);
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql1);

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id_doenca");
                dadosTabela[lin][1] = resultadoQ.getString("nome");
                dadosTabela[lin][2] = resultadoQ.getString("cid");

                // caso a coluna precise exibir uma imagem
//                if (resultadoQ.getBoolean("Situacao")) {
//                    dadosTabela[lin][2] = new ImageIcon(getClass().getClassLoader().getResource("Interface/imagens/status_ativo.png"));
//                } else {
//                    dadosTabela[lin][2] = new ImageIcon(getClass().getClassLoader().getResource("Interface/imagens/status_inativo.png"));
//                }
                lin++;
            }
        } catch (Exception e) {
            System.out.println("problemas para popular tabela...");
            System.out.println(e);
        }

        // configuracoes adicionais no componente tabela
        tabela.setModel(new DefaultTableModel(dadosTabela, cabecalho) {
            @Override
            // quando retorno for FALSE, a tabela nao é editavel
            public boolean isCellEditable(int row, int column) {
                return false;
                /*  
                 if (column == 3) {  // apenas a coluna 3 sera editavel
                 return true;
                 } else {
                 return false;
                 }
                 */
            }

            // alteracao no metodo que determina a coluna em que o objeto ImageIcon devera aparecer
            @Override
            public Class getColumnClass(int column) {

                if (column == 2) {
                    //   return ImageIcon.class;
                }
                return Object.class;
            }
        });

        // permite seleção de apenas uma linha da tabela
        tabela.setSelectionMode(0);

        // redimensiona as colunas de uma tabela
        TableColumn column = null;
        for (int i = 0; i < tabela.getColumnCount(); i++) {
            column = tabela.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setPreferredWidth(17);
                    break;
                case 1:
                    column.setPreferredWidth(140);
                    break;
//                case 2:
//                    column.setPreferredWidth(14);
//                    break;
            }
        }
        // renderizacao das linhas da tabela = mudar a cor
//        jTable1.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
//
//            @Override
//            public Component getTableCellRendererComponent(JTable table, Object value,
//                    boolean isSelected, boolean hasFocus, int row, int column) {
//                super.getTableCellRendererComponent(table, value, isSelected,
//                        hasFocus, row, column);
//                if (row % 2 == 0) {
//                    setBackground(Color.GREEN);
//                } else {
//                    setBackground(Color.LIGHT_GRAY);
//                }
//                return this;
//            }
//        });
    }

    public void popularTabela(JTable tabela, String criterio, String campo) {
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[3];
        cabecalho[0] = "ID";
        cabecalho[1] = "Nome";
        cabecalho[2] = "CID";
        ResultSet resultadoQ;

        // cria matriz de acordo com nº de registros da tabela
        try {
            String sql = "SELECT count(*) FROM doenca WHERE " + campo + " ILIKE '%" + criterio + "%'";
            System.out.println("sql1" + sql);
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][3];

        } catch (Exception e) {
            System.out.println("Erro ao consultar doenca: " + e);
        }

        int lin = 0;

        // efetua consulta na tabela
        try {
            String sql1 = "SELECT * FROM doenca WHERE " + campo + " ILIKE '%" + criterio + "%' ORDER BY 1";
            System.out.println("sql1" + sql1);
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql1);

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id_doenca");
                dadosTabela[lin][1] = resultadoQ.getString("nome");
                dadosTabela[lin][2] = resultadoQ.getString("cid");

                // caso a coluna precise exibir uma imagem
//                if (resultadoQ.getBoolean("Situacao")) {
//                    dadosTabela[lin][2] = new ImageIcon(getClass().getClassLoader().getResource("Interface/imagens/status_ativo.png"));
//                } else {
//                    dadosTabela[lin][2] = new ImageIcon(getClass().getClassLoader().getResource("Interface/imagens/status_inativo.png"));
//                }
                lin++;
            }
        } catch (Exception e) {
            System.out.println("problemas para popular tabela...");
            System.out.println(e);
        }

        // configuracoes adicionais no componente tabela
        tabela.setModel(new DefaultTableModel(dadosTabela, cabecalho) {
            @Override
            // quando retorno for FALSE, a tabela nao é editavel
            public boolean isCellEditable(int row, int column) {
                return false;
                /*  
                 if (column == 3) {  // apenas a coluna 3 sera editavel
                 return true;
                 } else {
                 return false;
                 }
                 */
            }

            // alteracao no metodo que determina a coluna em que o objeto ImageIcon devera aparecer
            @Override
            public Class getColumnClass(int column) {

                if (column == 2) {
                    //   return ImageIcon.class;
                }
                return Object.class;
            }
        });

        // permite seleção de apenas uma linha da tabela
        tabela.setSelectionMode(0);

        // redimensiona as colunas de uma tabela
        TableColumn column = null;
        for (int i = 0; i < tabela.getColumnCount(); i++) {
            column = tabela.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setPreferredWidth(17);
                    break;
                case 1:
                    column.setPreferredWidth(140);
                    break;
//                case 2:
//                    column.setPreferredWidth(14);
//                    break;
            }
        }
        // renderizacao das linhas da tabela = mudar a cor
//        jTable1.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
//
//            @Override
//            public Component getTableCellRendererComponent(JTable table, Object value,
//                    boolean isSelected, boolean hasFocus, int row, int column) {
//                super.getTableCellRendererComponent(table, value, isSelected,
//                        hasFocus, row, column);
//                if (row % 2 == 0) {
//                    setBackground(Color.GREEN);
//                } else {
//                    setBackground(Color.LIGHT_GRAY);
//                }
//                return this;
//            }
//        });
    }

}
