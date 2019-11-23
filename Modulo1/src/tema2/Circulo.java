
package tema2;

/**
 * Clase Circulo - Utilizado para el ejemplo de atributos finales.
 * Constantes.
 * @author weltonvs
 */
public class Circulo {
    
    public int radio;
    public static final double PI = 3.1416;
    
    public Circulo(int radio){
        this.radio = radio;        
    }
    
    public double areaCirculo(){
        return PI * radio * radio;
    }
}




