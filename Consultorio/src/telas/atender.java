/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import daos.AtendimentoDAO;
import daos.DoencaDAO;
import daos.PessoaDAO;
import daos.ReceituarioDAO;
import entidades.AgendaEnt;
import entidades.Atendimento;
import entidades.Pessoa;
import entidades.Receituario;

/**
 *
 * @author leandro
 */
public class atender extends javax.swing.JInternalFrame {
    
    DoencaDAO doencaDAO = new DoencaDAO();
    PessoaDAO pessoaDAO = new PessoaDAO();
    AtendimentoDAO atendDAO = new AtendimentoDAO();
    ReceituarioDAO receiDAO = new ReceituarioDAO();
    Pessoa tmpPessoa;
    Pessoa tmpMedico;
    AgendaEnt agendamento;

    /**
     * Creates new form atender
     */
    public atender() {
        initComponents();
        doencaDAO.popularTabela(tabelaDoenca);
        
    }
    
    public atender(AgendaEnt agendamento) {
        initComponents();
        doencaDAO.popularTabela(tabelaDoenca);
        tmpPessoa = (Pessoa) pessoaDAO.consultarId(agendamento.getPessoaId());
        tmpMedico = (Pessoa) pessoaDAO.consultarId(agendamento.getMedicoId());
        tfdMedico.setText(tmpMedico.getNome());
        tfdPaciente.setText(tmpPessoa.getNome());
        this.agendamento = agendamento;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnProcurar = new javax.swing.JButton();
        Ficha = new javax.swing.JTabbedPane();
        FichaPaciente = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblUltAtend = new javax.swing.JTable();
        tfdMedico = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblNome1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblUltAtend1 = new javax.swing.JTable();
        lblNome2 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        tfdPaciente = new javax.swing.JTextField();
        Atendimento = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfdQueixas = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfdConduta = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaDoenca = new javax.swing.JTable();
        Prescricao = new javax.swing.JPanel();
        cmbTipoMed = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tfdNomeMed = new javax.swing.JTextField();
        tfdPrincipioAtivo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tfdViaAdm = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tfdConcentracao = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtPosso = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        tfdApresent = new javax.swing.JTextField();
        tfdLaboratorio = new javax.swing.JTextField();
        Exames = new javax.swing.JPanel();
        Encaminhamentos = new javax.swing.JPanel();
        Arquivos = new javax.swing.JPanel();
        Impressoes = new javax.swing.JPanel();

        setTitle("Atendimento");

        jPanel3.setBackground(java.awt.SystemColor.activeCaption);

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/salvar32.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setMaximumSize(new java.awt.Dimension(122, 50));
        btnSalvar.setMinimumSize(new java.awt.Dimension(122, 50));
        btnSalvar.setPreferredSize(new java.awt.Dimension(122, 50));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sair32.png"))); // NOI18N
        btnSair.setText("Fechar");
        btnSair.setMaximumSize(new java.awt.Dimension(122, 50));
        btnSair.setMinimumSize(new java.awt.Dimension(122, 50));
        btnSair.setPreferredSize(new java.awt.Dimension(122, 50));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/imprimir32.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.setMaximumSize(new java.awt.Dimension(122, 50));
        btnImprimir.setMinimumSize(new java.awt.Dimension(122, 50));
        btnImprimir.setPreferredSize(new java.awt.Dimension(122, 50));

        btnProcurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/procurar32.png"))); // NOI18N
        btnProcurar.setText("Procurar");
        btnProcurar.setMaximumSize(new java.awt.Dimension(122, 50));
        btnProcurar.setMinimumSize(new java.awt.Dimension(122, 50));
        btnProcurar.setPreferredSize(new java.awt.Dimension(122, 50));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        Ficha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Ficha.setToolTipText("");

        FichaPaciente.setBackground(java.awt.SystemColor.activeCaption);

        tblUltAtend.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Data", "Motivo", "Pago"
            }
        ));
        jScrollPane4.setViewportView(tblUltAtend);

        tfdMedico.setEditable(false);

        lblNome.setText("Paciente");

        lblNome1.setText("Ultimos Atendimentos");

        tblUltAtend1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Data", "Motivo", "Exame"
            }
        ));
        jScrollPane5.setViewportView(tblUltAtend1);

        lblNome2.setText("Ultimos Exames");

        jLabel23.setText("Médico");

        jTextArea4.setColumns(20);
        jTextArea4.setRows(1);
        jTextArea4.setText("Atenção:\n* Não é possível editar um atendimento finalizado\n* É possível efetuar a \"correção de atendimento\"\n");
        jScrollPane8.setViewportView(jTextArea4);

        tfdPaciente.setEditable(false);

        javax.swing.GroupLayout FichaPacienteLayout = new javax.swing.GroupLayout(FichaPaciente);
        FichaPaciente.setLayout(FichaPacienteLayout);
        FichaPacienteLayout.setHorizontalGroup(
            FichaPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FichaPacienteLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(FichaPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FichaPacienteLayout.createSequentialGroup()
                        .addGroup(FichaPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome2)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(709, Short.MAX_VALUE))
                    .addGroup(FichaPacienteLayout.createSequentialGroup()
                        .addGroup(FichaPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FichaPacienteLayout.createSequentialGroup()
                                .addGroup(FichaPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNome)
                                    .addComponent(jLabel23))
                                .addGap(18, 18, 18)
                                .addGroup(FichaPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfdPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                                    .addComponent(tfdMedico)))
                            .addComponent(lblNome1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(189, 189, 189))))
        );
        FichaPacienteLayout.setVerticalGroup(
            FichaPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FichaPacienteLayout.createSequentialGroup()
                .addGroup(FichaPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FichaPacienteLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(FichaPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(tfdMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(FichaPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfdPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome))
                        .addGap(26, 26, 26)
                        .addComponent(lblNome1)
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FichaPacienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNome2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        Ficha.addTab("Ficha Paciente", FichaPaciente);

        Atendimento.setBackground(java.awt.SystemColor.activeCaption);

        tfdQueixas.setColumns(20);
        tfdQueixas.setRows(5);
        jScrollPane1.setViewportView(tfdQueixas);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setText("Queixas - Motivo do Atendimento");

        jLabel2.setText("Doença Presumida");

        jLabel3.setText("Conduta");

        tfdConduta.setColumns(20);
        tfdConduta.setRows(5);
        jScrollPane2.setViewportView(tfdConduta);

        tabelaDoenca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "CID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaDoenca.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tabelaDoenca);

        javax.swing.GroupLayout AtendimentoLayout = new javax.swing.GroupLayout(Atendimento);
        Atendimento.setLayout(AtendimentoLayout);
        AtendimentoLayout.setHorizontalGroup(
            AtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AtendimentoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(AtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                    .addGroup(AtendimentoLayout.createSequentialGroup()
                        .addGroup(AtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(AtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AtendimentoLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AtendimentoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)))
                .addGap(39, 39, 39))
        );
        AtendimentoLayout.setVerticalGroup(
            AtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AtendimentoLayout.createSequentialGroup()
                .addGroup(AtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AtendimentoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AtendimentoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(AtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AtendimentoLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        Ficha.addTab("Atendimento", Atendimento);

        Prescricao.setBackground(java.awt.SystemColor.activeCaption);

        cmbTipoMed.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal", "Restrito" }));
        cmbTipoMed.setSelectedItem(null);

        jLabel12.setText("Tipo do Medicamento");

        jLabel13.setText("Nome do Medicamento*");

        tfdNomeMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdNomeMedActionPerformed(evt);
            }
        });

        tfdPrincipioAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdPrincipioAtivoActionPerformed(evt);
            }
        });

        jLabel14.setText("Laboratório");

        tfdViaAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdViaAdmActionPerformed(evt);
            }
        });

        jLabel15.setText("Principio Ativo");

        tfdConcentracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdConcentracaoActionPerformed(evt);
            }
        });

        jLabel16.setText("Concentração");

        jLabel17.setText("Apresentação");

        txtPosso.setColumns(20);
        txtPosso.setRows(5);
        jScrollPane6.setViewportView(txtPosso);

        jLabel20.setText("Possologia/Orientações*");

        jLabel21.setText("Via de Administração");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome Medicamento", "P. Ativo", "Laboratório", "Apresentação", "Concentração", "Possologia"
            }
        ));
        jScrollPane7.setViewportView(jTable2);

        tfdApresent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdApresentActionPerformed(evt);
            }
        });

        tfdLaboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdLaboratorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PrescricaoLayout = new javax.swing.GroupLayout(Prescricao);
        Prescricao.setLayout(PrescricaoLayout);
        PrescricaoLayout.setHorizontalGroup(
            PrescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrescricaoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(PrescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane7)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PrescricaoLayout.createSequentialGroup()
                        .addGroup(PrescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(PrescricaoLayout.createSequentialGroup()
                                .addGroup(PrescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfdPrincipioAtivo)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbTipoMed, 0, 202, Short.MAX_VALUE)
                                    .addComponent(tfdNomeMed, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfdConcentracao))
                                .addGap(40, 40, 40)
                                .addGroup(PrescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel21)
                                    .addComponent(tfdLaboratorio, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jLabel14)
                                    .addComponent(tfdViaAdm)
                                    .addComponent(jLabel17)
                                    .addComponent(tfdApresent))))
                        .addGap(40, 40, 40)
                        .addGroup(PrescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PrescricaoLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(0, 367, Short.MAX_VALUE))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE))))
                .addGap(108, 108, 108))
        );
        PrescricaoLayout.setVerticalGroup(
            PrescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrescricaoLayout.createSequentialGroup()
                .addGroup(PrescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrescricaoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbTipoMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(PrescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrescricaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PrescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrescricaoLayout.createSequentialGroup()
                        .addGroup(PrescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfdLaboratorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdNomeMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PrescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PrescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfdPrincipioAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdViaAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PrescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PrescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfdConcentracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdApresent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        Ficha.addTab("Prescrição", Prescricao);

        javax.swing.GroupLayout ExamesLayout = new javax.swing.GroupLayout(Exames);
        Exames.setLayout(ExamesLayout);
        ExamesLayout.setHorizontalGroup(
            ExamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1112, Short.MAX_VALUE)
        );
        ExamesLayout.setVerticalGroup(
            ExamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );

        Ficha.addTab("Exames", Exames);

        javax.swing.GroupLayout EncaminhamentosLayout = new javax.swing.GroupLayout(Encaminhamentos);
        Encaminhamentos.setLayout(EncaminhamentosLayout);
        EncaminhamentosLayout.setHorizontalGroup(
            EncaminhamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1112, Short.MAX_VALUE)
        );
        EncaminhamentosLayout.setVerticalGroup(
            EncaminhamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );

        Ficha.addTab("Encaminhamentos", Encaminhamentos);

        javax.swing.GroupLayout ArquivosLayout = new javax.swing.GroupLayout(Arquivos);
        Arquivos.setLayout(ArquivosLayout);
        ArquivosLayout.setHorizontalGroup(
            ArquivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1112, Short.MAX_VALUE)
        );
        ArquivosLayout.setVerticalGroup(
            ArquivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );

        Ficha.addTab("Arquivos", Arquivos);

        javax.swing.GroupLayout ImpressoesLayout = new javax.swing.GroupLayout(Impressoes);
        Impressoes.setLayout(ImpressoesLayout);
        ImpressoesLayout.setHorizontalGroup(
            ImpressoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1112, Short.MAX_VALUE)
        );
        ImpressoesLayout.setVerticalGroup(
            ImpressoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );

        Ficha.addTab("Impressões", Impressoes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(Ficha, javax.swing.GroupLayout.PREFERRED_SIZE, 1123, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Ficha))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
//        Atendimento atendimento = new Atendimento();
//        atendimento.setIdAtendimento(agendamento.getIdAtendimento());
//        atendimento.setAtendimento(tfdQueixas.getText());
//        atendimento.setConduta(tfdConduta.getText());
//        atendimento.setMedicoId(tmpMedico.getID());
//        atendimento.setPessoaId(tmpPessoa.getID());
//        atendimento.setDoencaId(tabelaDoenca.getSelectedRow());
//        atendDAO.salvar(atendimento);

        ///presc
        Receituario receita = new Receituario();
        receita.setTipoMedicamento((String) cmbTipoMed.getSelectedItem());
        receita.setNome(tfdNomeMed.getText());
        receita.setLaboratorio(tfdLaboratorio.getText());
        receita.setPrincipioAtivo(tfdPrincipioAtivo.getText());
        receita.setViaAdm(tfdViaAdm.getText());
        receita.setConcentracao(tfdConcentracao.getText());
        receita.setApresentacao(tfdApresent.getText());
        receita.setPossologia(txtPosso.getText());
        receita.setAtendimentoMedId(agendamento.getIdAtendimento());
        receiDAO.salvar(receita);
        
                                                

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void tfdLaboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdLaboratorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdLaboratorioActionPerformed

    private void tfdApresentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdApresentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdApresentActionPerformed

    private void tfdConcentracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdConcentracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdConcentracaoActionPerformed

    private void tfdViaAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdViaAdmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdViaAdmActionPerformed

    private void tfdPrincipioAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdPrincipioAtivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdPrincipioAtivoActionPerformed

    private void tfdNomeMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdNomeMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdNomeMedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Arquivos;
    private javax.swing.JPanel Atendimento;
    private javax.swing.JPanel Encaminhamentos;
    private javax.swing.JPanel Exames;
    private javax.swing.JTabbedPane Ficha;
    private javax.swing.JPanel FichaPaciente;
    private javax.swing.JPanel Impressoes;
    private javax.swing.JPanel Prescricao;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnProcurar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cmbTipoMed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JTable tabelaDoenca;
    private javax.swing.JTable tblUltAtend;
    private javax.swing.JTable tblUltAtend1;
    private javax.swing.JTextField tfdApresent;
    private javax.swing.JTextField tfdConcentracao;
    private javax.swing.JTextArea tfdConduta;
    private javax.swing.JTextField tfdLaboratorio;
    private javax.swing.JTextField tfdMedico;
    private javax.swing.JTextField tfdNomeMed;
    private javax.swing.JTextField tfdPaciente;
    private javax.swing.JTextField tfdPrincipioAtivo;
    private javax.swing.JTextArea tfdQueixas;
    private javax.swing.JTextField tfdViaAdm;
    private javax.swing.JTextArea txtPosso;
    // End of variables declaration//GEN-END:variables
}
