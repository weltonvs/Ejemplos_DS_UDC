/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

/**
 *
 * @author weltonvs
 */
public class VisualizarCaja {
    public static void main(String[] args){
        Caja caja_1 = new Caja();
        Caja caja_2 = new Caja(5);
        System.out.println("El valor de caja 1 es:" + caja_1.getValor());
        System.out.println("El valor de caja 2 es:" + caja_2.getValor());
    }
}
