/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package play.the.game;

/**
 *
 * @author Gabriel
 */

import java.util.Scanner;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public class PlayTheGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JuegoDeDados play = new JuegoDeDados();
        do{
            play.iniciar();
            
            //System.out.println("¿Quiere seguir jugando?");
            //System.out.println("1 para seguir jugando - 2 para detener");
        //}while(elegirOpcion()==1);
        }while(JOptionPane.showConfirmDialog(null,"¿Quiere seguir jugando?", "Play the Game", JOptionPane.YES_NO_OPTION)==0);
        JOptionPane.showMessageDialog(null, "Gracias por jugar");
        //System.out.println("Gracias por jugar");
    }
    
    private static int elegirOpcion(){
        int opcion=0;
        boolean error;
        do{
            error=false;
            try{
                Scanner leer= new Scanner(System.in);
                opcion=leer.nextInt();
            }catch(InputMismatchException e){
                error=true;
            }
        }while(error||opcion<1||opcion>2);
        return opcion;
    }
    
}
