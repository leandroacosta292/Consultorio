/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import apoio.Uteis;
import daos.AgendaDAO;
import entidades.AgendaEnt;
import entidades.Pessoa;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;

/**
 *
 * @author leandro
 */
public class agenda extends javax.swing.JInternalFrame {

    /**
     * Creates new form agenda
     */
    Uteis uteis = new Uteis();
    AgendaDAO agendaDAO = new AgendaDAO();
    AgendaEnt tmpAgenda = new AgendaEnt();
    AgendaEnt agendamentoSelecionado = new AgendaEnt();
    JPanel fundo;

    public agenda() {
        initComponents();
        //System.out.println(uteis.FormatarDatayyyyMMdd(calendario.getCalendar()));
        agendaDAO.popularTabela(tabela, uteis.FormatarDatayyyyMMdd(calendario.getCalendar().getTime()), "data_atendimento");

    }

    public agenda(JPanel fundo) {
        initComponents();
        //System.out.println(uteis.FormatarDatayyyyMMdd(calendario.getCalendar()));
        agendaDAO.popularTabela(tabela, uteis.FormatarDatayyyyMMdd(calendario.getCalendar().getTime()), "data_atendimento");
        this.fundo = fundo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnAlterar = new javax.swing.JButton();
        btnAgendar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        btnProcurar = new javax.swing.JButton();
        calendario = new com.toedter.calendar.JCalendar();
        btnPagar = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Hora", "Nome", "Medico", "Valor", "Atendido", "Pago"
            }
        ));
        tabela.setToolTipText("");
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setPreferredWidth(1);
            tabela.getColumnModel().getColumn(1).setPreferredWidth(1);
            tabela.getColumnModel().getColumn(2).setPreferredWidth(5);
            tabela.getColumnModel().getColumn(3).setPreferredWidth(5);
            tabela.getColumnModel().getColumn(4).setPreferredWidth(4);
        }

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/alterar32.png"))); // NOI18N
        btnAlterar.setEnabled(false);
        btnAlterar.setLabel("Alterar");
        btnAlterar.setMaximumSize(new java.awt.Dimension(122, 50));
        btnAlterar.setMinimumSize(new java.awt.Dimension(122, 50));
        btnAlterar.setPreferredSize(new java.awt.Dimension(122, 50));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnAgendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/novaFicha32.png"))); // NOI18N
        btnAgendar.setText("Agendar");
        btnAgendar.setMaximumSize(new java.awt.Dimension(122, 50));
        btnAgendar.setMinimumSize(new java.awt.Dimension(122, 50));
        btnAgendar.setPreferredSize(new java.awt.Dimension(122, 50));
        btnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarActionPerformed(evt);
            }
        });

        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/fechar32.png"))); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.setMaximumSize(new java.awt.Dimension(122, 50));
        btnFechar.setMinimumSize(new java.awt.Dimension(122, 50));
        btnFechar.setPreferredSize(new java.awt.Dimension(122, 50));
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnProcurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/procurarPessoa32.png"))); // NOI18N
        btnProcurar.setText("Procurar");
        btnProcurar.setMaximumSize(new java.awt.Dimension(122, 50));
        btnProcurar.setMinimumSize(new java.awt.Dimension(122, 50));
        btnProcurar.setPreferredSize(new java.awt.Dimension(122, 50));
        btnProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        calendario.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                calendarioPropertyChange(evt);
            }
        });

        btnPagar.setText("Pagar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPagar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calendario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPagar)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarActionPerformed
        agendar Agendar = new agendar(null, true);
        Agendar.setVisible(true);
    }//GEN-LAST:event_btnAgendarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarActionPerformed
        procurarAgendamento procurar = new procurarAgendamento(null, true);
        tmpAgenda = procurar.retornarAgenda();
    }//GEN-LAST:event_btnProcurarActionPerformed

    private void calendarioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_calendarioPropertyChange
        //    System.out.println("alfa: "+uteis.FormatarDatayyyyMMdd(calendario.getCalendar()));
        agendaDAO.popularTabela(tabela, uteis.FormatarDatayyyyMMdd(calendario.getCalendar().getTime()), "data_atendimento");
    }//GEN-LAST:event_calendarioPropertyChange

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        agendaDAO.pagar((int) tabela.getValueAt(tabela.getSelectedRow(), 0), true);
    }//GEN-LAST:event_btnPagarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        if (evt.getClickCount() == 1) {
            tmpAgenda = (AgendaEnt) agendaDAO.consultarId((int) tabela.getValueAt(tabela.getSelectedRow(), 0));
            btnAlterar.setEnabled(true);
        }    
        if (evt.getClickCount() == 2) {
            if (tabela.getValueAt(tabela.getSelectedRow(), 5).equals("Não")) {
                agendamentoSelecionado = (AgendaEnt) agendaDAO.consultarId((int) tabela.getValueAt(tabela.getSelectedRow(), 0));
                atender atendimento = new atender(agendamentoSelecionado);                
                this.dispose();
                fundo.add(atendimento);
                atendimento.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Atendimento já efetuado");
            }
        }
    }//GEN-LAST:event_tabelaMouseClicked

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        agendar Agendar = new agendar(null, true, (AgendaEnt) agendaDAO.consultarId((int) tabela.getValueAt(tabela.getSelectedRow(), 0)));
        Agendar.setVisible(true);        
    }//GEN-LAST:event_btnAlterarActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendar;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnProcurar;
    private com.toedter.calendar.JCalendar calendario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
