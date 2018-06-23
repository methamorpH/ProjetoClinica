/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansAgenda;
import modeloConnection.ConexaoBD;

/**
 *
 * @author Mau
 */
public class DaoAgenda {
    
    BeansAgenda mod = new BeansAgenda();
    ConexaoBD connect = new ConexaoBD();
    ConexaoBD connectPaciente = new ConexaoBD();
    ConexaoBD connectMedico = new ConexaoBD();
    
    int cod_paciente;
    int cod_medico;
    
    public void Salvar(BeansAgenda mod){
        buscarPaciente(mod.getNome_paciente());
        buscarMedico(mod.getNome_medico());
        
        connect.conectarBD();
        try {
            PreparedStatement pst = connect.connect.prepareStatement("INSERT INTO public.agenda (agenda_cod_paciente, agenda_turno, agenda_cod_medico, agenda_data, agenda_motivo, agenda_status) VALUES (?, ?, ?, ?, ?, ?)");
            pst.setInt(1, cod_paciente);
            pst.setString(2, mod.getTurno());
            pst.setInt(3, cod_medico);
            pst.setDate(4, new java.sql.Date(mod.getData().getTime()));
            pst.setString(5, mod.getMotivo());
            pst.setString(6, mod.getStatus());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar dados no banco de dados: "+ex.getMessage());
        }
                
        connect.desconectarBD();
        
    }
    
    public void buscarPaciente(String nome_paciente){
        connectPaciente.conectarBD();
        connectPaciente.executarSql("SELECT * FROM public.pacientes WHERE paci_nome = '"+nome_paciente+"' ");
        try {
            connectPaciente.rs.first();
            cod_paciente = connectPaciente.rs.getInt("paci_codigo");
        } catch (SQLException ex) {
            //Logger.getLogger(DaoAgenda.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao buscar o Paciente no banco de dados: "+ex.getMessage());
        }
        
    }
    
    public void buscarMedico(String nome_medico){
        connectMedico.conectarBD();
        connectMedico.executarSql("SELECT * FROM public.medicos WHERE nome_medico = '"+nome_medico+"' ");
        try {
            connectMedico.rs.first();
            cod_medico = connectMedico.rs.getInt("cod_medico");
        } catch (SQLException ex) {
            //Logger.getLogger(DaoAgenda.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao buscar o Médico no banco de dados: "+ex.getMessage());
        }
        
    }
    
}
