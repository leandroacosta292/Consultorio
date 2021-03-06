/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import daos.PessoaDAO;
import entidades.Pessoa;
import javax.swing.JTable;

/**
 *
 * @author leandro
 */
public class procuraPaciente extends javax.swing.JDialog {

    /**
     * Creates new form procuraPaciente
     */
    PessoaDAO pessoaDAO;
    private Pessoa pessoaSelecionada;
    String ativo;
    String medico;

    public procuraPaciente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        pessoaDAO = new PessoaDAO();
        initComponents();
        ativo = "";
        medico = "";
        this.setVisible(true);
        // pessoaDAO.popularTabela(tabela, "", "");
    }

    public procuraPaciente(java.awt.Frame parent, boolean modal, String ativo, String medico) {
        super(parent, modal);
        pessoaDAO = new PessoaDAO();
        initComponents();
        this.ativo = ativo;
        this.medico = medico;
        this.setVisible(true);
    }

    public Pessoa retornarPessoa() {
        return pessoaSelecionada;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnFechar = new javax.swing.JButton();
        btnProcurar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        tfdCPF = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        tfdNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Procurar Pessoa");

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);

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

        btnProcurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/procurar32.png"))); // NOI18N
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
                    .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));

        lblNome.setText("Nome");

        tfdCPF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfdCPFMouseClicked(evt);
            }
        });

        lblCPF.setText("CPF");

        tfdNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfdNomeMouseClicked(evt);
            }
        });
        tfdNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNome)
                    .addComponent(lblCPF))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfdCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(tfdNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCPF))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void tfdCPFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfdCPFMouseClicked
       // tfdCPF.setEnabled(true);
        //tfdNome.setEnabled(false);
        tfdNome.setText("");
       // btnProcurar.setEnabled(true);
    }//GEN-LAST:event_tfdCPFMouseClicked

    private void tfdNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfdNomeMouseClicked
      //  tfdCPF.setEnabled(false);
      //  tfdNome.setEnabled(true);
        tfdCPF.setText("");
       // btnProcurar.setEnabled(true);
    }//GEN-LAST:event_tfdNomeMouseClicked

    private void btnProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarActionPerformed
        if (medico.equals("true")) {
            //medico ativo
            if (ativo.equals("true")) {
                if (!tfdCPF.getText().equals("")) {
                    pessoaDAO.popularTabela(tabela, tfdCPF.getText(), "cpf", "AND MEDICO = 'true' AND ATIVO = 'true'");
                }
                if (!tfdNome.getText().equals("")) {
                    pessoaDAO.popularTabela(tabela, tfdNome.getText(), "nome", "AND MEDICO = 'true' AND ATIVO = 'true'");
                }else{
                    System.out.println("2323");
                    pessoaDAO.popularTabela(tabela, "MEDICO = 'true' AND ATIVO = 'true'");
                }
                //medico inativo
            }
            if (ativo.equals("false")) {
                if (!tfdCPF.getText().equals("")) {
                    pessoaDAO.popularTabela(tabela, tfdCPF.getText(), "cpf", "AND MEDICO = 'true' AND ATIVO = 'false'");
                }
                if (!tfdNome.getText().equals("")) {
                    pessoaDAO.popularTabela(tabela, tfdNome.getText(), "nome", "AND MEDICO = 'true' AND ATIVO = 'false'");
                }else{
                    System.out.println("232323");
                    pessoaDAO.popularTabela(tabela, "MEDICO = 'true' AND ATIVO = 'false'");
                }               
            }

        } else if (medico.equals("false")) {
          // System.out.println("2");
            if (ativo.equals("true")) {
                if (!tfdCPF.getText().equals("")) {
                    pessoaDAO.popularTabela(tabela, tfdCPF.getText(), "cpf", "AND MEDICO = 'false' AND ATIVO = 'true'");
                }
                if (!tfdNome.getText().equals("")) {
                    pessoaDAO.popularTabela(tabela, tfdNome.getText(), "nome", "AND MEDICO = 'false' AND ATIVO = 'true'");
                }else{
                    pessoaDAO.popularTabela(tabela, "MEDICO = 'false' AND ATIVO = 'true'");
                }
                //medico inativo
            }
            if (ativo.equals("false")) {
                if (!tfdCPF.getText().equals("")) {
                    pessoaDAO.popularTabela(tabela, tfdCPF.getText(), "cpf", "AND MEDICO = 'false' AND ATIVO = 'false'");
                }
                if (!tfdNome.getText().equals("")) {
                    pessoaDAO.popularTabela(tabela, tfdNome.getText(), "nome", "AND MEDICO = 'false' AND ATIVO = 'false'");
                }else{
                   pessoaDAO.popularTabela(tabela, "MEDICO = 'false' AND ATIVO = 'false'"); 
                }

            }
        } else {
            System.out.println("3");
            if (!tfdCPF.getText().equals("")) {
                pessoaDAO.popularTabela(tabela, tfdCPF.getText(), "cpf");
            }
            if (!tfdNome.getText().equals("")) {
                pessoaDAO.popularTabela(tabela, tfdNome.getText(), "nome");
            }else{
                pessoaDAO.popularTabela(tabela);
            }
            
        }
    }//GEN-LAST:event_btnProcurarActionPerformed

    private void tfdNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdNomeActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        if (evt.getClickCount() == 2) {
            JTable dadosTabela = tabela;
            pessoaSelecionada = (Pessoa) pessoaDAO.consultarId((int) dadosTabela.getValueAt(tabela.getSelectedRow(), 0));
            this.dispose();
        }
    }//GEN-LAST:event_tabelaMouseClicked

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
            java.util.logging.Logger.getLogger(procuraPaciente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(procuraPaciente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(procuraPaciente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(procuraPaciente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                procuraPaciente dialog = new procuraPaciente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnProcurar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField tfdCPF;
    private javax.swing.JTextField tfdNome;
    // End of variables declaration//GEN-END:variables
}
