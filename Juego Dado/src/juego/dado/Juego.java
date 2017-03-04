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
public class Juego {
    Jugador apostador = new Jugador();
    
    
    private int apuesta;
    double resultado;
    int billetera;
    int dado1;
    int dado2;
    private int valorDados;
    String mensaje;
    
    private void dados(){
        Dado d1 = new Dado();
        Dado d2 = new Dado();
        
        dado1 = d1.Lanzar();
        dado2 = d2.Lanzar();
        
        valorDados = dado1 + dado2;
    }
    
    public void setApuesta(int apuesta){
        this.apuesta = apuesta;
    }
    public int getApuesta(){
        return apuesta;
    }
    
    public void logica(){
        /*while(apuesta<1000 || apuesta>billetera){
            
        }*/
        apostador.setApuesta(apuesta);
        apuesta = apostador.getApuesta();
        billetera = apostador.getBilletera();
        
        dados();
        
        switch(valorDados){
            case 2:
                resultado = apuesta - apuesta;
                break;
            case 3:
                resultado = apuesta - 2*apuesta;
                break;
            case 7:
                resultado = apuesta + 2*apuesta;
                break;
            case 11:
                resultado = apuesta;
                break;
            case 12:
                resultado = apuesta + apuesta;
                break;
            default:
                resultado = (apuesta*98.5)/100;
        }
        
        billetera += resultado;
        apostador.setBilletera(billetera);
    }
    
    public void jugar(){
        logica();
        
        switch (valorDados){
            case 2:
                mensaje = ("Pierde apuesta");
                break;
            case 3:
                mensaje = ("Perdio el doble");
                break;
            case 7:
                mensaje = ("Gano el doble");
                break;
            case 11:
                mensaje = ("No pierde");
                break;
            case 12:
                mensaje = ("Gana apuesta");
                break;
            default:
                mensaje = ("Perdio 1.5% de la apuesta");
        }

    }
}
