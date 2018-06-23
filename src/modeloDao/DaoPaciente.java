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
            pst.setInt(7, mod.getCodigo());
            pst.setString(8, mod.getNascimento());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao salvar os dados no banco de dados!"+ex.getMessage());
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
    
}
