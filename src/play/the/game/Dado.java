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

import java.util.Random;

public class Dado {
    private int ladoVisible;
    
    public int getladoVisible(){
        return ladoVisible;
    }
    
    public void lanzamiento(){
        Random rnd = new Random();
        ladoVisible=1+rnd.nextInt(6);
    }
}
