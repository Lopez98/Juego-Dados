/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego.dado;

/**
 *
 * @author labing506
 */
public class JuegoDado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jugador juego = new Jugador();
        
        juego.setApuesta(1000);
        System.out.println(juego.Apostar());
        
    }
    
}
