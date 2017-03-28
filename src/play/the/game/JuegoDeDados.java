/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package play.the.game;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class JuegoDeDados {
    
    
    public void iniciar(){
        Dado d1 = new Dado();
        Dado d2 = new Dado();
        
        d1.lanzamiento();
        d2.lanzamiento();
        
        int resultado=d1.getladoVisible()+d2.getladoVisible();
        
        if(resultado==7){
            JOptionPane.showMessageDialog(null, "Has ganado - Es el 7 de la suerte");
            //System.out.println("Has ganado - Es el 7 de la suerte");
        }else{
            JOptionPane.showMessageDialog(null, "Has perdido - Sacaste un "+resultado);
            //System.out.println("Has perdido - Sacaste un "+resultado);
        }
    }
}
