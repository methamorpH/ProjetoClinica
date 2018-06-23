/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import modeloDao.DaoMedico;
import modeloBeans.BeansMedico;
import modeloBeans.ModeloTabela;
import modeloConnection.ConexaoBD;

/**
 *
 * @author Mau
 */
public class TelaFormMedico extends javax.swing.JFrame {
    
    BeansMedico mod = new BeansMedico();
    DaoMedico control = new DaoMedico();
    ConexaoBD connect = new ConexaoBD();
    int flagSalvar = 0;

    /**
     * Creates new form TelaFormMedico
     */
    public TelaFormMedico() {
        initComponents();
        preencherTabela("SELECT * FROM public.medicos ORDER BY nome_medico");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFormMedico = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jLabelCRM = new javax.swing.JLabel();
        jLabelEspecializacao = new javax.swing.JLabel();
        jFormattedTextFieldCRM = new javax.swing.JFormattedTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jComboBoxEspecializacao = new javax.swing.JComboBox<>();
        jTextFieldBuscarMedico = new javax.swing.JTextField();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jLabelId = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonNovo = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jPanelTabelaMedicos = new javax.swing.JPanel();
        jScrollPaneTabMedicos = new javax.swing.JScrollPane();
        jTableMedicos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelFormMedico.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelNome.setText("Nome: ");

        jLabelCRM.setText("CRM: ");

        jLabelEspecializacao.setText("Especialização:");

        jFormattedTextFieldCRM.setEnabled(false);

        jTextFieldNome.setEnabled(false);

        jComboBoxEspecializacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acupuntura", "Alergia e Imunologia", "Anestesiologia", "Angiologia", "Cancerologia", "Cardiologia", "Cirurgia Cardiovascular", "Cirurgia da Mão", "Cirurgia de cabeça e pescoço", "Cirurgia do Aparelho Digestivo", "Cirurgia Geral", "Cirurgia Pediátrica", "Cirurgia Plástica", "Cirurgia Torácica", "Cirurgia Vascular", "Clínica Médica", "Coloproctologia", "Dermatologia", "Endocrinologia e Metabologia", "Endoscopia", "Gastroenterologia", "Genética médica", "Geriatria", "Ginecologia e obstetrícia", "Hematologia e Hemoterapia", "Homeopatia", "Infectologia", "Mastologia", "Medicina de Emergência", "Medicina do Trabalho", "Medicina do Tráfego", "Medicina Esportiva", "Medicina Física e Reabilitação", "Medicina Intensiva", "Medicina Legal e Perícia Médica", "Medicina Nuclear", "Medicina Preventiva e Social", "Nefrologia", "Neurocirurgia", "Neurologia", "Nutrologia", "Obstetrícia", "Oftalmologia", "Ortopedia e Traumatologia", "Otorrinolaringologia", "Patologia", "Patologia Clínica/Medicina laboratorial", "Pediatria", "Pneumologia", "Psiquiatria", "Radioterapia", "Reumatologia", "Urologia" }));
        jComboBoxEspecializacao.setEnabled(false);

        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jLabelId.setText("ID:");

        jTextFieldId.setEnabled(false);

        javax.swing.GroupLayout jPanelFormMedicoLayout = new javax.swing.GroupLayout(jPanelFormMedico);
        jPanelFormMedico.setLayout(jPanelFormMedicoLayout);
        jPanelFormMedicoLayout.setHorizontalGroup(
            jPanelFormMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormMedicoLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanelFormMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormMedicoLayout.createSequentialGroup()
                        .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFormMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFormMedicoLayout.createSequentialGroup()
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabelEspecializacao, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxEspecializacao, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelFormMedicoLayout.createSequentialGroup()
                                .addComponent(jTextFieldBuscarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(47, Short.MAX_VALUE))
                    .addGroup(jPanelFormMedicoLayout.createSequentialGroup()
                        .addGroup(jPanelFormMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFormMedicoLayout.createSequentialGroup()
                                .addComponent(jLabelId, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelFormMedicoLayout.createSequentialGroup()
                                .addComponent(jLabelCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanelFormMedicoLayout.setVerticalGroup(
            jPanelFormMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormMedicoLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanelFormMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFormMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelEspecializacao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxEspecializacao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanelFormMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanelFormMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBuscarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTitulo.setText("Cadastro de Médico");

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Alterar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jPanelTabelaMedicos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableMedicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMedicosMouseClicked(evt);
            }
        });
        jScrollPaneTabMedicos.setViewportView(jTableMedicos);

        javax.swing.GroupLayout jPanelTabelaMedicosLayout = new javax.swing.GroupLayout(jPanelTabelaMedicos);
        jPanelTabelaMedicos.setLayout(jPanelTabelaMedicosLayout);
        jPanelTabelaMedicosLayout.setHorizontalGroup(
            jPanelTabelaMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTabelaMedicosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneTabMedicos, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTabelaMedicosLayout.setVerticalGroup(
            jPanelTabelaMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTabelaMedicosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneTabMedicos, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelFormMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTabelaMedicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(403, 403, 403))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelFormMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanelTabelaMedicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1056, 734));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        if(jTextFieldNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo 'Nome'");
            jTextFieldNome.requestFocus();
        }
        else if(jFormattedTextFieldCRM.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo 'CRM'");
            jFormattedTextFieldCRM.requestFocus();
        }
        
        else if(flagSalvar == 1) {
        mod.setNome(jTextFieldNome.getText());
        mod.setEspecializacao((String) jComboBoxEspecializacao.getSelectedItem());
        mod.setCrm(Integer.parseInt(jFormattedTextFieldCRM.getText()));
        control.salvar(mod);
        jTextFieldNome.setText("");
        jFormattedTextFieldCRM.setText("");
        jComboBoxEspecializacao.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jFormattedTextFieldCRM.setEnabled(false);
        jComboBoxEspecializacao.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonPesquisar.setEnabled(true);
        jButtonAtualizar.setEnabled(true);
        jTextFieldBuscarMedico.setEnabled(true);
        preencherTabela("SELECT * FROM public.medicos ORDER BY nome_medico");
        }else{
        mod.setNome(jTextFieldNome.getText());
        mod.setEspecializacao((String) jComboBoxEspecializacao.getSelectedItem());
        mod.setCrm(Integer.parseInt(jFormattedTextFieldCRM.getText()));
        mod.setCodigo(Integer.parseInt(jTextFieldId.getText()));
        control.Editar(mod);
        jTextFieldId.setText("");
        jTextFieldNome.setText("");
        jFormattedTextFieldCRM.setText("");
        jTextFieldBuscarMedico.setText("");
        jComboBoxEspecializacao.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jFormattedTextFieldCRM.setEnabled(false);
        jComboBoxEspecializacao.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonPesquisar.setEnabled(true);
        jTextFieldBuscarMedico.setEnabled(true);
        jButtonAtualizar.setEnabled(true);
        preencherTabela("SELECT * FROM public.medicos ORDER BY nome_medico");
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // TODO add your handling code here:
        flagSalvar = 1;
        jTextFieldNome.setEnabled(true);
        jFormattedTextFieldCRM.setEnabled(true);
        jComboBoxEspecializacao.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonPesquisar.setEnabled(false);
        jTextFieldId.setText("");
        jTextFieldNome.setText("");
        jFormattedTextFieldCRM.setText("");
        jTextFieldBuscarMedico.setText("");
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonPesquisar.setEnabled(false);
        jTextFieldBuscarMedico.setEnabled(false);
        jButtonAtualizar.setEnabled(false);
        jButtonNovo.setEnabled(false);
        preencherTabela("SELECT * FROM public.medicos ORDER BY nome_medico");
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        // TODO add your handling code here:
        mod.setPesquisa(jTextFieldBuscarMedico.getText());
        BeansMedico model = control.buscarMedico(mod);
        jTextFieldId.setText(String.valueOf(model.getCodigo()));
        jTextFieldNome.setText(model.getNome());
        jFormattedTextFieldCRM.setText(String.valueOf(model.getCrm()));
        jComboBoxEspecializacao.setSelectedItem(model.getEspecializacao());
        preencherTabela("SELECT * FROM public.medicos WHERE nome_medico ILIKE '%"+mod.getPesquisa()+"%'");
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        jTextFieldNome.setEnabled(!true);
        jFormattedTextFieldCRM.setEnabled(!true);
        jComboBoxEspecializacao.setEnabled(!true);
        jButtonSalvar.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jButtonNovo.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonPesquisar.setEnabled(true);
        jTextFieldId.setText("");
        jTextFieldNome.setText("");
        jFormattedTextFieldCRM.setText("");
        jTextFieldBuscarMedico.setText("");
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonAtualizar.setEnabled(true);
        jTextFieldBuscarMedico.setEnabled(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
        flagSalvar = 2;
        jTextFieldNome.setEnabled(true);
        jFormattedTextFieldCRM.setEnabled(true);
        jComboBoxEspecializacao.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonNovo.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonPesquisar.setEnabled(false);
        jTextFieldBuscarMedico.setEnabled(false);
        jButtonAtualizar.setEnabled(false);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir?");
        if(resposta == JOptionPane.YES_OPTION){
            mod.setCodigo(Integer.parseInt(jTextFieldId.getText()));
            control.Excluir(mod);
        jTextFieldId.setText("");
        jTextFieldNome.setText("");
        jFormattedTextFieldCRM.setText("");
        jTextFieldBuscarMedico.setText("");
        jComboBoxEspecializacao.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jFormattedTextFieldCRM.setEnabled(false);
        jComboBoxEspecializacao.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false); 
        jButtonPesquisar.setEnabled(true);
        jButtonAtualizar.setEnabled(true);
        jButtonNovo.setEnabled(true);
        preencherTabela("SELECT * FROM public.medicos ORDER BY nome_medico");
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTableMedicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMedicosMouseClicked
        // TODO add your handling code here:
        String id_medico = ""+jTableMedicos.getValueAt(jTableMedicos.getSelectedRow(), 0);
        connect.conectarBD();
        connect.executarSql("SELECT * FROM medicos WHERE cod_medico = '"+id_medico+"'");
        try {
            connect.rs.first();
            jTextFieldId.setText(String.valueOf(connect.rs.getInt("cod_medico")));
            jTextFieldNome.setText(connect.rs.getString("nome_medico"));
            jComboBoxEspecializacao.setSelectedItem(connect.rs.getString("especializacao_medico"));
            jFormattedTextFieldCRM.setText(connect.rs.getString("crm_medico"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao buscar registros no banco de dados: "+ex.getMessage());
        }
        connect.desconectarBD();
        jButtonNovo.setEnabled(false);
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jTextFieldId.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jFormattedTextFieldCRM.setEnabled(false);
        jComboBoxEspecializacao.setEnabled(false);
                
    }//GEN-LAST:event_jTableMedicosMouseClicked

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        // TODO add your handling code here:
        preencherTabela("SELECT * FROM public.medicos ORDER BY nome_medico");
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String[] colunas = new String[] {"ID", "Nome", "Especialização", "CRM"};
        connect.conectarBD();
        connect.executarSql(Sql);
        try {
            connect.rs.first();
                do{
                    dados.add(new Object[] {connect.rs.getInt("cod_medico"), connect.rs.getString("nome_medico"), connect.rs.getString("especializacao_medico"), connect.rs.getString("crm_medico")});
                    
                }while(connect.rs.next());
        } catch (SQLException ex) {
            //Logger.getLogger(TelaFormMedico.class.getName()).log(Level.SEVERE, null, ex);
            //JOptionPane.showMessageDialog(null, "Ocorreu um erro ao buscar registros no banco de dados: "+ex.getMessage());
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTableMedicos.setModel(modelo);
        jTableMedicos.getColumnModel().getColumn(0).setPreferredWidth(23);
        jTableMedicos.getColumnModel().getColumn(0).setResizable(false);
        jTableMedicos.getColumnModel().getColumn(1).setPreferredWidth(180);
        jTableMedicos.getColumnModel().getColumn(1).setResizable(false);
        jTableMedicos.getColumnModel().getColumn(2).setPreferredWidth(80);
        jTableMedicos.getColumnModel().getColumn(2).setResizable(false);
        jTableMedicos.getColumnModel().getColumn(3).setPreferredWidth(80);
        jTableMedicos.getColumnModel().getColumn(3).setResizable(false);
        jTableMedicos.getTableHeader().setReorderingAllowed(false);
        jTableMedicos.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTableMedicos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        connect.desconectarBD();
    }
    
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
            java.util.logging.Logger.getLogger(TelaFormMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFormMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFormMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFormMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFormMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxEspecializacao;
    private javax.swing.JFormattedTextField jFormattedTextFieldCRM;
    private javax.swing.JLabel jLabelCRM;
    private javax.swing.JLabel jLabelEspecializacao;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelFormMedico;
    private javax.swing.JPanel jPanelTabelaMedicos;
    private javax.swing.JScrollPane jScrollPaneTabMedicos;
    private javax.swing.JTable jTableMedicos;
    private javax.swing.JTextField jTextFieldBuscarMedico;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}