/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controle;

import Modelo.ModeloLogin;
import Modelo.ModeloUsuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gennari
 */
public class ConectaLogin {
    
     ConectaBanco connex = new ConectaBanco();
     ModeloLogin mod = new ModeloLogin();
     
     public int codUsuario;
     
      public int buscaCod(String usuario,  String senha){
        
        connex.conexao();
        
        try {
            connex.executaSql("select * from usuario where usuario ='"+ usuario +"' and senha ='" + senha + "'");
            connex.rs.first();
            codUsuario = connex.rs.getInt("cod_usuario");
            
            
            
          
            
        } catch (SQLException ex) {
            Logger.getLogger(ConectaLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        return codUsuario;
    }
    
}
