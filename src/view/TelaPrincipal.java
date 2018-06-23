/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import modeloConnection.ConexaoBD;


/**
 *
 * @author Mau
 */
public class TelaPrincipal extends javax.swing.JFrame {

    ConexaoBD connect = new ConexaoBD();
    TelaFormMedico telaMedico = new TelaFormMedico();
    TelaFormUsuario telaUsuario = new TelaFormUsuario();
    TelaFormPaciente telaPaciente = new TelaFormPaciente();
    TelaFormAgenda telaAgenda = new TelaFormAgenda();
    
    public TelaPrincipal(String usuario) {
        initComponents();
        jLabelUsuarioLogadoNome.setText("Usuário: "+usuario);
        connect.conectarBD();
        
    }

    private TelaPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelPainelTelaFundo = new javax.swing.JLabel();
        jInternalFrameTelaBemVindo = new javax.swing.JInternalFrame();
        jButtonFecharTelaBemVindo = new javax.swing.JButton();
        jPanelInternal = new javax.swing.JPanel();
        jButtonCadUsuario = new javax.swing.JButton();
        jButtonCadMedico = new javax.swing.JButton();
        jButtonCadPacientes = new javax.swing.JButton();
        jButtonCadAgenda = new javax.swing.JButton();
        jPanelAgenda = new javax.swing.JPanel();
        jLabelAgenda = new javax.swing.JLabel();
        jPanelCadastros = new javax.swing.JPanel();
        jLabelCadastros = new javax.swing.JLabel();
        jPanelUsuarioLogado = new javax.swing.JPanel();
        jLabelUsuarioLogadoNome = new javax.swing.JLabel();
        jLabelPainelFundo = new javax.swing.JLabel();
        jLabelTituloTelaBemVindo = new javax.swing.JLabel();
        jButtonFechar = new javax.swing.JButton();
        jLabelFundoTelaPrincipal = new javax.swing.JLabel();
        jMenuBarTelaPrincipal = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCadMedico = new javax.swing.JMenuItem();
        jMenuItemCadPaciente = new javax.swing.JMenuItem();
        jMenuItemCadUsuario = new javax.swing.JMenuItem();
        jMenuFerramentas = new javax.swing.JMenu();
        jMenuItemTelaBemVindo = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();

        jLabelPainelTelaFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/internalframe.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jInternalFrameTelaBemVindo.setTitle("Bem-Vindo(a)");
        jInternalFrameTelaBemVindo.setVisible(true);
        jInternalFrameTelaBemVindo.getContentPane().setLayout(null);

        jButtonFecharTelaBemVindo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_close.png"))); // NOI18N
        jButtonFecharTelaBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharTelaBemVindoActionPerformed(evt);
            }
        });
        jInternalFrameTelaBemVindo.getContentPane().add(jButtonFecharTelaBemVindo);
        jButtonFecharTelaBemVindo.setBounds(1100, 10, 60, 50);

        jPanelInternal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelInternal.setLayout(null);

        jButtonCadUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_usuarios.png"))); // NOI18N
        jButtonCadUsuario.setToolTipText("Usuário");
        jButtonCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadUsuarioActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonCadUsuario);
        jButtonCadUsuario.setBounds(390, 70, 130, 130);

        jButtonCadMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_medico.png"))); // NOI18N
        jButtonCadMedico.setToolTipText("Médico");
        jButtonCadMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadMedicoActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonCadMedico);
        jButtonCadMedico.setBounds(90, 70, 130, 130);

        jButtonCadPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_paciente.png"))); // NOI18N
        jButtonCadPacientes.setToolTipText("Enfermeiro(a)");
        jButtonCadPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadPacientesActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonCadPacientes);
        jButtonCadPacientes.setBounds(240, 70, 130, 130);

        jButtonCadAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_agenda.png"))); // NOI18N
        jButtonCadAgenda.setToolTipText("Médico");
        jButtonCadAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadAgendaActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonCadAgenda);
        jButtonCadAgenda.setBounds(240, 300, 130, 130);

        jLabelAgenda.setText("Agendamentos");

        javax.swing.GroupLayout jPanelAgendaLayout = new javax.swing.GroupLayout(jPanelAgenda);
        jPanelAgenda.setLayout(jPanelAgendaLayout);
        jPanelAgendaLayout.setHorizontalGroup(
            jPanelAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAgendaLayout.createSequentialGroup()
                .addContainerGap(177, Short.MAX_VALUE)
                .addComponent(jLabelAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
        );
        jPanelAgendaLayout.setVerticalGroup(
            jPanelAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelAgenda, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelInternal.add(jPanelAgenda);
        jPanelAgenda.setBounds(90, 260, 430, 30);

        jLabelCadastros.setText("Cadastros");

        javax.swing.GroupLayout jPanelCadastrosLayout = new javax.swing.GroupLayout(jPanelCadastros);
        jPanelCadastros.setLayout(jPanelCadastrosLayout);
        jPanelCadastrosLayout.setHorizontalGroup(
            jPanelCadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastrosLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabelCadastros, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
        );
        jPanelCadastrosLayout.setVerticalGroup(
            jPanelCadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCadastros, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelInternal.add(jPanelCadastros);
        jPanelCadastros.setBounds(90, 30, 430, 30);

        javax.swing.GroupLayout jPanelUsuarioLogadoLayout = new javax.swing.GroupLayout(jPanelUsuarioLogado);
        jPanelUsuarioLogado.setLayout(jPanelUsuarioLogadoLayout);
        jPanelUsuarioLogadoLayout.setHorizontalGroup(
            jPanelUsuarioLogadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsuarioLogadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelUsuarioLogadoNome, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelUsuarioLogadoLayout.setVerticalGroup(
            jPanelUsuarioLogadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelUsuarioLogadoNome, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelInternal.add(jPanelUsuarioLogado);
        jPanelUsuarioLogado.setBounds(600, 30, 340, 30);

        jLabelPainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/internalframe.png"))); // NOI18N
        jPanelInternal.add(jLabelPainelFundo);
        jLabelPainelFundo.setBounds(0, 0, 960, 440);

        jInternalFrameTelaBemVindo.getContentPane().add(jPanelInternal);
        jPanelInternal.setBounds(0, 70, 960, 450);

        jLabelTituloTelaBemVindo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTituloTelaBemVindo.setText("Sistema Clínica");
        jInternalFrameTelaBemVindo.getContentPane().add(jLabelTituloTelaBemVindo);
        jLabelTituloTelaBemVindo.setBounds(410, 10, 190, 50);

        jButtonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_close.png"))); // NOI18N
        jButtonFechar.setToolTipText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });
        jInternalFrameTelaBemVindo.getContentPane().add(jButtonFechar);
        jButtonFechar.setBounds(920, 10, 30, 30);

        getContentPane().add(jInternalFrameTelaBemVindo);
        jInternalFrameTelaBemVindo.setBounds(20, 10, 980, 540);

        jLabelFundoTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo_sistema.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoTelaPrincipal);
        jLabelFundoTelaPrincipal.setBounds(0, 0, 1020, 576);

        jMenuCadastro.setText("Cadastro");

        jMenuItemCadMedico.setText("Médico");
        jMenuItemCadMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadMedicoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadMedico);

        jMenuItemCadPaciente.setText("Paciente");
        jMenuItemCadPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadPacienteActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadPaciente);

        jMenuItemCadUsuario.setText("Usuário");
        jMenuItemCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadUsuarioActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadUsuario);

        jMenuBarTelaPrincipal.add(jMenuCadastro);

        jMenuFerramentas.setText("Ferramentas");

        jMenuItemTelaBemVindo.setText("Tela Bem-Vindo(a)");
        jMenuItemTelaBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTelaBemVindoActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItemTelaBemVindo);

        jMenuBarTelaPrincipal.add(jMenuFerramentas);

        jMenuSair.setText("Sair");
        jMenuSair.setToolTipText("Fechar o Sistema");
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
        });
        jMenuBarTelaPrincipal.add(jMenuSair);

        setJMenuBar(jMenuBarTelaPrincipal);

        setSize(new java.awt.Dimension(1033, 636));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFecharTelaBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharTelaBemVindoActionPerformed
        // TODO add your handling code here:
        jInternalFrameTelaBemVindo.dispose();
    }//GEN-LAST:event_jButtonFecharTelaBemVindoActionPerformed

    private void jMenuItemTelaBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTelaBemVindoActionPerformed
        // TODO add your handling code here:
        jInternalFrameTelaBemVindo.setVisible(true);
    }//GEN-LAST:event_jMenuItemTelaBemVindoActionPerformed

    private void jMenuItemCadMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadMedicoActionPerformed
        // TODO add your handling code here:
        //TelaFormMedico tela = new TelaFormMedico();
        //tela.setVisible(true);
        if(telaMedico == null){
            telaMedico = new TelaFormMedico();
            telaMedico.setVisible(true);
            telaMedico.setResizable(false);   
        } else {
            telaMedico.setVisible(true);
            telaMedico.setResizable(false);
        }
    }//GEN-LAST:event_jMenuItemCadMedicoActionPerformed

    private void jButtonCadMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadMedicoActionPerformed
        // TODO add your handling code here:
        //TelaFormMedico tela = new TelaFormMedico();
        //tela.setVisible(true);
        if(telaMedico == null){
            telaMedico = new TelaFormMedico();
            telaMedico.setVisible(true);
            telaMedico.setResizable(false);   
        } else {
            telaMedico.setVisible(true);
            telaMedico.setResizable(false);
        }
    }//GEN-LAST:event_jButtonCadMedicoActionPerformed

    private void jButtonCadAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadAgendaActionPerformed
        // TODO add your handling code here:
        if(telaAgenda == null){
            telaAgenda = new TelaFormAgenda();
            telaAgenda.setVisible(true);
            telaAgenda.setResizable(false);   
        } else {
            telaAgenda.setVisible(true);
            telaAgenda.setResizable(false);
        }
    }//GEN-LAST:event_jButtonCadAgendaActionPerformed

    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked
        // TODO add your handling code here:
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente sair do sistema?");
        if(resposta == JOptionPane.YES_OPTION){
            System.exit(0);
        }
        
    }//GEN-LAST:event_jMenuSairMouseClicked

    private void jMenuItemCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadUsuarioActionPerformed
        // TODO add your handling code here:
        if(telaUsuario == null){
            telaUsuario = new TelaFormUsuario();
            telaUsuario.setVisible(true);
            telaUsuario.setResizable(false);   
        } else {
            telaUsuario.setVisible(true);
            telaUsuario.setResizable(false);
        }
    }//GEN-LAST:event_jMenuItemCadUsuarioActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        // TODO add your handling code here:
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente fechar?");
        if(resposta == JOptionPane.YES_OPTION){
            jInternalFrameTelaBemVindo.dispose();
        }
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonCadPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadPacientesActionPerformed
        // TODO add your handling code here:
        if(telaPaciente == null){
            telaPaciente = new TelaFormPaciente();
            telaPaciente.setVisible(true);
            telaPaciente.setResizable(false);   
        } else {
            telaPaciente.setVisible(true);
            telaPaciente.setResizable(false);
        }
    }//GEN-LAST:event_jButtonCadPacientesActionPerformed

    private void jMenuItemCadPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadPacienteActionPerformed
        // TODO add your handling code here:
        if(telaPaciente == null){
            telaPaciente = new TelaFormPaciente();
            telaPaciente.setVisible(true);
            telaPaciente.setResizable(false);   
        } else {
            telaPaciente.setVisible(true);
            telaPaciente.setResizable(false);
        }
    }//GEN-LAST:event_jMenuItemCadPacienteActionPerformed

    private void jButtonCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadUsuarioActionPerformed
        // TODO add your handling code here:
        if(telaUsuario == null){
            telaUsuario = new TelaFormUsuario();
            telaUsuario.setVisible(true);
            telaUsuario.setResizable(false);   
        } else {
            telaUsuario.setVisible(true);
            telaUsuario.setResizable(false);
        }
    }//GEN-LAST:event_jButtonCadUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadAgenda;
    private javax.swing.JButton jButtonCadMedico;
    private javax.swing.JButton jButtonCadPacientes;
    private javax.swing.JButton jButtonCadUsuario;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonFecharTelaBemVindo;
    private javax.swing.JInternalFrame jInternalFrameTelaBemVindo;
    private javax.swing.JLabel jLabelAgenda;
    private javax.swing.JLabel jLabelCadastros;
    private javax.swing.JLabel jLabelFundoTelaPrincipal;
    private javax.swing.JLabel jLabelPainelFundo;
    private javax.swing.JLabel jLabelPainelTelaFundo;
    private javax.swing.JLabel jLabelTituloTelaBemVindo;
    private javax.swing.JLabel jLabelUsuarioLogadoNome;
    private javax.swing.JMenuBar jMenuBarTelaPrincipal;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuFerramentas;
    private javax.swing.JMenuItem jMenuItemCadMedico;
    private javax.swing.JMenuItem jMenuItemCadPaciente;
    private javax.swing.JMenuItem jMenuItemCadUsuario;
    private javax.swing.JMenuItem jMenuItemTelaBemVindo;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanelAgenda;
    private javax.swing.JPanel jPanelCadastros;
    private javax.swing.JPanel jPanelInternal;
    private javax.swing.JPanel jPanelUsuarioLogado;
    // End of variables declaration//GEN-END:variables
}
