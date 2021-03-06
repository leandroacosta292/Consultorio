/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import apoio.ConexaoBD;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Leandro
 */
public class relPessoa extends javax.swing.JDialog {

    /**
     * Creates new form relPessoa
     */
    public relPessoa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        rMedico = new javax.swing.JRadioButton();
        rPaciente = new javax.swing.JRadioButton();
        rAtivo = new javax.swing.JRadioButton();
        rInativo = new javax.swing.JRadioButton();
        rTodos = new javax.swing.JRadioButton();
        rTodosPessoa = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório Pessoa");

        buttonGroup2.add(rMedico);
        rMedico.setText("Médico");

        buttonGroup2.add(rPaciente);
        rPaciente.setText("Paciente");

        buttonGroup1.add(rAtivo);
        rAtivo.setText("Ativos");

        buttonGroup1.add(rInativo);
        rInativo.setText("Inativos");

        buttonGroup1.add(rTodos);
        rTodos.setSelected(true);
        rTodos.setText("Todos");

        buttonGroup2.add(rTodosPessoa);
        rTodosPessoa.setSelected(true);
        rTodosPessoa.setText("Todos");

        jButton1.setText("Gerar Relatório");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rInativo)
                            .addComponent(rTodos)
                            .addComponent(rAtivo))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rMedico)
                            .addComponent(rTodosPessoa)
                            .addComponent(rPaciente)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jButton1)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rMedico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rTodosPessoa))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rAtivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rInativo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rTodos)))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try {
                // Compila o relatorio
                JasperReport relatorio = JasperCompileManager.compileReport(getClass().getResourceAsStream("/relatorios/Lista Pessoas.jrxml"));

                // Mapeia campos de parametros para o relatorio, mesmo que nao existam
                Map parametros = new HashMap();

                // adiciona parametros
                parametros.put("PARAMETRO_WHERE", montarSQL());
                // Executa relatoio
                JasperPrint impressao = JasperFillManager.fillReport(relatorio, parametros, ConexaoBD.getInstance().getConnection());

                // Exibe resultado em video
                JasperViewer.viewReport(impressao, false);
                this.dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + e);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(relPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(relPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(relPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(relPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                relPessoa dialog = new relPessoa(new javax.swing.JFrame(), true);
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

    private String montarSQL() {
        String sql1 = "SELECT * FROM PESSOA";
        if (rAtivo.isSelected()) {
            sql1 = sql1 + " WHERE ativo = 'true'";
            if (rPaciente.isSelected()) {
                sql1 = sql1 + " AND medico = 'false'";
                System.out.println(sql1);
                return sql1;
            } else if (rMedico.isSelected()) {
                sql1 = sql1 + " AND medico = 'true'";
                System.out.println(sql1);
                return sql1;
            } else {
                System.out.println(sql1);
                return sql1;
            }
        } else if (rInativo.isSelected()) {
            sql1 = sql1 + " WHERE ativo = 'false'";
            if (rPaciente.isSelected()) {
                sql1 = sql1 + " AND medico = 'false'";
                System.out.println(sql1);
                return sql1;
            } else if (rMedico.isSelected()) {
                sql1 = sql1 + " AND medico = 'true'";
                System.out.println(sql1);
                return sql1;
            } else {
                System.out.println(sql1);
                return sql1;
            }
        } else if (rTodos.isSelected()) {
            if (rPaciente.isSelected()) {
                sql1 = sql1 + " WHERE medico = 'false'";
                System.out.println(sql1);
                return sql1;
            } else if (rMedico.isSelected()) {
                sql1 = sql1 + " WHERE medico = 'true'";
                System.out.println(sql1);
                return sql1;
            } else {
                System.out.println(sql1);
                return sql1;
            }
        }
        return sql1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JRadioButton rAtivo;
    private javax.swing.JRadioButton rInativo;
    private javax.swing.JRadioButton rMedico;
    private javax.swing.JRadioButton rPaciente;
    private javax.swing.JRadioButton rTodos;
    private javax.swing.JRadioButton rTodosPessoa;
    // End of variables declaration//GEN-END:variables
}
