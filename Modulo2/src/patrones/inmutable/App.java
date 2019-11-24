/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.inmutable;

/**
 * Clase App
 * Probar las clases inmutables
 * @author weltonvs
 */
public class App {
    
    public static void main(String[] args) {
        PuntoInmutable punto = new PuntoInmutable(4, 5);
        System.out.println("El primer punto tiene x=" + punto.getX() + " y el valor de y=" + punto.getY());
        System.out.println("El hash del punto es:" + punto.hashCode());
        System.out.println("Modificando el punto anterior con x=10 e y=20");
        punto = punto.mover(10, 20);
        System.out.println("El nuevo valor de x=" + punto.getX() + " y=" + punto.getY());
        System.out.println("El hash del nuevo punto es:" + punto.hashCode());
    }
    
}
