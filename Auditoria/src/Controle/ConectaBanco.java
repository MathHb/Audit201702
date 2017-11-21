/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Gennari
 */
public class ConectaBanco {
    
      public Statement stm; //Responsável por preparar e realizar pesquisas no banco de dados
    public ResultSet rs;  // Responsável por armazenar o resultado de uma pesquisa passada para o statement
    private String driver = "org.firebirdsql.jdbc.FBDriver"; //Responsável por identificar o serviço de banco de dados
    private String caminho = "jdbc:firebirdsql:localhost:C:/Users/Gennari/Downloads/BD_AUDITORIA_PRONTO.FDB"; //Responsável por pegar o local do banco de dados
    private String usuario = "sysdba";
    private String senha = "masterkey";
    public Connection conn; // Responsável por realizar a conexão com o banco de dados
    
    public void conexao(){
        
        try {
            System.setProperty("jdbc.Drivers", driver);
            conn = DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conectado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão" +ex.getMessage());
        }
        
    }
    
    public void executaSql(String sql){
    
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro de execução! \n Erro: " + ex.getMessage());
        }
    
    }
    
    public void desconecta(){
        try {
            conn.close();
            JOptionPane.showMessageDialog(null, "Desconectado com sucesso");
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Erro ao desconectar! \n");
        }
        
    }
 }
    

