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
    
    private double apuesta;
    private double billetera;
    private int valorDado;
    
    /*metodo constructor*/
    public Jugador() {
        this.billetera = 1000000000;
    }
    
    /* metodos getter y setter*/
    
    public void setApuesta(double apuesta) {
        this.apuesta = apuesta;
    }

    public double getApuesta() {
        billetera -= apuesta;
        return apuesta;
    }
    
    /*objetos dado*/
    Dado dado1 = new Dado();
    Dado dado2 = new Dado();
    
    /*metodo para obtener valor del lanzamiento*/
    public int jugar(){
        
        int valor1 = dado1.Lanzar();
        int valor2 = dado2.Lanzar();
        
        return  valor1 + valor2;
    }
    
    /*metodo para obtener la pèrdida*/
    public double Apostar(){
        int valor = jugar();
        
        double apuesta1 = getApuesta();
        
        switch (valor){
            case 2:
                apuesta1 -= 2*apuesta;
                valorDado = 2;
                break;
            case 3:
                apuesta1 -= 3*apuesta;
                valorDado = 3;
                break;
            case 7:
                apuesta1 += apuesta;
                valorDado = 7;
                break;
            case 11:
                apuesta1 -= apuesta;
                valorDado = 11;
                break;
            case 12:
                apuesta1 = apuesta;
                valorDado = 12;
                break;
            default:
                apuesta1 -= 2*(apuesta/100)*1.5;
                valorDado = 0;
        }
        return apuesta1; 
    }
    
    /*metodo para restar perdida a la billetera*/
    public void jugado(){
        double perdida = Apostar();
        
        billetera -= perdida;
        
        switch (valorDado){
            case 2:
                System.out.println("Pierde apuesta");
                break;
            case 3:
                System.out.println("Perdio el doble");
                break;
            case 7:
                System.out.println("Gano el doble");
                break;
            case 11:
                System.out.println("No pierde");
                break;
            case 12:
                System.out.println("Gana apuesta");
                break;
            default:
                System.out.println("Perdio 1.5% de la apuesta");
        }
        
    }
}
