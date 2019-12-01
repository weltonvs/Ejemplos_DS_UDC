
package cambiomonedas;

/**
 * Clase Cambio
 * Algoritmo de programación dinámica
 * @author weltonvs
 */
public class AppCambio {
    
    public static void main(String[] args){
        Cambio cambio = new Cambio(12, new int[]{1,6,10});
        for(int elemento: cambio.getVectorSeleccion()){
            System.out.println(elemento);
        }
        
        System.out.println("El cambio para 12 seria: " + cambio.getVectorSeleccion());
    }
    
    
}
