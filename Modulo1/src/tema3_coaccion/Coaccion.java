
package tema3_coaccion;

/**
 * Uso de la Coacción 
 * Código de ejemplo del tema 3 de DS
 * página 111.
 * @author weltonvs
 */
public class Coaccion {
    public static double multiplicarPorDos(double i){
        return 2*i;
    }
    
    public static void main(String[] args) {
        //Suministrando el mismo tipo como argumento al método.
        System.out.println(Coaccion.multiplicarPorDos(5.5));// resultado 11.0        
        System.out.println(Coaccion.multiplicarPorDos(5.0));// resultado 10.0
        
        //Suministrando otro tipo, en ese caso, entero como argumento al método.
        System.out.println(Coaccion.multiplicarPorDos(2));//resultado es 4.0
        
        // Se observa que el resultado de la última llamada es un double.
        // Porque los tipos son compatibles. Entero -> double.
    }
    
}
