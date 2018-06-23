/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import modeloConnection.ConexaoBD;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansMedico;

/**
 *
 * @author Mau
 */
public class DaoMedico {
    
    ConexaoBD connect = new ConexaoBD();
    BeansMedico mod = new BeansMedico();
    
        public void salvar(BeansMedico mod){
            connect.conectarBD();
            
        try {
            PreparedStatement pst = connect.connect.prepareStatement("INSERT INTO public.medicos(nome_medico, especializacao_medico, crm_medico) VALUES (?, ?, ?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEspecializacao());
            pst.setInt(3, mod.getCrm());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar os dados no banco de dados:\n"+ex.getMessage());
        }
            connect.desconectarBD();
        }
        
        public BeansMedico buscarMedico(BeansMedico mod){
            connect.conectarBD();
            connect.executarSql("SELECT * FROM public.medicos WHERE nome_medico ILIKE '%"+mod.getPesquisa()+"%'");
            
        try {
            connect.rs.first();
            mod.setCodigo(connect.rs.getInt("cod_medico"));
            mod.setNome(connect.rs.getString("nome_medico"));
            mod.setEspecializacao(connect.rs.getString("especializacao_medico"));
            mod.setCrm(connect.rs.getInt("crm_medico"));

            
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Ocorreu um erro ao buscar o(a) Médico(a) no banco de dados:\n"+ex.getMessage());
            JOptionPane.showMessageDialog(null, "Médico(a) não encontrado!");
        }
            
            connect.desconectarBD();
            return mod;
        }
        
        public void Editar(BeansMedico mod){
            connect.conectarBD();
        try {
            PreparedStatement pst = connect.connect.prepareStatement("UPDATE public.medicos SET nome_medico = ?, especializacao_medico = ?, crm_medico = ? WHERE cod_medico = ?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEspecializacao());
            pst.setInt(3, mod.getCrm());
            pst.setInt(4, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao editar os dados:\n"+ex.getMessage());
        } 
            connect.desconectarBD();
        }
        
        public void Excluir(BeansMedico mod){
            connect.conectarBD();
        try {
            PreparedStatement pst = connect.connect.prepareStatement("DELETE FROM public.medicos WHERE cod_medico = ? ");
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluídos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir os dados:\n"+ex.getMessage());
        }
            connect.desconectarBD();
        }  
}
