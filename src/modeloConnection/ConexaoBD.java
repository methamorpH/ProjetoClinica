/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloConnection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Mau
 */
public class ConexaoBD {
    
    public Statement stm;
    public ResultSet rs;
    private final String driver = "org.postgresql.Driver";
    private final String caminho = "jdbc:postgresql://localhost:5432/projeto_clinica";
    private final String usuario = "postgres";
    private final String senha = "postgres";
    public Connection connect;
    
public void conectarBD(){
    System.setProperty("jdbc.Drivers", driver);
        try {
            connect = DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conexão com o banco de dados realizada com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao se conectar com o banco de dados:\n"+ex.getMessage());
        }
}

public void executarSql(String sql){
        try {
            stm = connect.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao executar a instrução SQL:\n"+ex.getMessage());
        }
}

public void desconectarBD(){
        try {
            connect.close();
            //JOptionPane.showMessageDialog(null, "Banco de dados desconectado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao fechar conexão com o banco de dados:\n"+ex.getMessage());
        }
}
}