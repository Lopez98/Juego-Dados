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
public class Jugador {

    public Jugador(double billetera) {
        this.billetera = 1000000000;
    }

    double apuesta;
    double billetera;

    public void setBilletera(double billetera) {
        this.billetera = billetera;
    }
    
    
    
    Dado dado1 = new Dado();
    Dado dado2 = new Dado();
    
    public int jugar(){
        
        int valor1 = dado1.Lanzar();
        int valor2 = dado2.Lanzar();
        
        return  valor1 + valor2;
    }
    
    public void Apostar(){
        int valor = jugar();
        
        switch (valor){
            case 2:
                
                    
        } 
    }
}
