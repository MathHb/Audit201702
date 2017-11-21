/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package auditoria;


import Controle.ConectaBanco;
import Controle.ConectaLogin;
import Controle.ControleUsuario;
import telas.FrmLogin;

/**
 *
 * @author Gennari
 */
public class Auditoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FrmLogin frmlogin = new FrmLogin();
        frmlogin.setVisible(true);
        
        ConectaBanco conecta = new ConectaBanco();
        
        //conecta.conexao();
                
       
        
        
    }
    
}
