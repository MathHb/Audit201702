/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controle;

import Modelo.ModeloUsuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gennari
 */
public class ControleUsuario {
    
    ConectaBanco connex = new ConectaBanco();
    ModeloUsuario mod = new ModeloUsuario();
    
    public void inserir(ModeloUsuario mod){
    
        connex.conexao();
        
        PreparedStatement pst;
        try {
            pst = connex.conn.prepareStatement("insert into usuario(usuario, senha)values(?,?)");
            pst.setString(1, mod.getUsuario());
            pst.setString(2, mod.getSenha());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(ControleUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    
    
    
    }
    
}
