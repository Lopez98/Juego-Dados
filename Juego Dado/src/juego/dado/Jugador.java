/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego.dado;

/**
 *
 * @author Carlos López
 */
public class Jugador {
    private int billetera;
    private int apuesta;
    
    /* Metodo constructor*/
    public Jugador() {
        this.billetera = 1000000;
    }
    
    /* Metodos Getter y Setter*/
    public int getBilletera(){
        return billetera;
    }
    
    public void setBilletera(int billetera){
        this.billetera = billetera;
    }
    
    public int getApuesta(){
        return apuesta;
    }
    
    public void setApuesta(int apuesta){
        this.apuesta = apuesta;
        this.billetera -= apuesta;
    }
}
