/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego.dado;
import java.util.Random;

/**
 *
 * @author labing506
 */
public class Dado {
    
    
    public int Lanzar(){
        Random dado = new Random();
        return dado.nextInt(6)+1;
    }
    
}
