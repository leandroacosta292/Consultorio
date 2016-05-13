/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import apoio.ConexaoBD;
import apoio.Uteis;
import entidades.AgendaEnt;
import entidades.Pessoa;
import interfaces.IDAO;
import java.awt.Color;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Leandro
 */
public class AgendaDAO implements IDAO {

    Uteis uteis = new Uteis();
    PessoaDAO pessoaDAO = new PessoaDAO();

    @Override
    public String salvar(Object o) {
        AgendaEnt agendaEnt = (AgendaEnt) o;
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "INSERT INTO agenda VALUES"
                    + "(DEFAULT, "
                    + "'" + agendaEnt.getDataAtendimento() + "',"
                    + "'" + agendaEnt.getValor() + "',"
                    + "'" + agendaEnt.getPessoaId() + "',"
                    + "'" + agendaEnt.getMedicoId() + "',"
                    + "'" + agendaEnt.isAtendido() + "') RETURNING id_atendimento";
            System.out.println("sql: " + sql);

            ResultSet rs = st.executeQuery(sql);
            int id = 0;
            if (rs.next()) {
                id = rs.getInt("id_atendimento");
            }
            return String.valueOf(id);
        } catch (Exception e) {
            System.out.println("Erro salvar atendimento na agenda = " + e);
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

            String sql = "SELECT * FROM agenda WHERE "
                    + "id_atendimento  = " + id + "";

            //  System.out.println("sql: " + sql);
            ResultSet resultado = st.executeQuery(sql);

            if (resultado.next()) {
                AgendaEnt tmpAgendamento = new AgendaEnt();
                tmpAgendamento.setIdAtendimento(resultado.getInt("id_atendimento"));
                tmpAgendamento.setDataAtendimento(resultado.getDate("data_atendimento"));
                tmpAgendamento.setHoraMin(uteis.FormatarHora(resultado.getString("data_atendimento")));
                tmpAgendamento.setPessoaId(resultado.getInt("pessoa_id"));
                tmpAgendamento.setMedicoId(resultado.getInt("medico_id"));
                tmpAgendamento.setValor(resultado.getString("valor"));
                return tmpAgendamento;
            } else {
                return null;
            }
        } catch (Exception e) {
            System.out.println("Erro consultar agendamento = " + e);
            return e.toString();
        }
    }

    public void popularTabela(JTable tabela, String criterio, String campo) {
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[7];
        cabecalho[0] = "ID";
        cabecalho[1] = "Hora";
        cabecalho[2] = "Paciente";
        cabecalho[3] = "Medico";
        cabecalho[4] = "Valor";
        cabecalho[5] = "Atendido";
        cabecalho[6] = "Pago";
        ResultSet resultadoQ;

        // cria matriz de acordo com nº de registros da tabela
        try {
            String sql = "SELECT count(*) FROM agenda WHERE " + campo + " BETWEEN '" + criterio + " 00:00:00' AND '" + criterio + " 23:59:59';";
            // System.out.println("sql1" + sql);
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][7];

        } catch (Exception e) {
            System.out.println("Erro ao consultar agenda: " + e);
        }

        int lin = 0;

        // efetua consulta na tabela
        try {
            String sql1 = "SELECT * FROM agenda WHERE " + campo + " BETWEEN '" + criterio + " 00:00:00' AND '" + criterio + " 23:59:59' ORDER BY 2;";
            //System.out.println("sql1" + sql1);
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql1);

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id_atendimento");
                dadosTabela[lin][1] = uteis.FormatarHora(resultadoQ.getString("data_atendimento"));
                Pessoa tmpPessoa = (Pessoa) pessoaDAO.consultarId(resultadoQ.getInt("pessoa_id"));
                String tmpPessoaConca = tmpPessoa.getID() + "-" + tmpPessoa.getNome();
                dadosTabela[lin][2] = tmpPessoaConca;
                Pessoa tmpMedico = (Pessoa) pessoaDAO.consultarId(resultadoQ.getInt("medico_id"));
                String tmpMedicoConca = tmpMedico.getID() + "-" + tmpMedico.getNome();
                dadosTabela[lin][3] = tmpMedicoConca;
                dadosTabela[lin][4] = resultadoQ.getString("valor");
                if (resultadoQ.getBoolean("atendido")) {
                    dadosTabela[lin][5] = "Sim";
                } else {
                    dadosTabela[lin][5] = "Não";
                }
                if (resultadoQ.getBoolean("pago")) {
                    dadosTabela[lin][6] = "Sim";
                } else {
                    dadosTabela[lin][6] = "Não";
                }

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
//        tabela.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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

    public void atender(int id, boolean atendido) {

        Statement st;
        try {
            st = ConexaoBD.getInstance().getConnection().createStatement();
            String sql = "UPDATE agenda SET atendido = " + atendido + " WHERE id_atendimento = " + id;
            System.out.println("sql: " + sql);
            st.execute(sql);

        } catch (SQLException ex) {
            Logger.getLogger(AgendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void pagar(int id, boolean pago) {

        Statement st;
        try {
            st = ConexaoBD.getInstance().getConnection().createStatement();
            String sql = "UPDATE agenda SET pago = " + pago + " WHERE id_atendimento = " + id;
//  System.out.println("sql: " + sql);
            st.execute(sql);

        } catch (SQLException ex) {
            Logger.getLogger(AgendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
