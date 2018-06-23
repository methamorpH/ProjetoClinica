/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansUsuario;
import modeloConnection.ConexaoBD;

/**
 *
 * @author Mau
 */
public class DaoUsuario {
    
    ConexaoBD connect = new ConexaoBD();
    BeansUsuario mod = new BeansUsuario();
    
        public void salvar(BeansUsuario mod){
            connect.conectarBD();
            
        try {
            PreparedStatement pst = connect.connect.prepareStatement("INSERT INTO public.usuarios(usu_nome, usu_senha, usu_tipo) VALUES (?, ?, ?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getSenha());
            pst.setString(3, mod.getTipo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar os dados no banco de dados:\n"+ex.getMessage());
        }
            connect.desconectarBD();
        }
        
        public BeansUsuario buscarUsuario(BeansUsuario mod){
            connect.conectarBD();
            connect.executarSql("SELECT * FROM public.usuarios WHERE usu_nome ILIKE '%"+mod.getPesquisa()+"%'");
            
        try {
            connect.rs.first();
            mod.setCodigo(connect.rs.getInt("usu_codigo"));
            mod.setNome(connect.rs.getString("usu_nome"));
            mod.setSenha(connect.rs.getString("usu_senha"));
            mod.setTipo(connect.rs.getString("usu_tipo"));

            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuário(a) não encontrado!");
        }
            connect.desconectarBD();
            return mod;
        }
        
        public void Editar(BeansUsuario mod){
            connect.conectarBD();
        try {
            PreparedStatement pst = connect.connect.prepareStatement("UPDATE public.usuarios SET usu_nome = ?, usu_senha = ?, usu_tipo = ? WHERE usu_codigo = ?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getSenha());
            pst.setString(3, mod.getTipo());
            pst.setInt(4, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao editar os dados:\n"+ex.getMessage());
        } 
            connect.desconectarBD();
        }
        
        public void Excluir(BeansUsuario mod){
            connect.conectarBD();
        try {
            PreparedStatement pst = connect.connect.prepareStatement("DELETE FROM public.usuarios WHERE usu_codigo = ? ");
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluídos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir os dados:\n"+ex.getMessage());
        }
            connect.desconectarBD();
        }
    
}