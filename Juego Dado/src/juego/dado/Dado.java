/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego.dado;
    import java.util.Random;

/**
 *
 * @author Carlos López
 */
public class Dado {
    Random dado = new Random();
    
    public int Lanzar(){
        return dado.nextInt(6)+1;
    }
}
