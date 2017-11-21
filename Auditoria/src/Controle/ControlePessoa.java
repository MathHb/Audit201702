/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controle;

import Modelo.ModeloPessoa;
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
public class ControlePessoa {
    
    ConectaBanco connex = new ConectaBanco();
    ModeloPessoa mod = new ModeloPessoa();
    
    public void inserir(ModeloPessoa mod){
    
        connex.conexao();
        
        PreparedStatement pst;
        try {
            pst = connex.conn.prepareStatement("insert into pessoa(nome, telefone, documento, usuario_id )values(?,?,?,?)");
            pst.setString(1,mod.getNome());
            pst.setString(2, mod.getTelefone());
            pst.setString(3,mod.getDocumento());
            pst.setInt(4, mod.getCodUsuario());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(ControleUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    
    
    
    }
    
}
