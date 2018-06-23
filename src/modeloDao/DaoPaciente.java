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
import modeloBeans.BeansPaciente;
import modeloConnection.ConexaoBD;

/**
 *
 * @author Mau
 */
public class DaoPaciente {
    
    ConexaoBD connect = new ConexaoBD();
    ConexaoBD connectBairro = new ConexaoBD();
    String bairro_nome;
    int bairro_codigo;
    
    public void Salvar(BeansPaciente mod){
        buscarCodBairro(mod.getBairro());
        connect.conectarBD();
        try {
            PreparedStatement pst = connect.connect.prepareStatement("INSERT INTO public.pacientes (paci_nome, paci_rg, paci_telefone, paci_rua, paci_cep, paci_complemento, paci_bairro_codigo, paci_nascimento) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getRg());
            pst.setString(3, mod.getTelefone());
            pst.setString(4, mod.getRua());
            pst.setString(5, mod.getCep());
            pst.setString(6, mod.getComplemento());
            pst.setInt(7, bairro_codigo);
            pst.setString(8, mod.getNascimento());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao salvar os dados no banco de dados!"+ex.getMessage());
        }
        connect.desconectarBD();
    }
    
    public BeansPaciente buscarPaciente(BeansPaciente mod){
            connect.conectarBD();
            connect.executarSql("SELECT * FROM public.pacientes WHERE paci_nome ILIKE '%"+mod.getPesquisa()+"%'");
            
        try {
            connect.rs.first();
            buscarNomeBairro(connect.rs.getInt("paci_bairro_codigo"));
            mod.setCodigo(connect.rs.getInt("paci_codigo"));
            mod.setNome(connect.rs.getString("paci_nome"));
            mod.setRg(connect.rs.getString("paci_rg"));
            mod.setTelefone(connect.rs.getString("paci_telefone"));
            mod.setRua(connect.rs.getString("paci_rua"));
            mod.setCep(connect.rs.getString("paci_cep"));
            mod.setComplemento(connect.rs.getString("paci_complemento"));
            mod.setBairro(bairro_nome);
            mod.setNascimento("paci_nascimento");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Paciente não encontrado!"+ex.getMessage());
        }
            connect.desconectarBD();
            return mod;
        }
    
    public void Editar(BeansPaciente mod){
            connect.conectarBD();
        try {
            PreparedStatement pst = connect.connect.prepareStatement("UPDATE public.pacientes SET paci_nome = ?, paci_rg = ?, paci_telefone = ?, paci_rua = ?, paci_cep = ?, paci_complemento = ?, paci_bairro_codigo = ?, paci_nascimento = ? WHERE paci_codigo = ?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getRg());
            pst.setString(3, mod.getTelefone());
            pst.setString(4, mod.getRua());
            pst.setString(5, mod.getCep());
            pst.setString(6, mod.getComplemento());
            pst.setInt(7, bairro_codigo);
            pst.setString(8, mod.getNascimento());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao editar os dados:\n"+ex.getMessage());
        } 
            connect.desconectarBD();
        }
        
        public void Excluir(BeansPaciente mod){
            connect.conectarBD();
        try {
            PreparedStatement pst = connect.connect.prepareStatement("DELETE FROM public.pacientes WHERE paci_codigo = ? ");
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluídos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir os dados:\n"+ex.getMessage());
        }
            connect.desconectarBD();
        }
    
    public void buscarCodBairro(String bairro_nome){
        connect.conectarBD();
        connect.executarSql("SELECT * FROM bairro WHERE bairro_nome = '"+bairro_nome+"' ");
        try {
            connect.rs.first();
            bairro_codigo = connect.rs.getInt("bairro_codigo");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar o bairro!");
        }
        
        connect.desconectarBD();
    }
    
    public void buscarNomeBairro(int bairro_codigo){
        connectBairro.conectarBD();
        
        try {
            connectBairro.executarSql("SELECT * FROM public.bairro WHERE bairro_codigo = '"+bairro_codigo+"'");
            connectBairro.rs.first();
            bairro_nome = connectBairro.rs.getString("bairro_nome");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar nome do bairro!");
        }
        connectBairro.desconectarBD();
}
    
}
